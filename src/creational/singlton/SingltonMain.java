package creational.singlton;

public class SingltonMain {
    public static void main(String[] args) {
        SingltonObject instaSingltonObject = new SingltonObject("11");
        System.out.println(instaSingltonObject.toString());
        SingltonObject instaSingltonObject1 = new SingltonObject("13");
        System.out.println(instaSingltonObject1.toString());
    }
    
}
