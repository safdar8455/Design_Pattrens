public class EmployeeFactory {

    public static Employee getEmployee(AbstractEmployeeFactory factory){
        return factory.createEmployee();
    }
    
}


/*
 * Explanation:
 * The EmployeeFactory class uses the Abstract Factory Pattern to create Employee objects.
 * The getEmployee method takes an AbstractEmployeeFactory as a parameter and calls its createEmployee method.
 * This allows for the creation of different types of Employee objects without specifying their concrete classes.
 */