package creational.singlton;

public class SingltonObject {
   private static SingltonObject instance;
   private String value;

    public SingltonObject(String value) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.value = value;


    }
    private static SingltonObject getInstacence(String value){
     if(instance == null){
         instance = new SingltonObject(value);
     }
     return instance;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Object is created for Singlton Pattern"+this.value;
    }
    
    
}
