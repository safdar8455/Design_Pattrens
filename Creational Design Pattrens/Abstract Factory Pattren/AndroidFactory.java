public class AndroidFactory extends AbstractEmployeeFactory {

    @Override
    public Employee createEmployee() {
        return new AndroidDev();
    }
    
}

/**
 * Commit Explanation:
 * Added AndroidFactory class as a concrete implementation of AbstractEmployeeFactory.
 * This factory overrides createEmployee() to return an instance of AndroidDev,
 * enabling the Abstract Factory Pattern for employee creation.
 */