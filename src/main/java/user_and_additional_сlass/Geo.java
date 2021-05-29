package user_and_additional_сlass;

import java.io.Serializable;

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class Geo implements Serializable {
    private String lat;
    private String lng;

}