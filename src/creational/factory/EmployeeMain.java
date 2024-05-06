package creational.factory;

public class EmployeeMain {
    public static void main(String[] args) {
        
    EmployeeInterface employee1 = EmployeeFactory.getEmployee("SolutionArchitect");
       System.out.println(employee1.salary());
       EmployeeInterface employee3 = EmployeeFactory.getEmployee("productOwner");
       System.out.println(employee3.salary());
        
    }
}
