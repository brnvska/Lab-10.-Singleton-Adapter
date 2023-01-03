package task2;

public enum Country {
    Ukraine("Ukraine"), USA("USA"), Poland("Poland");

    public final String string;

    private Country(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
