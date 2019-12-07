package scanpackage.models;

import java.util.Objects;

public class StatusModel {
    private long id;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        if (!(o instanceof StatusModel)) return false;
        StatusModel that = (StatusModel) o;
        return getId() == that.getId() &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public String toString() {
        return "StatusModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    public StatusModel() {

    }

    public StatusModel(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
