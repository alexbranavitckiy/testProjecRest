package pakCkaner.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "USER")
public class User
{
    @Id
    @Column (name="ID_USER")
    private Integer id;

   // @ManyToOne (fetch=FetchType.LAZY)
    //    @JoinColumn (name="reporter_USER")
    //    private Task task;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "LOGIN")
    private String login;
    @Column(name = "PASSWORD")
    private String password;

    public User(){super();}
    public User(Integer id, String role, String login, String password) {
        this.id = id;
       // this.task = task;
        this.role = role;
        this.login = login;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

  //  public Task getTask() {
    //        return task;
    //    }
    //
    //    public void setTask(Task task) {
    //        this.task = task;
    //    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
