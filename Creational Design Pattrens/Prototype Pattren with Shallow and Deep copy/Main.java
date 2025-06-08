public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating Prototype Object...");
        NetworConnection networConnection = new NetworConnection();
        networConnection.setIpAddress("192.162.100.1");
        networConnection.loadingImportantData();
        System.out.println(networConnection);

        try {
            // Shallow Copy Object in prototype pattren
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
