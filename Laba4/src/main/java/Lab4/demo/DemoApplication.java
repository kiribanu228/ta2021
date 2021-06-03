package Lab4.demo;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        String a = "Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar. The Big Oxmox advised her not to do so, because there were thousands of bad Commas, wild Question Marks and devious Semikoli, but the Little Blind Text didn’t listen. She packed her seven versalia, put her initial into the belt and made herself on the way. When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the Line Lane. Pityful a rethoric question ran over her cheek, then she continued her way. On her way she met a copy. The copy warned the Little Blind Text, that where it came from it would have been rewritten a thousand times and everything that was left from its origin would be the word \"and\" and the Little Blind Text should turn around and return to its own, safe country. But nothing the copy said could convince her and so it didn’t take long until a few insidious Copy Writers ambushed her, made her drunk with Longe and Parole and dragged her into their agency, where they abused her for their";
        String str;
        str = a.replace('.', ' ');
        a = str.replace(',', ' ');
        str = a.replace(':', ' ');
        a = str.replace(";", " ");

        System.out.println(a);
        System.out.println("Words = " + CountWords(str));
        System.out.println("Words unique = " + CountWordsUnique(str));
        System.out.println("No letter M = " + NoM(str));
        System.out.println("4 differen letters count = " + ForDefferenLetters(str));
        EightLetterSiquenses(str);
        ForWords(a);
        a = Clear();
        System.out.println("Clear" + a);
    }

    public static String Clear() {
        return "";
    }

    public static int CountWords(String str) {

        String[] words = str.split("\\s+");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                count++;
            }
        }
        return count;
    }

    public static int NoM(String str) {
        int count = 0;
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf("m") == -1) {
                count++;
            }
        }
        return count;
    }

    //7.Визначити перші 8 трьохлітерні послідовності у словах тексту, що зустрічаються найчастіше
    public static void EightLetterSiquenses(String str) {
        String[] words = str.split("\\s+");

        ArrayList<String> list = new ArrayList<String>();

        //видяляємо слова менші за 3
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 3) {
                list.add(words[i]);
            } else if (words[i].length() > 3) {
                for (int j = 0; j < words[i].length() - 2; j++) {
                    list.add(words[i].substring(j, j + 3));
                }
            }

        }
        int[] arr = new int[list.size()];

        // підраховуємо кількість слів
        for (int s = 0; s < list.size(); s++) {
            for (int m = 0; m < list.size(); m++) {
                if (list.get(s).equals(list.get(m))) {
                    arr[s]++;
                }
            }
        }

        // сортуємо
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    String s = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, s);
                }
            }
        }

        // Онулюємо дублікати
        for (int s = 0; s < list.size() - 1; s++) {
            for (int m = s + 1; m < words.length; m++) {
                if (list.get(s) != null && list.get(s).equals(list.get(m))) {
                    list.set(m, null);
                }
            }
        }

        //Беремо перші 8
        int index = 0;
        System.out.println("\n8 three-letters combinations:");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                System.out.println(list.get(i));
                index++;
                if (index == 9) {
                    break;
                }
            }
        }
        System.out.println(" ");

    }

    public static int ForDefferenLetters(String str) {
        String[] words = str.split("\\s+");
        int[] arr = new int[words.length];
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            // Рахуємо кількість унікальних символів
            long numberOfDistinctChars = words[i].chars().distinct().count();
            if (numberOfDistinctChars == 4) {
                count++;
            }
        }
        return count;
    }

    public static void ForWords(String str) {

        String[] words = str.split("\\s+");
        int[] arr = new int[words.length];

        // підраховуємо кількість слів
        for (int s = 0; s < words.length; s++) {
            for (int m = 0; m < words.length; m++) {
                if (words[s].equals(words[m])) {
                    arr[s]++;
                }
            }
        }

        // сортуємо
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    String s = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = s;
                }
            }
        }

        // Онулюємо дублікати
        for (int s = 0; s < words.length - 1; s++) {
            for (int m = s + 1; m < words.length; m++) {
                if (words[s] != null && words[s].equals(words[m])) {
                    words[m] = null;
                }
            }
        }

        //Беремо перші 4
        int index = 0;
        System.out.println("\n4 words:");
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                System.out.println(words[i]);
                index++;
                if (index == 4) {
                    break;
                }
            }
        }
        System.out.println(" ");
    }

    public static int CountWordsUnique(String str) {

        String[] words = str.split("\\s+");

        for (int s = 0; s < words.length - 1; s++) {
            for (int m = s + 1; m < words.length; m++) {
                if (words[s] != null && words[s].equals(words[m])) {
                    words[m] = null;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i] != null && words[i].length() > 0) {
                count++;
            }
        }

        return count;
    }
}
