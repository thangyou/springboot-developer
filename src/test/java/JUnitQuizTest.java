import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class JUnitQuizTest {

    @Test
    public void JUnitQuiz1() {
        String name1 = "gildong";
        String name2 = "gildong";
        String name3 = "gilsilver";

        // 1. 모든 변수가 Null이 아닌지 확인
        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();

        // 2. name1 == name2?
        assertThat(name1)
                .isEqualTo(name2)
                .isNotEqualTo(name3);

        // 3. name1 != name3?
//        assertThat(name1).isNotEqualTo(name3);
    }

    @Test
    public void JUnitQuiz2() {
        int num1 = 15;
        int num2 = 0;
        int num3 = -5;

        // 1. num1 양수인가
        assertThat(num1).isPositive();

        // 2. num2 0인가
        assertThat(num2).isZero();

        // 3. num3 음수인가
        assertThat(num3).isNegative();

        // 4. num1 > num2 ?
        assertThat(num1).isGreaterThan(num2);
        // 5. num3 < num2 ?
        assertThat(num3).isLessThan(num2);
    }



}
