import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {


        try {
            ObjectMapper mapper = new ObjectMapper();
            MyPojo myPojo = mapper.readValue(new URL("https://ipinfo.io/json"), MyPojo.class);

            System.out.println(myPojo.getIp());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
