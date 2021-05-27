import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.*;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public final static String url = "https://jsonplaceholder.typicode.com/users";
    public final static Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();


    public static void main(String[] args) throws IOException {

        User myUser = User.builder()
                .name("Vasya")
                .username("bigboss")
                .email("fikole@grin.com")
                .phone("+9379992")
                .website("www.www.www/www")
                .address(Address.builder()
                        .city("Nico")
                        .suite("FEFSDF")
                        .zipcode("54000")
                        .street("Central avenue")
                        .geo(Geo.builder()
                                .lat("+52.5648")
                                .lng("-53.6584")
                                .build())
                        .build())
                .company(Company.builder()
                        .nameCompany("Facecontrol")
                        .bs("dfsdfsvs")
                        .catchPhrase("dsfavwef3333333")
                        .build())
                .build();

        //POST
        OkHttpClient client = new OkHttpClient();
        Request request1 = new Request.Builder()
                .url(url)
                .post(RequestBody.create(gsonBuilder.toJson(myUser),
                        MediaType.parse("application/json")))
                .build();
        Response response = client.newCall(request1).execute();
        System.out.println(response.body().string());

        //PUT
        myUser.setName("fffffffff");
        Request request2 = new Request.Builder()
                .url(url)
                .put(RequestBody.create(gsonBuilder.toJson(myUser), MediaType.parse("application/json")))
                .build();
        Response response2 = client.newCall(request2).execute();
        System.out.println(response2.body().string());


        //DELETE
        Request request3 = new Request.Builder()
                .url(url)
                .delete(RequestBody.create(gsonBuilder.toJson(myUser), MediaType.parse("application/json")))
                .build();
        Response response3 = client.newCall(request3).execute();
        System.out.println(response3.body().string());

    }
}


