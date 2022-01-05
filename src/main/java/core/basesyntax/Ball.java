package core.basesyntax;

public class Ball extends ColorSupplier {
    private String color;
    private int number;

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return getColor() + " " + getNumber();
    }
}
