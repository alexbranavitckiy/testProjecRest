package pakCkaner.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "user")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
// Unknown column 'user0_.id_users' in 'field list'
    @NotBlank
    private String name;
//
   // @ManyToOne(targetEntity = Role.class)

   @NotNull
    private int role;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRole() {
        return role;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        name = name;
    }

    public void setRole(int role) {
        role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                role == user.role &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, role);
    }
}
