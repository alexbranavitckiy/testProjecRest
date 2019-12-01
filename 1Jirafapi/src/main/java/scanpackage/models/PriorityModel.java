package scanpackage.models;

import java.util.Objects;

public class PriorityModel {



    private Integer id;


    private String name_priority;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_priority() {
        return name_priority;
    }

    public void setName_priority(String name_priority) {
        this.name_priority = name_priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PriorityModel)) return false;
        PriorityModel that = (PriorityModel) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getName_priority(), that.getName_priority());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName_priority());
    }

    @Override
    public String toString() {
        return "PriorityModel{" +
                "id=" + id +
                ", name_priority='" + name_priority + '\'' +
                '}';
    }
}
