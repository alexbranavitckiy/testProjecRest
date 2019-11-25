package scanpackage.models;

import java.util.Objects;

public class PriorityModel {



    private Integer ID_PROJECT;


    private String name;


    private String summary;





    public Integer getID_PROJECT() {
        return ID_PROJECT;
    }

    public void setID_PROJECT(Integer ID_PROJECT) {
        this.ID_PROJECT = ID_PROJECT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
        PriorityModel that = (PriorityModel) o;
        return Objects.equals(ID_PROJECT, that.ID_PROJECT) &&
                Objects.equals(name, that.name) &&
                Objects.equals(summary, that.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_PROJECT, name, summary);
    }
}
