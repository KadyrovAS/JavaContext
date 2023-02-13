package app.withoutAnnot;

public class LightEngine implements Engine {
    public void init(){
        System.out.println("Init method of LightEngine");
    }
    @Override
    public String toString() {
        return "LightEngine{}";
    }
}
