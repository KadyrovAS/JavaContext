package app;

public class DifficultCalculator implements Calculator{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int diff(int a, int b) {
        return a - b;
    }

    public void init() {
        System.out.println("Вызван init() DifficultCalculator");
    }

    @Override
    public String toString(){
        return "Я сложный калькулятор";
    }
}
