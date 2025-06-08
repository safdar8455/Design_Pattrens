# Prototype Pattern Example in Java

This project demonstrates the **Prototype Design Pattern** using a simple network connection scenario. The Prototype Pattern is a creational design pattern that enables object cloning, allowing you to create new objects by copying existing ones. This is particularly useful when object creation is resource-intensive or complex.

---

## Files

- [`Main.java`](Main.java): Contains the main method to demonstrate how cloning works in practice.
- [`ConnectionNetwork.java`](ConnectionNetwork.java): Implements a network connection class that supports cloning via the Prototype Pattern.

---

## Detailed Explanation

### 1. `ConnectionNetwork` Class

- **Purpose:**  
  Models a network connection with an IP address and some "very important data".
- **Implements `Cloneable`:**  
  This allows instances of `ConnectionNetwork` to be cloned using the `clone()` method.
- **Fields:**  
  - `IP`: Stores the IP address of the connection.
  - `veryImportantData`: Stores data that is expensive to load.
- **Key Methods:**
  - `loadVeryImportantData()`:  
    Simulates a slow operation (like loading data from a remote server) by pausing for 9 seconds using `Thread.sleep(9000)`. After the pause, it sets and returns a string indicating the data is loaded.
  - `clone()`:  
    Uses the default shallow copy provided by `Object.clone()`. This means all fields are copied as-is.
  - Getters and setters for both fields.
  - `toString()`:  
    Returns a string representation of the object, showing the IP and the loaded data.

### 2. `Main` Class

- **Purpose:**  
  Demonstrates how to use the `ConnectionNetwork` class and the Prototype Pattern.
- **Key Steps:**
  1. Prints a message indicating the prototype object is being created.
  2. Creates a new `ConnectionNetwork` object.
  3. Sets its IP address.
  4. Calls `loadVeryImportantData()` to simulate loading expensive data (waits 9 seconds).
  5. Prints the original object.
  6. Clones the object using the `clone()` method.
  7. Prints the cloned object.
  8. Handles any exceptions that might occur during cloning.

---

## Output Example

```
Creating Prototype Object
192.168.100.1 : Very Important data is loaded.......
192.168.100.1 : Very Important data is loaded.......
```

- The first line is printed immediately.
- The next line appears after a 9-second delay (while loading data).
- The final line appears instantly, showing the cloned object.

---

## Why Use the Prototype Pattern?

- **Efficiency:**  
  Avoids repeating expensive or complex initialization logic. For example, loading data from a slow source only once.
- **Cloning:**  
  Quickly creates new objects with the same state as an existing one, without repeating the setup process.
- **Flexibility:**  
  Can be used to create objects at runtime without knowing their exact types.

---

## How to Run

1. **Compile the Java files:**
   ```
   javac ConnectionNetwork.java Main.java
   ```
2. **Run the main class:**
   ```
   java Main
   ```

---

## Notes

- The `Thread.sleep(9000)` in `loadVeryImportantData()` is just for demonstration. In real applications, this could represent a slow database call, file read, or network operation.
- Cloning creates a new object with the same data, but they are separate instances in memory.
- Both the original and the clone share the same data values, but changes to one will not affect the other.

---

**Summary:**  
This project shows how the Prototype Pattern can help you avoid expensive object creation by cloning an already-initialized object, making your code more efficient and responsive.