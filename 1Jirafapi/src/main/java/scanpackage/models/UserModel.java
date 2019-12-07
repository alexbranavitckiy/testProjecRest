package scanpackage.models;

import java.util.Objects;

public class UserModel {

    private Integer id;
    private String roli;
    private String login;
    private String password;


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

    UserModel() {
    }


    public UserModel(Integer id, String roli, String login, String password) {
        this.id = id;
        this.roli = roli;
        this.login = login;
        this.password = password;
    }

    public String getRoli() {
        return roli;
    }

    public void setRoli(String roli) {
        this.roli = roli;
    }


    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", roli='" + roli + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
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
        return roli;
    }

    public void setRole(String roli) {
        this.roli = roli;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
