package Lab.Lab1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1Application {
    private int number;
    
    public Lab1Application(){
        number = 1;
    }
    
    public Lab1Application(int number){
        this.number = number;
    }

    public int solve() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number = " + number;
    }
    
    public String Plus(int value)
    {
        number += value;
        return Integer.toString(number);
    }
    
    public String Minus(int value)
    {
        number -= value;
        return Integer.toString(number);
    }
    
    public String Multiply(int value)
    {
        number *= value;
        return Integer.toString(number);
    }
    
    public String Divide(int value)
    {
        if(value == 0)
            return "Division by zero!";
        number /= value;
        return Integer.toString(number);
    }
}


