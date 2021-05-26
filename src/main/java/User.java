public class User {
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
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    public User() {
    }

    public static class Builder {

        public User newUser;

        public Builder() {
            this.newUser = new User();
        }

        public Builder id(int id) {
            newUser.id = id;
            return this;
        }

        public Builder name(String name) {
            newUser.name = name;
            return this;
        }

        public Builder username(String username) {
            newUser.username = username;
            return this;
        }

        public Builder email(String email) {
            newUser.email = email;
            return this;
        }

        public Builder address(Address address) {
            newUser.address = address;
            return this;
        }

        public Builder phone(String phone) {
            newUser.phone = phone;
            return this;
        }

        public Builder website(String website) {
            newUser.website = website;
            return this;
        }

        public Builder company(Company company) {
            newUser.company = company;
            return this;
        }

        public User build(){
            return newUser;
        }
    }

}


