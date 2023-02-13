package app.withoutAnnot;

public class HeavyEngine implements Engine {
  public void init(){
      System.out.println("Init method of HeaveEngine");
  }

    @Override
    public String toString() {
        return "HeavyEngine{}";
    }
}
