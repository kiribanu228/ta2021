package Lab.Lab1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1Application {

    public int solve(int x){
        if(x == 0){return Integer.MAX_VALUE;}
        return 10/x;
    }
}
