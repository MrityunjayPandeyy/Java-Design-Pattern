package creational.builder;

public class CarProduct {

    @Override
    public String toString() {
        return "{" +
            " carType='" + getCarType() + "'" +
            ", name='" + getName() + "'" +
            ", color='" + getColor() + "'" +
            "}";
    }
    private final String carType;
    private final String name;
    private final String color;

    public CarProduct(CarProductBuilder builder) {
        this.carType=builder.carType;
        this.name=builder.name;
        this.color=builder.color;
    }

    public String getCarType() {
        return this.carType;
    }


    public String getName() {
        return this.name;
    }


    public String getColor() {
        return this.color;
    }

  static class CarProductBuilder{
    private  String carType;
    private  String name;
    private  String color;

    public CarProductBuilder(){

    }
    public CarProductBuilder setCarType(String carType) {
        this.carType=carType;
        return this;
    }


    public CarProductBuilder setName(String name) {
        this.name=name;
        return this;
    }


    public CarProductBuilder setColor(String color) 
    {
        this.color=color;
        return this;
    }

    public CarProduct build() { 
        return new CarProduct(this);
    }

  }

}
