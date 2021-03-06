package my_retrofit;

import posts_coments_task.CommentToPost;
import posts_coments_task.PostByUser;
import posts_coments_task.Task;
import retrofit2.Call;
import retrofit2.http.*;
import user_and_additional_сlass.User;
import java.util.List;

public interface RetrofitClient {

    @POST("users")
    @Headers({"Content-Type: application/json"})
    Call<User> addNewUsers(@Body User user);

    @PUT("users/{id}")
    @Headers({"Content-Type: application/json"})
    Call<User> updateUser(@Body User user, @Path("id") String id);

    @DELETE("users/{id}")
    @Headers({"Content-Type: application/json"})
    Call<User> deleteUserWithId(@Path("id") String id);

    @GET("users")
    @Headers({"Content-Type: application/json"})
    Call<List<User>> getAllToUsers();

    @GET("users/{id}")
    @Headers({"Content-Type: application/json"})
    Call<User> getUserWithId(@Path("id") String id);

    @GET("users")
    @Headers({"Content-Type: application/json"})
    Call<List<User>> getUserWithUsername(@Query("username") String username);

    @GET("users/{id}/posts")
    @Headers({"Content-Type: application/json"})
    Call<List<PostByUser>> getPostsWithUserId(@Path("id") String id);

    @GET("posts/{postId}/comments")
    @Headers({"Content-Type: application/json"})
    Call<List<CommentToPost>> getCommentsWithPostId(@Path("postId") String postId);

    @GET("users/{id}/todos")
    @Headers({"Content-Type: application/json"})
    Call<List<Task>> getAllTaskWithUserId (@Path("id") String id, @Query("completed") Boolean completed);
}
