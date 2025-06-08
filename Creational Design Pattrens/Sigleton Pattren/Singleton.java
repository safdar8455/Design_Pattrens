class Singleton {
    public static void main(String[] args) {

        // Lazy Initialization Singleton
        // Samosa Object Call first time
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        
        // Samosa Object Call second time
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

        // In this lazy way creation of singleton object that print same hashCode this means that object create only one time 
        // in lazy way creation of singleton the object will create when call the getSamosa method and not consider multiple threading concept

        // Lazy Initialization Singleton
        // Jalebi Object Call first time
        Jalebi jalebi1 = Jalebi.getJalebi();
        System.out.println(jalebi1.hashCode());

        // Jalebi Object Call first time
        Jalebi jalebi2 = Jalebi.getJalebi();
        System.out.println(jalebi2.hashCode());

        // In this Eager way creation of singleton object that print same hashCode this means that object create only one time
        // In Eager way creation of singleton the object is already created we call its method or not

        
    }
}

