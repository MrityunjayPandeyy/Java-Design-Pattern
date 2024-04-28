package creational.singlton;

public class SingltonMain {
    public static void main(String[] args) {
        SingltonObject instaSingltonObject = new SingltonObject("11");
        System.out.println(instaSingltonObject.toString());
        SingltonObject instaSingltonObject1 = new SingltonObject("13");
        System.out.println(instaSingltonObject1.toString());
    //enum approach
    SingltonObjectEnum instaSingltonObject2 = SingltonObjectEnum.INSTANCE;
    System.out.println(instaSingltonObject2.getValue());
    instaSingltonObject2.setValue(11);
    System.out.println(instaSingltonObject2.getValue());
    instaSingltonObject2.setValue(12);
    System.out.println(instaSingltonObject2.getValue());
    
    }
    
}
