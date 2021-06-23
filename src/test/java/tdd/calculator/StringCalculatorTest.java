package tdd.calculator;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.stream;
import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @Test
    public void startHere() {
        assertThat(4).isEqualTo(5);
    }

    @Test
    public void AddOneNumberManyDigitsGivesNumber() {
        assertThat(add("100")).isEqualTo(100);
    }

    @Test
    public void AddManyNumbersGivesTheirSum() {
        assertThat(add("10,20,30")).isEqualTo(60);
    }

    private Integer add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        return stream(numbers.split(",")).mapToInt(Integer::parseInt).sum();
    }

}
