

public class ConnectionNetwork implements Cloneable {

     ConnectionNetwork(){}

    private String IP;
    private String veryImportantData;

    public String getIP() {
        return IP;
    }
    public void setIP(String iP) {
        IP = iP;
    }
    public String getVeryImportantData() {
        return veryImportantData;
    }
    public void setVeryImportantData(String veryImportantData) {
        this.veryImportantData = veryImportantData;
    }

    public String loadVeryImportantData()throws InterruptedException{
        Thread.sleep(9000);
        return this.veryImportantData = "Very Important data is loaded.......";
    }
    @Override
    public String toString() {
        
        return IP + " : " + veryImportantData;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    

    
    
}