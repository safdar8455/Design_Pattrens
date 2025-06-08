# Factory Pattern Example in Java

This project demonstrates the **Factory Design Pattern** in Java. The Factory Pattern is a creational pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

---

## Class Diagram
![UML Diagram](diagram.png)

## Code Explanation

### 1. `Employee.java`

This is an interface with a method `Salary()` that must be implemented by all employee types.

```java
interface Employee {
    public int Salary();
}
```

---

### 2. `AndroidDev.java`

Implements `Employee` and provides a specific salary and greeting for Android Developers.

```java
public class AndroidDev implements Employee {
    @Override
    public int Salary() {
        System.out.println("Greeting for Adnroid Developer");
        return 5000;
    }
}
```

---

### 3. `ApplicationDev.java`

Implements `Employee` and provides a specific salary and greeting for Application Developers.

```java
public class ApplicationDev implements Employee {
    @Override
    public int Salary() {
        System.out.println("Greeting for Application Developer");
        return 7000;
    }
}
```

---

### 4. `Factory.java`

Contains the factory method `getEmployee(String EmpType)` that returns an instance of the appropriate employee type based on the input.

```java
class Factory {
    public Employee getEmployee(String EmpType) {
        if (EmpType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
            return new AndroidDev();
        } else if (EmpType.trim().equalsIgnoreCase("APPLICATION DEVELOPER")) {
            return new ApplicationDev();
        } else {
            return null;
        }
    }
}
```

---

### 5. `FactoryMain.java`

Demonstrates how to use the factory to create different types of employees and get their salaries.

```java
class FactoryMain {
    public static void main(String[] args) {
        // For ANDROID DEVELOPER object
        Employee emp1 = new Factory().getEmployee("ANDROID DEVELOPER");
        int androidDevSalary = emp1.Salary();
        System.out.println("Salary of Android Developer is : " + androidDevSalary);

        // For APPLICATION DEVELOPER object
        Employee emp2 = new Factory().getEmployee("APPLICATION DEVELOPER");
        int applicationDevSalary = emp2.Salary();
        System.out.println("Salary of Application Developer is : " + applicationDevSalary);
    }
}
```

---

## How It Works

- The `Factory` class decides which subclass of `Employee` to instantiate based on the input string.
- The client (`FactoryMain`) does not need to know the details of object creation.
- This makes the code more flexible and easier to maintain.

---

## Run the Example

Compile all `.java` files and run `FactoryMain`:

```sh
javac *.java
java FactoryMain
```

You will see output similar to:

```
Greeting for Adnroid Developer
Salary of Android Developer is : 5000
Greeting for Application Developer
Salary of Application Developer is : 7000
```