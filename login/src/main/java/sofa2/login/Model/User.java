package sofa2.login.model;

public class User {

    private String username;
    private String password;
    private Enum userRole;

    public User() {
        super();
    }

    public User(String username, String password, Enum userRole) {
        super();
        this.username = username;
        this.password = password;
        this.userRole = userRole;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Enum getUserRole() {
        return userRole;
    }

    public void setUserRole(Enum userRole) {
        this.userRole = userRole;
    }
}
