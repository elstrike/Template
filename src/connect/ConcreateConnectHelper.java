package connect;

public class ConcreateConnectHelper extends AbstConnectHelper {
    @Override
    protected String doSecurity(String info) {
        System.out.println("super decode");
        return info;
    }

    @Override
    protected String authentication(String id, String password) {
        System.out.println("id check");
        if (id.equals("abc") | password.equals("abc")) {
            return "true info";
        } else {
            return "false info";
        }
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("check auth");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("connect");
        return info;
    }
}
