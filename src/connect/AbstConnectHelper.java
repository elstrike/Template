package connect;

public abstract class AbstConnectHelper {
    abstract protected String doSecurity(String info);
    abstract protected String authentication(String id, String password);
    abstract protected int authorization(String userName);
    abstract protected String connection(String info);

    public String requestConnection(String info) {
        String id, password, userName, decodedInfo, userInfo;

        decodedInfo = doSecurity(info);

        id = "abc";
        password = "abc";
        userInfo = authentication(id, password);
        userName = "abc";

        System.out.println(userInfo);
        int result = authorization(userName);

        switch (result) {
            case 0:
                System.out.println("00");
                break;
            case 1:
                System.out.println("01");
                break;
            case 2:
                System.out.println("02");
                break;
            case 3:
                System.out.println("03");
                break;
            default:
                break;
        }

        return connection(userInfo);
    }
}
