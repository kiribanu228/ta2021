package Exam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExamApplicationTests {
ExamApplication Exam1;
	@Test
	void contextLoads() {
            assertEquals(2,Exam1.solve(1));
            assertEquals(2,Exam1.solve(2));
            assertEquals(2,Exam1.solve(3));
            assertEquals(2,Exam1.solve(4));
            assertEquals(2,Exam1.solve(5));
	}

}
