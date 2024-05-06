package creational.factory;

public class EmployeeFactory {
    public static EmployeeInterface getEmployee(String empType){
        EmployeeInterface emp = null;
        if(empType.equalsIgnoreCase("SolutionArchitect")){
            emp = new SolutionArchitect();
        }else if(empType.equalsIgnoreCase("ProductOwner")){
            emp = new ProductOwner();
        }
        return emp;
    }
    
}
