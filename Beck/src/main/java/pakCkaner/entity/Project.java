package pakCkaner.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "project")
public class Project {

//create table if not exists project(
//idProject int auto_increment primary key ,
//nameProject varchar(45),
//customerEmail varchar(45),
//duaData varchar(45),
//createData varchar(45),
//istorii varchar(45),
//comments varchar(45)
//)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int idProject;
    private String nameProject;
    private String customerEmail;
    private String duaData;
    private String createData;
    private String istorii;
    private String comments;

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setDuaData(String duaData) {
        this.duaData = duaData;
    }

    public void setCreateData(String createData) {
        this.createData = createData;
    }

    public void setIstorii(String istorii) {
        this.istorii = istorii;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getIdProject() {
        return idProject;
    }

    public String getNameProject() {
        return nameProject;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getDuaData() {
        return duaData;
    }

    public String getCreateData() {
        return createData;
    }

    public String getIstorii() {
        return istorii;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return idProject == project.idProject &&
                nameProject.equals(project.nameProject) &&
                customerEmail.equals(project.customerEmail) &&
                duaData.equals(project.duaData) &&
                createData.equals(project.createData) &&
                istorii.equals(project.istorii) &&
                comments.equals(project.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProject, nameProject, customerEmail, duaData, createData, istorii, comments);
    }


    @Override
    public String toString() {
        return "Project{" +
                "idProject=" + idProject +
                ", nameProject='" + nameProject + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", duaData='" + duaData + '\'' +
                ", createData='" + createData + '\'' +
                ", istorii='" + istorii + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
