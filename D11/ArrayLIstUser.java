package D11;

public class ArrayLIstUser {
    int id;
    int password;
    String username;

    public ArrayLIstUser(int id, int password, String username) {
        this.id = id;
        this.password = password;
        this.username = username;
    }

    public ArrayLIstUser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
