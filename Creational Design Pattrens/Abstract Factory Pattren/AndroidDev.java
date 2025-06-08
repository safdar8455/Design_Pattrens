public class AndroidDev implements Employee {

    @Override
    public int Salary() {
       return 8000;
    }

    @Override
    public String Name() {
        System.out.println("I am Android Developer");
        return "I am Android Developer";
    }
    
}

/**
 * Commit Explanation:
 * Added AndroidDev class implementing Employee interface.
 * - Salary() returns a fixed salary for Android developers.
 * - Name() prints and returns the developer's role.
 */