package scanpackage.models;

import java.util.Date;

public class TaskKonvert {

    private int id;
    private String code;
    private String description;
    private Date due;
    private int estimation;
    private UserModel assigne;
    private Date createDate;
    private Date updateDate;
    private Date closedDate;
    private PriorityModel priority_task;
    private ProjectModel project_task;
    private String stories;
    private StatusModel status_task;


    @Override
    public String toString() {
        return "TaskKonvert{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", due=" + due +
                ", estimation=" + estimation +
                ", assigne=" + assigne +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", closedDate=" + closedDate +
                ", priority_task=" + priority_task +
                ", project_task=" + project_task +
                ", stories='" + stories + '\'' +
                ", status_task=" + status_task +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
    }

    public UserModel getAssigne() {
        return assigne;
    }

    public void setAssigne(UserModel assigne) {
        this.assigne = assigne;
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

    public String getStories() {
        return stories;
    }

    public void setStories(String stories) {
        this.stories = stories;
    }

    public StatusModel getStatus_task() {
        return status_task;
    }

    public void setStatus_task(StatusModel status_task) {
        this.status_task = status_task;
    }
}
