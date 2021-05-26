public class Company extends User{
    /*
    "company": {
      "name": "Hoeger LLC",
      "catchPhrase": "Centralized empowering task-force",
      "bs": "target end-to-end models"*/

    private String nameCompany;
    private String catchPhrase;
    private String bs;

    public Company() {
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setName(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public static class Builder {
        private Company newCompany;

        public Builder() {
            this.newCompany = new Company();
        }

        public Builder nameCompany(String nameCompany) {
            newCompany.nameCompany = nameCompany;
            return this;
        }

        public Builder catchPhrase(String catchPhrase) {
            newCompany.catchPhrase = catchPhrase;
            return this;
        }

        public Builder bs(String bs) {
            newCompany.bs = bs;
            return this;
        }

        public Company build() {
            return newCompany;
        }
    }
}
