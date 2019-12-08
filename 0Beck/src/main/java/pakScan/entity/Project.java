package pakScan.entity;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "summary")
    private String summary;

    @Column(name = "cod_project")
    private String cod_project;

    @Column(name = "name_project")
    private String name;


    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", summary='" + summary + '\'' +
                ", cod_project='" + cod_project + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;
        Project project = (Project) o;
        return Objects.equals(getId(), project.getId()) &&
                Objects.equals(getSummary(), project.getSummary()) &&
                Objects.equals(getCod_project(), project.getCod_project()) &&
                Objects.equals(getName(), project.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSummary(), getCod_project(), getName());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCod_project() {
        return cod_project;
    }

    public void setCod_project(String cod_project) {
        this.cod_project = cod_project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
