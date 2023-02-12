package app;

public class SimpleCalculator implements Calculator{
    public SimpleCalculator(){
        System.out.println("Construcor was started");
    }

    @Override
    public int sum(int a, int b){
        return a + b;
    }

    @Override
    public int diff(int a, int b){
        return a - b;
    }

    public void init() {
        System.out.println("Вызван init() SimpleCalculator");
    }

    public void destroy(){
        System.out.println("Destroy was started");
    }

    @Override
    public String toString(){
        return "Я простой калькулятор";
    }
}
