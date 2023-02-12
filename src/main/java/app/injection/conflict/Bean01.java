package app.injection.conflict;

public class Bean01 {
    private Bean02 bean02;

    public Bean01() {
    }

    public void setBean02(Bean02 bean02) {
        this.bean02 = bean02;
    }


    @Override
    public String toString() {
        return "Bean01";
    }
}
