# Singleton Breaking in Java

This project demonstrates how the Singleton design pattern can be broken using Reflection, Serialization/Deserialization, and Cloning, and how to prevent these issues.

---

## What is the Singleton Pattern?

The Singleton pattern ensures that a class has only one instance and provides a global point of access to it. It is commonly used for resources like configuration, logging, or thread pools.

---

## How Singleton Can Be Broken

### 1. Reflection

Reflection can access the private constructor and create a new instance, breaking the singleton property.

### 2. Serialization/Deserialization

Serialization followed by deserialization creates a new instance, breaking the singleton.

### 3. Cloning

Cloning an object creates a new instance, breaking the singleton.

---

## How to Prevent Singleton Breaking

- **Reflection:** Throw an exception in the constructor if an instance already exists.
- **Serialization:** Implement `readResolve()` to return the existing instance.
- **Cloning:** Override `clone()` to return the existing instance.
- **Enum:** Use enum to implement Singleton, which is safe from all above attacks.

---

## Class Diagram

```mermaid
classDiagram
    class Samosa {
        -static Samosa samosa
        -Samosa()
        +static Samosa getSamosa()
        +Object readResolve()
        +Object clone()
    }
    class Samosa2 {
        <<enum>>
        +test()
    }
    class SingletonBreaking
    SingletonBreaking --> Samosa
    SingletonBreaking --> Samosa2