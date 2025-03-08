import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitCycleQuizTest {

    @BeforeEach
    public void beforeEach() {
        System.out.println("Hello!");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Bye!");
    }


    @Test
    public void JUnitQuiz3() {
        System.out.println("This is a first test");
    }

    @Test
    public void JUnitQuiz4() {
        System.out.println("This is a second test");
    }
}
