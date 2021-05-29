package posts_and_coments;

import java.io.Serializable;
import java.util.StringJoiner;

@lombok.Data
@lombok.AllArgsConstructor()
@lombok.NoArgsConstructor
@lombok.Builder
public class PostByUser implements Serializable{
    public Integer userId;
    public Integer id;
    public String title;
    public String body;

    @Override
    public String toString() {
        return new StringJoiner("\n\t\t", PostByUser.class.getSimpleName() + "[", "]")
                .add("userId=" + userId)
                .add("id=" + id)
                .add("title='" + title + "'")
                .add("body='" + body + "'")
                .toString();
    }

}