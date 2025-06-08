
// Eager way of creating Singleton Object

public class Jalebi {
    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getJalebi(){
        return jalebi;
    }
}

/*
Commit 1: Add Jalebi class with eager singleton implementation

- Created a class named Jalebi.
- Implemented eager initialization of the singleton instance.
- Provided a public static method getJalebi() to access the singleton instance.
- Ensured only one instance of Jalebi can exist.
*/
