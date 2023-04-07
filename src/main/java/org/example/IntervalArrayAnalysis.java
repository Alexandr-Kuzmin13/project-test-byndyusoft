package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class IntervalArrayAnalysis {

    private static final Logger LOGGER = Logger.getLogger(IntervalArrayAnalysis.class.getName());

    public static int sumTwoMin(Object[] numbers) throws IncorrectDataException {

        List<Predicate<Object>> predicates = new ArrayList<>();

        predicates.add(x -> Arrays.equals((Object[]) x, new Object[]{}));
        predicates.add(x -> !(Arrays.stream(((Object[]) x))
            .allMatch(y -> y instanceof Integer)));
        predicates.add(x -> ((Object[]) x).length > Integer.MAX_VALUE - 2);

        for (var predicate : predicates) {
            if (predicate.test(numbers)) {
                throw new IncorrectDataException("Couldn't calculate the amount");
            }
        }

        Arrays.sort(numbers);
        LOGGER.info("calculation result = " + ((int) numbers[0] + (int) numbers[1]));
        return (int) numbers[0] + (int) numbers[1];
    }
}
