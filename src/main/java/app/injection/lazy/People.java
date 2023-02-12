package app.injection.lazy;

public class People {
    static {
        System.out.println("static init block");
    }
    {
        System.out.println("init block");
    }
    public People(){
        System.out.println("People class constructor init");
    }
}
