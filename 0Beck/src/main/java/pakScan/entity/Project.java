package pakScan.entity;

import javax.persistence.*;
import java.util.Objects;





@Entity
@Table(name = "project")
public class Project
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_project")
    private Integer id;

    @Column(name = "cod_project")
    private String cod_project;

    @Column(name = "summary")
    private String summary;

    @Column(name = "nameproject")
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCod_project() {
        return cod_project;
    }

    public void setCod_project(String cod_project) {
        this.cod_project = cod_project;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id) &&
                Objects.equals(cod_project, project.cod_project) &&
                Objects.equals(summary, project.summary) &&
                Objects.equals(name, project.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cod_project, summary, name);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", cod_project='" + cod_project + '\'' +
                ", summary='" + summary + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
