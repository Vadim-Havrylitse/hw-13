import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class Main {

    static String url = "https://jsonplaceholder.typicode.com/users";


    public static void main(String[] args) throws IOException {

        Users myUsers = new Users.Builder()
                .name("Vasya")
                .username("bigboss")
                .email("fikole@grin.com")
                .phone("+9379992")
                .website("www.www.www/www")
                .address(new Address.Builder()
                        .city("Nico")
                        .suite("FEFSDF")
                        .zipcode(54000)
                        .street("Central avenue")
                        .geo(new Geo.Builder()
                                .lat(+52.5648f)
                                .lng(-53.6584f)
                                .build())
                        .build())
                .company(new Company.Builder()
                        .nameCompany("Facecontrol")
                        .bs("dfsdfsvs")
                        .catchPhrase("dsfavwef3333333")
                        .build())
                .build();

        //POST
        Connection.Response response = Jsoup.connect(url)
                .ignoreContentType(true)
                .followRedirects(true)
                .ignoreHttpErrors(true)
                .method(Connection.Method.POST)
                .requestBody(new Gson().toJson(myUsers, Users.class))
                .timeout(1000*3)
                .execute();

        System.out.println(response.body());

        //PUT
        Connection.Response response2 = Jsoup.connect(url)
                .ignoreContentType(true)
                .followRedirects(true)
                .ignoreHttpErrors(true)
                .method(Connection.Method.PUT)
                .requestBody(new GsonBuilder().setPrettyPrinting().create().toJson(myUsers, Users.class))
                .timeout(1000*3)
                .execute();

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gsonBuilder.fromJson(response2.body(), Users.class));
    }
}


