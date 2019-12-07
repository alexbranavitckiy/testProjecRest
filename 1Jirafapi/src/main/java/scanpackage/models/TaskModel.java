package scanpackage.models;

import java.util.Date;
import java.util.Objects;


public class TaskModel {


    private Integer id;
    private String description;
    private Date due;
    private Date estimation;
    private UserModel assigne;
    private String codtas;
    private Date createDate;
    private Date updateDate;
    private Date closedDate;
    private PriorityModel priority_task;
    private ProjectModel project_task;
    private String comments;
    private String stories;
    private String attachment;
    private StatusModel status_task;


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

    public UserModel getAssigne() {
        return assigne;
    }

    public void setAssigne(UserModel assigne) {
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

    public PriorityModel getPriority_task() {
        return priority_task;
    }

    public void setPriority_task(PriorityModel priority_task) {
        this.priority_task = priority_task;
    }

    public ProjectModel getProject_task() {
        return project_task;
    }

    public void setProject_task(ProjectModel project_task) {
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

    public StatusModel getStatus_task() {
        return status_task;
    }

    public void setStatus_task(StatusModel status_task) {
        this.status_task = status_task;
    }

    @Override
    public String toString() {
        return "TaskModel{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", due=" + due +
                ", estimation=" + estimation +
                ", assigne=" + assigne +
                ", codtas='" + codtas + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", closedDate=" + closedDate +
                ", priority_task=" + priority_task +
                ", project_task=" + project_task +
                ", comments='" + comments + '\'' +
                ", stories='" + stories + '\'' +
                ", attachment='" + attachment + '\'' +
                ", status_task=" + status_task +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskModel)) return false;
        TaskModel taskModel = (TaskModel) o;
        return Objects.equals(getId(), taskModel.getId()) &&
                Objects.equals(getDescription(), taskModel.getDescription()) &&
                Objects.equals(getDue(), taskModel.getDue()) &&
                Objects.equals(getEstimation(), taskModel.getEstimation()) &&
                Objects.equals(getAssigne(), taskModel.getAssigne()) &&
                Objects.equals(getCodtas(), taskModel.getCodtas()) &&
                Objects.equals(getCreateDate(), taskModel.getCreateDate()) &&
                Objects.equals(getUpdateDate(), taskModel.getUpdateDate()) &&
                Objects.equals(getClosedDate(), taskModel.getClosedDate()) &&
                Objects.equals(getPriority_task(), taskModel.getPriority_task()) &&
                Objects.equals(getProject_task(), taskModel.getProject_task()) &&
                Objects.equals(getComments(), taskModel.getComments()) &&
                Objects.equals(getStories(), taskModel.getStories()) &&
                Objects.equals(getAttachment(), taskModel.getAttachment()) &&
                Objects.equals(getStatus_task(), taskModel.getStatus_task());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription(), getDue(), getEstimation(), getAssigne(), getCodtas(), getCreateDate(), getUpdateDate(), getClosedDate(), getPriority_task(), getProject_task(), getComments(), getStories(), getAttachment(), getStatus_task());
    }
}

