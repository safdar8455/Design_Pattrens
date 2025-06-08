public class WebAppDev implements Employee{

    @Override
    public int Salary() {
       return 5000;
    }

    @Override
    public String Name() {
        System.out.println("I am Web Application Developer");
        return "I am Web Application Developer";
    }
    
}


/*
Commit Explanation:
Added the WebAppDev class implementing the Employee interface. 
This class provides concrete implementations for Salary() and Name() methods, 
representing a Web Application Developer with a fixed salary and a descriptive name.
*/