package Lab4.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabApplication.class, args);
	}
public class Main {

            /**
             *
             * @param args
             */
            public static void main(String[] args) {

		String a = "Hello world.  world,  I'am, programmer. world";
		String str;
		str = a.replace('.', ' ');
		a = str.replace(',', ' ');
		str = a.replace(':', ' ');
		a = str.replace(';', ' ');
		System.out.println(a);
		System.out.println("Words = " + CountWords(str));
		System.out.println("Words unique = " + CountWordsUnique(str));
		a = Clear();
		System.out.println("Clear" + a);

	}

	public static String Clear() {
		return "";
	}

	public static int CountWords(String str) {

		String[] words = str.split("\\s+");
		int count = 0;
            for (String word : words) {
                if (word.length() > 2) {
                    count++;
                }
            }
		return count;		
	}

	public static int CountWordsUnique(String str) {

		String[] words = str.split("\\s+");		


		for(int s = 0; s < words.length - 1; s++)
		{
			for(int m = s + 1; m < words.length; m++)
			{				
				if(words[s] != null && words[s].equals(words[m]))
				{					
					words[m] = null;
				}
			} 
		}

		int count = 0;
		for (int i = 0; i < words.length-1; i++) {
			if (words[i] != null && words[i].length() > 2) {
				count++;
			}
		}

		return count;		
	}
        }
}
