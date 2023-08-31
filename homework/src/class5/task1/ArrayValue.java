package class5.task1;

public record ArrayValue(int index, int value) {
    @Override
    public String toString() {
        return "[" +
                "index=" + index +
                ", value=" + value +
                ']';
    }
}
