package net.chandol.lotto.domain;

public class LottoNumberItem {
    private static final int LOTTO_MIN_NUMBER = 1;
    private static final int LOTTO_MAX_NUMBER = 45;

    private int number;

    public LottoNumberItem(int number) {
        validateNumberRange(number);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    private static void validateNumberRange(int n) {
        if ((n < LOTTO_MIN_NUMBER) || (n > LOTTO_MAX_NUMBER)) {
            throw new IllegalArgumentException("유효하지 않은 범위의 번호입니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LottoNumberItem that = (LottoNumberItem) o;

        return number == that.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
