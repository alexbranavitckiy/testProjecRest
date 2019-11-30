package pakScan.entity;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "status_task")
public class Status
{
    @Id
    @GeneratedValue    (strategy=GenerationType.SEQUENCE)
    @Column (name="id")
    private Integer id;


    @Column(name = "name_status")
    private String name;


    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(id, status.id) &&
                Objects.equals(name, status.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
