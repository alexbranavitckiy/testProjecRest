package scanpackage.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;






public class ProjectModel {







    private String cod_project;

    private String summary;

    private String name;

    private String status;

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
        if (!(o instanceof ProjectModel)) return false;
        ProjectModel that = (ProjectModel) o;
        return  getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "ProjectModel{" +
                "cod_project='" + cod_project + '\'' +
                ", summary='" + summary + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}






