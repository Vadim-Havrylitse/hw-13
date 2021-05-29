package posts_coments_task;

import java.io.Serializable;
import java.util.StringJoiner;

@lombok.Data
@lombok.AllArgsConstructor()
@lombok.NoArgsConstructor
@lombok.Builder
public class CommentToPost implements Serializable {
    public Integer postId;
    public Integer id;
    public String name;
    public String email;
    public String body;

    @Override
    public String toString() {
        return new StringJoiner("\n\t\t", CommentToPost.class.getSimpleName() + "\n[", "]\n")
                .add("postId=" + postId)
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("email='" + email + "'")
                .add("body='" + body + "'")
                .toString();
    }
}
