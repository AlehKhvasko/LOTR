import client.utils.RequestApi;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        RequestApi requestApi = new RequestApi("book");
        requestApi.runClient("Okk8iRZULkd60EjA274Q");
        System.out.println(requestApi.getResponse());
    }
}
