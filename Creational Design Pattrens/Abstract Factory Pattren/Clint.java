public class Clint {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidFactory());
        e1.Name();
        System.out.println(e1.Salary());
        
        Employee ee2 = EmployeeFactory.getEmployee(new WebAppFactory());
        ee2.Name();
        System.out.println(ee2.Salary());
    }
}


/*
Commit: Added client code to demonstrate the Abstract Factory Pattern.
This code creates Employee objects using different factories (AndroidFactory and WebAppFactory),
calls their Name() method, and prints their salaries.
*/