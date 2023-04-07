package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntervalArrayAnalysisTest {

    @Test
    void testsumTwoMin() throws Exception {
        Object[] numbers = {-12, -12, -12, 21, 9, 15, 25, 25, 30, 1, 1, 1, 5, 9};
        var result = IntervalArrayAnalysis.sumTwoMin(numbers);
        assertThat(result).isEqualTo(-11);

        Object[] numbers1 = {};
        Throwable thrown = assertThrows(Exception.class, () -> IntervalArrayAnalysis.sumTwoMin(numbers1));
        assertThat(thrown.getMessage()).isEqualTo("Couldn't calculate the amount");

        Object[] numbers2 = {"-12", "21", "9"};
        Throwable thrown1 = assertThrows(Exception.class, () -> IntervalArrayAnalysis.sumTwoMin(numbers2));
        assertThat(thrown1.getMessage()).isEqualTo("Couldn't calculate the amount");

    }
}
