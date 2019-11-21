package pakCkaner.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long idUsers;

    @NotBlank
    private String name;

   // @ManyToOne(targetEntity = Role.class)

   @NotNull
    private int role;

    public long getIdUsers() {
        return idUsers;
    }

    public String getName() {
        return name;
    }

    public int getRole() {
        return role;
    }

    public void setIdUsers(long idUsers) {
        this.idUsers = idUsers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
