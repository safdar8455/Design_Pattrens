# Builder Pattern Example in Java

This project demonstrates the **Builder Pattern** in Java by constructing a `User` object using a builder class.

## Files

- **Clint.java**: The main class that creates a `User` object using the builder.
- **User.java**: Contains the `User` class and its static inner `UserBuilder` class.

## How It Works

### Clint.java

```java
public class Clint {
    public static void main(String[] args) {
        User u1 = new User.UserBuilder()
            .setUserEmail("safdarse063@gmail.com")
            .setUserId("BSE-20S-063")
            .setUserName("Safdar Hussain")
            .Build();

        System.out.println(u1);
    }
}
```

#### Explanation

- The `main` method creates a new `User` object using the `UserBuilder` class.
- The builder methods (`setUserEmail`, `setUserId`, `setUserName`) are called in a chain to set the properties of the `User`.
- The `Build()` method finalizes the construction and returns the `User` object.
- The created `User` object is printed to the console.

### User.java

```java
public class User {

    private final String UserId;
    private final String UserName;
    private final String UserEmail;

    private User(UserBuilder builder){
        this.UserId = builder.UserId;
        this.UserName = builder.UserName;
        this.UserEmail = builder.UserEmail;
    }

    public String getUserId() {
        return UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    @Override
    public String toString() {
        return this.UserId + " : "+ this.UserName+" : "+this.UserEmail;
    }

    public static class UserBuilder {
        private String UserId;
        private String UserName;
        private String UserEmail;

        public UserBuilder(){}

        public UserBuilder setUserId(String userId) {
            UserId = userId;
            return this;
        }
        public UserBuilder setUserName(String userName) {
            UserName = userName;
            return this;
        }
        public UserBuilder setUserEmail(String userEmail) {
            UserEmail = userEmail;
            return this;
        }

        public User Build(){
            return new User(this);
        }
    }
}
```

### Explanation


- The `User` class has three private final fields: `UserId`, `UserName`, and `UserEmail`.
- The constructor for `User` is private and takes a `UserBuilder` object, copying its fields.
- Getter methods provide access to the fields.
- The `toString()` method returns a string representation of the user.
- The static inner class `UserBuilder` allows setting each field with methods that return the builder itself, enabling method chaining.
- The `Build()` method creates a new `User` object using the builder.

### Builder Pattern

The **Builder Pattern** is used to construct complex objects step by step. It is especially useful when an object has many optional parameters or when you want to avoid a constructor with many parameters.

#### Typical Structure

- The main class (`User`) has a static inner class (`UserBuilder`).
- The builder class provides methods to set each property and a `Build()` method to create the main object.

## Example Output

```
BSE-20S-063 : Safdar Hussain : safdarse063@gmail.com
```

## Usage

1. Compile all Java files:
   ```
   javac *.java
   ```
2. Run the main class:
   ```
   java Clint
   ```

---

**Note:** The builder pattern makes your code more readable and flexible, especially for objects with many fields.