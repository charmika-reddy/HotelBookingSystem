package models;
public class User {
    private int userId;
    private String name;
    private String contactInfo;

    public User(int userId, String name, String contactInfo) {
        this.userId = userId;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public int getUserId() { return userId; }
    public String getName() { return name; }
    public String getContactInfo() { return contactInfo; }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}
