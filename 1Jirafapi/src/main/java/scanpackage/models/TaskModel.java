package scanpackage.models;

import java.util.Date;


public class TaskModel {


    private int id;
    private String code;//
    private String description;//
    private Date due;//
    private int estimation;//
    private int assigne;//
    private Date createDate;//
    private Date updateDate;//
    private Date closedDate;//
    private int priority_task;//
    private int project_task;//
    private String stories;//
    private int status_task;//


    TaskModel(TaskKonvert taskKonvert) {
        TaskModel taskModel = new TaskModel();
        taskModel.setDescription(taskKonvert.getDescription());
        taskModel.setStatus_task(taskKonvert.getStatus_task());
        taskModel.setAssigne(taskKonvert.getAssigne().getId());
        taskModel.setCode(taskKonvert.getProject_task().getName() + taskKonvert.getEstimation());
        taskModel.setEstimation(taskKonvert.getEstimation());
        taskModel.setPriority_task(taskKonvert.getPriority_task());
        taskModel.setDue(taskKonvert.getDue());
        taskModel.setCreateDate(taskKonvert.getCreateDate());
        taskModel.setClosedDate(taskKonvert.getClosedDate());
        taskModel.setUpdateDate(taskKonvert.getUpdateDate());
        taskModel.setStories(taskKonvert.getStories());
        taskModel.setProject_task(taskKonvert.getProject_task().getId());
    }


    TaskModel() {
    }

    public TaskModel(int id, String code, String description, Date due, int estimation, int assigne, Date createDate, Date updateDate, Date closedDate, int priority_task, int project_task, String comments, String stories, int status_task) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.due = due;
        this.estimation = estimation;
        this.assigne = assigne;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.closedDate = closedDate;
        this.priority_task = priority_task;
        this.project_task = project_task;
        this.stories = stories;
        this.status_task = status_task;
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

    public int getAssigne() {
        return assigne;
    }

    public void setAssigne(int assigne) {
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

    public int getPriority_task() {
        return priority_task;
    }

    public void setPriority_task(int priority_task) {
        this.priority_task = priority_task;
    }

    public int getProject_task() {
        return project_task;
    }

    public void setProject_task(int project_task) {
        this.project_task = project_task;
    }


    public String getStories() {
        return stories;
    }

    public void setStories(String stories) {
        this.stories = stories;
    }

    public int getStatus_task() {
        return status_task;
    }

    public void setStatus_task(int status_task) {
        this.status_task = status_task;
    }
}

