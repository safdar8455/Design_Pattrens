import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class SingletonBreaking {

    public static void main(String[] args) throws Exception, CloneNotSupportedException{
        // Samosa s1 = Samosa.getSamosa();
        // System.out.println(s1.hashCode());

        // reflection API for breaking singleton pattren
        // Solution is use enum
        
        // Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // Samosa s2 = constructor.newInstance();
        // System.out.println(s2.hashCode());
        
        // Samosa2 s3 = Samosa2.INSTANCE;
        // System.out.println(s3.hashCode());
        // Samosa2.test();
        // Samosa2 s4 = Samosa2.INSTANCE;
        // System.out.println(s4.hashCode());
        
        // Deserilization for breaking singleton pattren
        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(s1);
        System.out.println("serilization is done.........");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        
        Samosa s5 = (Samosa)ois.readObject();
        System.out.println(s5.hashCode());
        
        // Cloning for breaking singleton pattren

        Samosa s6 = (Samosa)s1.clone();
        System.out.println(s6.hashCode());
        
    }
    
}

enum Samosa2{
    INSTANCE;
    public static void test(){
        System.out.println("testing");
    }
}

class Samosa implements Serializable, Cloneable {

    private static Samosa samosa;
    private Samosa(){
        // Solution 1
        // prevent from reflection API 
        // throw new RuntimeException("you are trying to breaking singleton pattren with api reflection");

    }

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
    public Object readResolve(){
    return samosa;
    }

    public Object clone() throws CloneNotSupportedException{
    // creationg clone
    // return super.clone();

    // Solve for preventing from clone
    return samosa;
}
}
