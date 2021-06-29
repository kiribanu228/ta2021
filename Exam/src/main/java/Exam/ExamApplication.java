package Exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class ExamApplication {
      
    public static float solve(float x){    
    float f;
        for(x = 1; x <= 90; x++){
          f =(2/((6*x)-5));
            return 0;
            } 
        return 0;
       }
    
	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args); 
              float f = 1;
            float x;
            int k = 0;
        for(x = 1; x <= 90; x++){
          f =(2/((6*x)-5));
            System.out.println(f);
            k++;          
        }
        System.out.println("Amount = " + k);
    }  
        
}

       

