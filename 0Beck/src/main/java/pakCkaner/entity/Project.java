package pakCkaner.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;





@Entity
@Table(name = "PROJECT")
public class Project
{
    @Id
    @GeneratedValue    (strategy=GenerationType.SEQUENCE)
    @Column (name="ID_PROJECT")
    private Integer id;

   // @ManyToOne (fetch=FetchType.LAZY,
   //            cascade=CascadeType.ALL)
   //    @JoinColumn (name="PROJECT_TASK")
   // private Task task;

    @Column(name = "nameproject")
    private String name;

    @Column(name = "summary")
    private String summary;

    public Project(){
        super();
    }

    public Project( String name) {
      //  this.task = task;
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id) &&
                Objects.equals(name, project.name);
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
