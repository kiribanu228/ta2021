package Lab.Lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lab1ApplicationTests {

    @Autowired
        Lab1Application lab1;
    
    @Test
    void test1() {
        assertEquals(10,lab1.solve(1));
        assertEquals(5,lab1.solve(2));
    }
}
