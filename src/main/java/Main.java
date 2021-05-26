import com.google.gson.GsonBuilder;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {

    static String url = "https://jsonplaceholder.typicode.com/users";


    public static void main(String[] args) throws IOException {

        User myUser = new User.Builder()
                .id(11)
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

        Connection.Response response = Jsoup.connect(url)
                .ignoreContentType(true)
                .followRedirects(true)
                .method(Connection.Method.POST)
                .requestBody(new GsonBuilder().setPrettyPrinting().create().toJson(myUser))
                .execute();

        System.out.println(response.statusCode());
    }
}


