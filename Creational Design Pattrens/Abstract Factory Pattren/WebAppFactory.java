public class WebAppFactory extends AbstractEmployeeFactory{

    @Override
    public Employee createEmployee() {
        return new WebAppDev();
    }
    
}


/**
 * Commit Explanation:
 * Added WebAppFactory class as a concrete implementation of AbstractEmployeeFactory.
 * This factory overrides the createEmployee() method to return a new instance of WebAppDev,
 * adhering to the Abstract Factory design pattern for creating related objects without specifying their concrete classes.
 */