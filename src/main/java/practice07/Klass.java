package practice07;

public class Klass {
    int number;

    public int getNumber() {
        return number;
    }

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return String.format("Class %s",number);
    }
}
