public class Address extends User{
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
    private int zipcode;
    private Geo geo;

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public static class Builder {

        private Address newAddress;

        public Builder() {
            this.newAddress = new Address();
        }

        public Builder street(String street) {
            newAddress.street = street;
            return this;
        }

        public Builder suite(String suite) {
            newAddress.suite = suite;
            return this;
        }

        public Builder city(String city) {
            newAddress.city = city;
            return this;
        }

        public Builder zipcode(int zipcode) {
            newAddress.zipcode = zipcode;
            return this;
        }

        public Builder geo(Geo geo) {
            newAddress.geo = geo;
            return this;
        }

        public Address build(){
            return newAddress;
        }
    }


}
