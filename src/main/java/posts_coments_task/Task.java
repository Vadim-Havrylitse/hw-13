package posts_coments_task;

import java.io.Serializable;
import java.util.StringJoiner;

@lombok.Data
@lombok.AllArgsConstructor()
@lombok.NoArgsConstructor
@lombok.Builder
public class Task implements Serializable {
    public int userId;
    public int id;
    public String title;
    public boolean completed;

    @Override
    public String toString() {
        return new StringJoiner("\n\t", Task.class.getSimpleName() + "[", "]")
                .add("userId=" + userId)
                .add("id=" + id)
                .add("title='" + title + "'")
                .add("completed=" + completed)
                .toString();
    }
}
