package scanpackage.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;






public class ProjectModel {
    private Integer idproject;
    private String summary;
    private String nameproject;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectModel that = (ProjectModel) o;
        return Objects.equals(idproject, that.idproject) &&
                Objects.equals(summary, that.summary) &&
                Objects.equals(nameproject, that.nameproject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idproject, summary, nameproject);
    }

    public Integer getIdproject() {
        return    this.idproject = this.nameproject.hashCode();
    }

    public String getNameproject() {
        return nameproject;
    }

    public void setIdproject() {
        this.idproject = this.nameproject.hashCode();
    }

    public void setNameproject(String nameproject) {
        this.nameproject = nameproject;
    }


    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getNameProject() {
        return nameproject;
    }
    public void setNameProject(String nameProject) {
        this.nameproject = nameProject;
    }

}






