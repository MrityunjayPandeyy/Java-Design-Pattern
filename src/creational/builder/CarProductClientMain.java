package creational.builder;

public class CarProductClientMain {
    public static void main(String[] args) {
        CarProduct carProduct=new CarProduct.CarProductBuilder()
        .setCarType("benz")
        .setColor("yellow")
        .setName("B6").build();

        System.out.println("MyCar is "+carProduct);

        CarProduct carProductbmw=new CarProduct.CarProductBuilder()
        .setCarType("bmw")
        .setName("A6").build();
        System.out.println("MyCar is "+carProductbmw);
    }

}
