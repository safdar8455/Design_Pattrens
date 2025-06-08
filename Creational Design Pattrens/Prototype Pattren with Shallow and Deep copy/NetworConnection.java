import java.util.ArrayList;
import java.util.List;

public class NetworConnection implements Cloneable {

    private String IpAddress;
    private String MostImportantData;
    private List<String> domain = new ArrayList<String>();

    
    
    public String getIpAddress() {
        return IpAddress;
    }
    public void setIpAddress(String ipAddress) {
        IpAddress = ipAddress;
    }
    public String getMostImportantData() {
        return MostImportantData;
    }
    public void setMostImportantData(String mostImportantData) {
        MostImportantData = mostImportantData;
    }

    @Override
    public String toString() { 
        return this.IpAddress +  " : " + this.MostImportantData + " : "+this.domain;
    }

    public String loadingImportantData() throws InterruptedException{
        domain.add("www.sts.org.pk");
        domain.add("www.nts.org.pk");
        domain.add("www.ots.org.pk");
        domain.add("www.joinpakarmy.pk");
        Thread.sleep(9000);
        return this.MostImportantData= "Most Important sucessfully loaded.....";
    }
   
    public List<String> getDomain() {
        return domain;
    }
    public void setDomain(List<String> domain) {
        this.domain = domain;
    }
    public void setDomain(String string, String string2) {
        throw new UnsupportedOperationException("Unimplemented method 'setDomain'");


    }

     @Override
    protected Object clone() throws CloneNotSupportedException {
        // Logic for Deep copy Object in Prototype Pattren
        NetworConnection networConnection = new NetworConnection();
        networConnection.setIpAddress(this.getIpAddress());
        networConnection.setMostImportantData(this.getMostImportantData());

        for (String d : this.getDomain()) {
            networConnection.domain.add(d);
        }

        return networConnection;
    }

    


}