package racingcar.utils;

public class Randoms {

    public static int pickNumberInRange(int startInclusive, int endInclusive) {
        return (int)((Math.random() * ((endInclusive + 1) - startInclusive)) + startInclusive);
    }
}
