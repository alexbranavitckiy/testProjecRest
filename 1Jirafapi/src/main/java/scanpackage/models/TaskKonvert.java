package scanpackage.models;

import java.util.Date;
import java.util.Objects;

public class TaskKonvert {

    private Integer id;
    private String description;
    private Date due;
    private Date estimation;
    private String assigne;
    private String codtas;
    private Date createDate;
    private Date updateDate;
    private Date closedDate;
    private String priority_task;
    private String project_task;
    private String comments;
    private String stories;
    private String attachment;
    private String status_task;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public Date getEstimation() {
        return estimation;
    }

    public void setEstimation(Date estimation) {
        this.estimation = estimation;
    }

    public String getAssigne() {
        return assigne;
    }

    public void setAssigne(String assigne) {
        this.assigne = assigne;
    }

    public String getCodtas() {
        return codtas;
    }

    public void setCodtas(String codtas) {
        this.codtas = codtas;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    public String getPriority_task() {
        return priority_task;
    }

    public void setPriority_task(String priority_task) {
        this.priority_task = priority_task;
    }

    public String getProject_task() {
        return project_task;
    }

    public void setProject_task(String project_task) {
        this.project_task = project_task;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStories() {
        return stories;
    }

    public void setStories(String stories) {
        this.stories = stories;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getStatus_task() {
        return status_task;
    }

    public void setStatus_task(String status_task) {
        this.status_task = status_task;
    }


    @Override
    public String toString() {
        return "TaskKonvert{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", due=" + due +
                ", estimation=" + estimation +
                ", assigne='" + assigne + '\'' +
                ", codtas='" + codtas + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", closedDate=" + closedDate +
                ", priority_task='" + priority_task + '\'' +
                ", project_task='" + project_task + '\'' +
                ", comments='" + comments + '\'' +
                ", stories='" + stories + '\'' +
                ", attachment='" + attachment + '\'' +
                ", status_task='" + status_task + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskKonvert)) return false;
        TaskKonvert that = (TaskKonvert) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getDescription(), that.getDescription()) &&
                Objects.equals(getDue(), that.getDue()) &&
                Objects.equals(getEstimation(), that.getEstimation()) &&
                Objects.equals(getAssigne(), that.getAssigne()) &&
                Objects.equals(getCodtas(), that.getCodtas()) &&
                Objects.equals(getCreateDate(), that.getCreateDate()) &&
                Objects.equals(getUpdateDate(), that.getUpdateDate()) &&
                Objects.equals(getClosedDate(), that.getClosedDate()) &&
                Objects.equals(getPriority_task(), that.getPriority_task()) &&
                Objects.equals(getProject_task(), that.getProject_task()) &&
                Objects.equals(getComments(), that.getComments()) &&
                Objects.equals(getStories(), that.getStories()) &&
                Objects.equals(getAttachment(), that.getAttachment()) &&
                Objects.equals(getStatus_task(), that.getStatus_task());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription(), getDue(), getEstimation(), getAssigne(), getCodtas(), getCreateDate(), getUpdateDate(), getClosedDate(), getPriority_task(), getProject_task(), getComments(), getStories(), getAttachment(), getStatus_task());
    }
}
