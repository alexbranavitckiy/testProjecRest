package pakCkaner.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;






@Entity
@Table(name = "project")
public class Project {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
       @NotNull
    private long idproject;

   @NotBlank
   @Size(min=4, max=50)
    private String summary;

   @NotBlank
   @Size(min=2, max=10)
   @Column(unique = true)
    private String nameproject;

    public void setIdproject(long idproject) {
        this.idproject = idproject;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setNameproject(String nameproject) {
        this.nameproject = nameproject;
    }

    public long getIdproject() {
        return idproject;
    }

    public String getSummary() {
        return summary;
    }

    public String getNameproject() {
        return nameproject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return idproject == project.idproject &&
                Objects.equals(summary, project.summary) &&
                Objects.equals(nameproject, project.nameproject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idproject, summary, nameproject);
    }
}
