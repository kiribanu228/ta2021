package Lab5.Lab5;

import java.util.ArrayList;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lab5ApplicationTests {
Lab5Application lab5;
	@Test
	void contextLoads() {
            ArrayList<Info> list = new ArrayList<Info>();
            String a = null;
            Random rand = new Random();
            Info obj = new Info(a, (short) rand.nextInt(100));
            list.add(obj);
           assertEquals((1),lab5.jumpSearch(list, 99));
           assertEquals((-1),lab5.linearSearch(list, 20, 99));
	}

}
