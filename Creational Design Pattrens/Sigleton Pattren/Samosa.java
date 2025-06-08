
// Lazy way to creation singleton object
// Never Consider Multiple threading concept

// public class Samosa {
//     private static Samosa samosa;

//     public static Samosa getSamosa(){
//         if (samosa==null) {
//             samosa = new Samosa();  
//         }
//         return samosa;
//     }

// }

// Lazy way to creation singleton object
// With Consideration of Multiple threading concept

public class Samosa {
    private static Samosa samosa;

    public static Samosa getSamosa(){
        if (samosa==null) {
            synchronized(Samosa.class){
                if (samosa==null) {
                    
                    samosa = new Samosa();  
                }
                
                
            }
        }
        return samosa;
    }

}


/*
Commit 1: Added lazy initialization singleton pattern without thread safety.
- Implemented a static method to return the singleton instance.
- Instance is created only when needed.

Commit 2: Improved singleton pattern with double-checked locking for thread safety.
- Used synchronized block to ensure only one instance is created in multi-threaded environments.
- Double-checked locking minimizes synchronization overhead.
*/