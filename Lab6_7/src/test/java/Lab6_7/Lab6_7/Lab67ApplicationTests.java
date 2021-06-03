package Lab6_7.Lab6_7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lab67ApplicationTests {
  @Autowired
  Lab67Application lab6;
	@Test
	void contextLoads() {
            assertEquals(12,lab6.solve(10));
            assertEquals(21,lab6.solve(17));
            assertEquals(16,lab6.solve(14));
            assertEquals(14,lab6.solve(12));
            assertEquals(1,lab6.solve(1));
            assertEquals(11,lab6.solve(9));
            
	}

}
