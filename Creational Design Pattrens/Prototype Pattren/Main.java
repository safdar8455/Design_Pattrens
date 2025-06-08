public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Creating Prototype Object");

        ConnectionNetwork connectionNetwork = new ConnectionNetwork();
        connectionNetwork.setIP("192.168.100.1");
        connectionNetwork.loadVeryImportantData();
        System.out.println(connectionNetwork);

        try {
            ConnectionNetwork clonableCN = (ConnectionNetwork)connectionNetwork.clone();
            System.out.println(clonableCN);
            
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

    }
}
