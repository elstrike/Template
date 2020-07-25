import connect.AbstConnectHelper;
import connect.ConcreateConnectHelper;

public class Main {
    public static void main(String[] args) {
        AbstConnectHelper abstConnectHelper = new ConcreateConnectHelper();
        abstConnectHelper.requestConnection("info");
    }
}
