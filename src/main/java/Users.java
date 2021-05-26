import java.io.Serializable;
import java.util.StringJoiner;

public class Users implements Serializable {
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
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    public Users() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Users.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("username='" + username + "'")
                .add("email='" + email + "'")
                .add("address=" + address)
                .add("phone='" + phone + "'")
                .add("website='" + website + "'")
                .add("company=" + company)
                .toString();
    }

    public static class Builder {

        public Users newUsers;

        public Builder() {
            this.newUsers = new Users();
        }

        public Builder name(String name) {
            newUsers.name = name;
            return this;
        }

        public Builder username(String username) {
            newUsers.username = username;
            return this;
        }

        public Builder email(String email) {
            newUsers.email = email;
            return this;
        }

        public Builder address(Address address) {
            newUsers.address = address;
            return this;
        }

        public Builder phone(String phone) {
            newUsers.phone = phone;
            return this;
        }

        public Builder website(String website) {
            newUsers.website = website;
            return this;
        }

        public Builder company(Company company) {
            newUsers.company = company;
            return this;
        }

        public Users build(){
            return newUsers;
        }
    }

}


