import lombok.SneakyThrows;
import my_retrofit.RetrofitClient;
import posts_coments_task.CommentToPost;
import posts_coments_task.PostByUser;
import posts_coments_task.Task;
import user_and_additional_сlass.Address;
import user_and_additional_сlass.Company;
import user_and_additional_сlass.Geo;
import user_and_additional_сlass.User;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

import static my_retrofit.RetrofitConfig.createClient;
import static my_retrofit.RetrofitConfig.execute;

public class Main {

    public final static RetrofitClient clientConnect = createClient("https://jsonplaceholder.typicode.com", RetrofitClient.class);

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

        User postResponseUser = execute(clientConnect.addNewUsers(myUser));
        System.out.println(postResponseUser.getId());

        myUser.setEmail("sdfsefwfassssssswwww@1111111111");
        myUser.setUsername("Vigo");
        myUser.setWebsite("comcomcom1111.122");
        User putResponseUser = execute(clientConnect.updateUser(myUser, "1"));
        System.out.println(putResponseUser);

        User deleteResponseUser = execute(clientConnect.deleteUserWithId("3"));
        System.out.println(deleteResponseUser);

        List<User> allResponseUser = execute(clientConnect.getAllToUsers());
        allResponseUser.forEach(System.out::println);

        User getWithIdResponseUser = execute(clientConnect.getUserWithId("3"));
        System.out.println(getWithIdResponseUser);

        List<User> getWithUsernameResponseUser = execute(clientConnect.getUserWithUsername("Bret"));
        getWithUsernameResponseUser.forEach(System.out::println);

        writeNewComments("5");

        getAllTaskForUser("5");

    }

    @SneakyThrows
    public static void writeNewComments(String userId) {
        System.out.println("НАЧИНАЮ МЕТОД" + LocalDateTime.now());
        List<PostByUser> allPostByUserWithUserId = execute(clientConnect.getPostsWithUserId(userId));
        PostByUser maxPost = Collections.max(allPostByUserWithUserId, (o1, o2) -> o1.id - o2.id);
        int maxPostId = maxPost.id;
        List<CommentToPost> allCommentByUserWithPostId = execute(clientConnect.getCommentsWithPostId(String.valueOf(maxPostId)));
        File file = new File("src/main/resources",
                "user-" + userId + "-post-" + maxPostId + "-comments.json");
        System.out.println("ФАЙЛ СОЗДАН? - " + file.createNewFile() + " " + LocalDateTime.now());

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(allCommentByUserWithPostId.toString());
            fileWriter.flush();
        }
        System.out.println("ФАЙЛ ЗАПИСАН " + LocalDateTime.now());
    }


    public static void getAllTaskForUser(String userId) {
        List<Task> allTaskForUser = execute(clientConnect.getAllTaskWithUserId(userId, false));
        allTaskForUser.forEach(System.out::println);
    }
}


