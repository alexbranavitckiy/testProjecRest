package scanpackage.models;

import java.util.Objects;

public class UserModel {

         Integer id;
         String role;
         String login;
         String password;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserModel)) return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(getId(), userModel.getId()) &&
                Objects.equals(getRole(), userModel.getRole()) &&
                Objects.equals(getLogin(), userModel.getLogin()) &&
                Objects.equals(getPassword(), userModel.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin());
    }

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
