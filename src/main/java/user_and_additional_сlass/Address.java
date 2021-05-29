package user_and_additional_сlass;

import java.io.Serializable;

@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Builder
public class Address implements Serializable {
    /*
    "address": {
      "street": "Kattie Turnpike",
      "suite": "Suite 198",
      "city": "Lebsackbury",
      "zipcode": "31428-2261",
      "geo": {
        "lat": "-38.2386",
        "lng": "57.2232"
      }
     */

    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}
