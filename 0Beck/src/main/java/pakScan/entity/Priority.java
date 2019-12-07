package pakScan.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "priority")
public class Priority {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name_priority")
    private String name_priority;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_priority() {
        return name_priority;
    }

    public void setName_priority(String name_priority) {
        this.name_priority = name_priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Priority priority = (Priority) o;
        return Objects.equals(id, priority.id) &&
                Objects.equals(name_priority, priority.name_priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name_priority);
    }

    @Override
    public String toString() {
        return "Priority{" +
                "id=" + id +
                ", name_priority='" + name_priority + '\'' +
                '}';
    }
}
