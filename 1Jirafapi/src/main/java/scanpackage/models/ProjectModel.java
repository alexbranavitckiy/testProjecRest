package scanpackage.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;






public class ProjectModel {
    private Integer idproject;
    private String summary;
    private String nameproject;


    public Integer getIdproject() {
        return idproject;
    }

    public void setIdproject(Integer idproject) {
        this.idproject = idproject;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getNameproject() {
        return nameproject;
    }

    public void setNameproject(String nameproject) {
        this.nameproject = nameproject;
    }




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
    public ProjectModel(){
        super();
    }
    public ProjectModel(Integer idproject, String summary, String nameproject) {
        this.idproject = idproject;
        this.summary = summary;
        this.nameproject = nameproject;
    }
}






