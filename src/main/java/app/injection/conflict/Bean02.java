package app.injection.conflict;

public class Bean02 {
    private Bean01 bean01;

    public Bean02() {
    }

    public void setBean01(Bean01 bean01) {
        this.bean01 = bean01;
    }

    @Override
    public String toString() {
        return "Bean02";
    }
}
