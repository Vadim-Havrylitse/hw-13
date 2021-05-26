public class Geo extends Address {
    private float lat;
    private float lng;

    private Geo() {
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public static class Builder {
        private Geo newGeo;

        public Builder() {
            this.newGeo = new Geo();
        }

        public Builder lat(float lat) {
            newGeo.lat = lat;
            return this;
        }

        public Builder lng(float lng) {
            newGeo.lng = lng;
            return this;
        }

        public Geo build(){
            return newGeo;
        }
    }
}