public class Director {
    private String firstNsme;
    private String lastName;
    public Director(String firstNsme, String lastName) {
        this.firstNsme = firstNsme;
        this.lastName = lastName;
    }

    public Director() {
    }

    public String getFirstNsme() {
        return firstNsme;
    }

    public void setFirstNsme(String firstNsme) {
        this.firstNsme = firstNsme;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Director{" +
                "firstNsme='" + firstNsme + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
