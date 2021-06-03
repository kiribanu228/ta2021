package Lab5.Lab5;

import java.util.ArrayList;
import java.util.Random;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Info {

    String name = "Hello";
    short age = 20;

    public Info(String name, short age) {
        this.name = name;
        this.age = age;
    }
}

@SpringBootApplication
public class Lab5Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab5Application.class, args);
        //26588
        ArrayList<Info> list = new ArrayList<Info>();
        Random rand = new Random();
        String abc = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        String a;
        for (int i = 0; i < 26588; i++) {
            a = "";
            for (int j = 0; j < rand.nextInt(20) + 1; j++) {
                a += abc.charAt(rand.nextInt(abc.length()));
            }
            Info obj = new Info(a, (short) rand.nextInt(100));
            list.add(obj);
        }
        System.out.println(list.size());

        // Сортування лінійним пошуком
        int x = 0;
        int index = 0;
        for (int i = 0; i < 100; i++) {
            while (true) {
                x = linearSearch(list, i, index);
                if (x != -1) {
                    Info obj = list.get(index);
                    list.set(index, list.get(x));
                    list.set(x, obj);
                    index++;
                } else {
                    break;
                }
            }
        }

       // for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i).age);
        //}

        // Пошук
        System.out.println(jumpSearch(list, 99));

    }

    public static int linearSearch(ArrayList<Info> list, int key, int from) {
        for (int i = from; i < list.size(); i++) {
            if (list.get(i).age == key) {
                return i;
            }
        }
        return -1;
    }

    public static int jumpSearch(ArrayList<Info> list, int x) {
        int n = list.size();

        int step = (int) Math.floor(Math.sqrt(n));

        int prev = 0;
        while (list.get(Math.min(step, n) - 1).age < x) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }

        while (list.get(prev).age < x) {
            prev++;

            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        if (list.get(prev).age == x) {
            return prev;
        }

        return -1;
    }

}
