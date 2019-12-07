package scanpackage.models;

import java.util.Objects;

public class ProjectModel {

    private int id;

    private String cod_project;

    private String summary;

    private String name;

    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ProjectModel{" +
                "id=" + id +
                ", cod_project='" + cod_project + '\'' +
                ", summary='" + summary + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProjectModel)) return false;
        ProjectModel that = (ProjectModel) o;
        return getId() == that.getId() &&
                Objects.equals(getCod_project(), that.getCod_project()) &&
                Objects.equals(getSummary(), that.getSummary()) &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getStatus(), that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCod_project(), getSummary(), getName(), getStatus());
    }
}






