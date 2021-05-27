import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class Company implements Serializable {
    /*
    "company": {
      "name": "Hoeger LLC",
      "catchPhrase": "Centralized empowering task-force",
      "bs": "target end-to-end models"*/
    @SerializedName("name")
    private String nameCompany;
    private String catchPhrase;
    private String bs;


}
