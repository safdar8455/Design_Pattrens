class FactoryMain {
    public static void main(String[] args) {

        // For ANDROID DEVLOPER object

        Employee emp1 = new Factory().getEmployee("ANDROID DEVELOPER");

        int androidDevSalary = emp1.Salary();
        System.out.println("Salary of Android Developer is : "+androidDevSalary);

        // For APPLICATION DEVLOPER object

        Employee emp2 = new Factory().getEmployee("APPLICATION DEVELOPER");

        int applicationDevSalary = emp2.Salary();
        System.out.println("Salary of Application Developer is : "+applicationDevSalary);
    }

} 