package creational.factory;

public class ProductOwner implements EmployeeInterface {

    @Override
    public int salary() {
        // TODO Auto-generated method stub
        System.out.println("Getting  salary for Product Owner");
        return 1000;
    }
    
    
}
