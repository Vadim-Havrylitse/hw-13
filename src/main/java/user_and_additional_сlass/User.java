package user_and_additional_сlass;

import java.io.Serializable;
import java.util.StringJoiner;

@lombok.Data
@lombok.AllArgsConstructor()
@lombok.NoArgsConstructor
@lombok.Builder
public class User implements Serializable {
    /*
        "id": 10,
        "name": "Clementina DuBuque",
        "username": "Moriah.Stanton",
        "email": "Rey.Padberg@karina.biz",
        "address": {
          "street": "Kattie Turnpike",
          "suite": "Suite 198",
          "city": "Lebsackbury",
          "zipcode": "31428-2261",
          "geo": {
            "lat": "-38.2386",
            "lng": "57.2232"
          }
        },
        "phone": "024-648-3804",
        "website": "ambrose.net",
        "company": {
          "name": "Hoeger LLC",
          "catchPhrase": "Centralized empowering task-force",
          "bs": "target end-to-end models"*/
    private String id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;


    @Override
    public String toString() {
        return new StringJoiner("\n\t", User.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("name='" + name + "'")
                .add("username='" + username + "'")
                .add("email='" + email + "'")
                .add("address=" + address)
                .add("phone='" + phone + "'")
                .add("website='" + website + "'")
                .add("company=" + company)
                .toString();
    }
}


