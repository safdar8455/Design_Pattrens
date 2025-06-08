# Prototype Pattern Example: Shallow and Deep Copy in Java

This project demonstrates the **Prototype Design Pattern** in Java, focusing on the difference between shallow and deep copying of objects. The main classes are `NetworConnection` and `Main`.

---

## 1. NetworConnection.java

This class represents a network connection with an IP address, some important data, and a list of domain names. It implements the `Cloneable` interface to support object cloning.

### Key Features

- **Fields**:  
  - `IpAddress`: The IP address of the connection.
  - `MostImportantData`: Simulated important data loaded with a delay.
  - `domain`: A list of domain names.

- **Methods**:
  - `loadingImportantData()`: Simulates loading data and populates the domain list.
  - `clone()`: Implements a **deep copy** of the object, including a new list for `domain`.

### Code

```java
public class NetworConnection implements Cloneable {

    private String IpAddress;
    private String MostImportantData;
    private List<String> domain = new ArrayList<String>();

    // Getters and setters...

    public String loadingImportantData() throws InterruptedException {
        domain.add("www.sts.org.pk");
        domain.add("www.nts.org.pk");
        domain.add("www.ots.org.pk");
        domain.add("www.joinpakarmy.pk");
        Thread.sleep(9000); // Simulate delay
        return this.MostImportantData = "Most Important sucessfully loaded.....";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Deep copy: create a new object and copy all fields
        NetworConnection networConnection = new NetworConnection();
        networConnection.setIpAddress(this.getIpAddress());
        networConnection.setMostImportantData(this.getMostImportantData());
        for (String d : this.getDomain()) {
            networConnection.domain.add(d);
        }
        return networConnection;
    }
}
```

**Explanation:**  
- The `clone()` method creates a new `NetworConnection` object and copies all fields, including a new list for `domain` (deep copy).
- The `loadingImportantData()` method simulates a time-consuming operation and fills the domain list.

---

## 2. Main.java

This class demonstrates how to use the `NetworConnection` class and its cloning functionality.

### Code

```java
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating Prototype Object...");
        NetworConnection networConnection = new NetworConnection();
        networConnection.setIpAddress("192.162.100.1");
        networConnection.loadingImportantData();
        System.out.println(networConnection);

        try {
            // Deep Copy Object in prototype pattern
            NetworConnection clonableNC = (NetworConnection) networConnection.clone();
            System.out.println(clonableNC);
            NetworConnection clonableNC2 = (NetworConnection) networConnection.clone();
            clonableNC.getDomain().remove(1);
            System.out.println(clonableNC);
            System.out.println(clonableNC2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
```

**Explanation:**  
- A `NetworConnection` object is created and initialized.
- The object is cloned twice using the deep copy `clone()` method.
- Modifying the domain list in one clone does **not** affect the other, demonstrating deep copy behavior.

---

## Output Example

```
Creating Prototype Object...
192.162.100.1 : Most Important sucessfully loaded..... : [www.sts.org.pk, www.nts.org.pk, www.ots.org.pk, www.joinpakarmy.pk]
192.162.100.1 : Most Important sucessfully loaded..... : [www.sts.org.pk, www.nts.org.pk, www.ots.org.pk, www.joinpakarmy.pk]
192.162.100.1 : Most Important sucessfully loaded..... : [www.sts.org.pk, www.ots.org.pk, www.joinpakarmy.pk]
192.162.100.1 : Most Important sucessfully loaded..... : [www.sts.org.pk, www.nts.org.pk, www.ots.org.pk, www.joinpakarmy.pk]
```

Notice how removing a domain from one clone does not affect the other, confirming the deep copy.

---

## Summary

- **Prototype Pattern** allows object cloning.
- **Deep Copy** ensures that changes to a clone do not affect the original or other clones.
- This example demonstrates how to implement and use deep copying in Java using the Prototype Pattern.

---
## Difference Between Shallow Copy and Deep Copy

| Aspect           | Shallow Copy                                         | Deep Copy                                              |
|------------------|-----------------------------------------------------|--------------------------------------------------------|
| **Definition**   | Copies the object and references to nested objects.  | Copies the object and creates new copies of nested objects. |
| **References**   | Original and copy share references to the same nested objects (e.g., lists, arrays). | Original and copy have completely independent nested objects. |
| **Memory**       | Less memory usage, as nested objects are shared.     | More memory usage, as everything is duplicated.        |
| **Changes**      | Changes to nested objects in the copy affect the original (and vice versa). | Changes to nested objects in the copy do **not** affect the original. |
| **Use Case**     | When you want a quick copy and don't mind shared references. | When you need a fully independent copy of the object and its contents. |
| **Example**      | `Object clone = original;` (for reference types)     | Manually copy all fields and nested objects, or use serialization. |

---

## Example in Java

### Shallow Copy

```java
List<String> list1 = new ArrayList<>();
list1.add("A");
List<String> list2 = list1; // Shallow copy
list2.add("B");
System.out.println(list1); // Output: [A, B]
```
*Both `list1` and `list2` refer to the same list.*

---

### Deep Copy

```java
List<String> list1 = new ArrayList<>();
list1.add("A");
List<String> list2 = new ArrayList<>(list1); // Deep copy
list2.add("B");
System.out.println(list1); // Output: [A]
System.out.println(list2); // Output: [A, B]
```
*`list1` and `list2` are independent lists.*

---

**Summary:**  
- Use **shallow copy** for performance and when shared references are acceptable.  
- Use **deep copy** when you need complete independence between the original and the copy.