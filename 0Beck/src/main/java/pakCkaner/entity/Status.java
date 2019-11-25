package pakCkaner.entity;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "STATUS")
public class Status
{
    @Id
    @GeneratedValue    (strategy=GenerationType.SEQUENCE)
    @Column (name="ID_STATUS")
    private Integer id;

  //  @ManyToOne (fetch=FetchType.LAZY)
    //    @JoinColumn (name="STATUS")
    //    private Task task;

    @Column(name = "name_STATUS")
    private String name;


    public Status(){super();}

    public Status(Task task, String name) {
      //  this.task = task;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(id, status.id) &&
        //        Objects.equals(task, status.task) &&
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

   // public Task getTask() {
    //        return task;
    //    }
    //
    //    public void setTask(Task task) {
    //        this.task = task;
    //    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
