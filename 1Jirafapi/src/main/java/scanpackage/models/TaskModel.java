package scanpackage.models;
import java.util.Date;


public class TaskModel {




        private Integer id;
        private String description;
        private Date dueData;
        private Date estimation;
        private String assigne;
        private String codtask;
        private Date createDate;
        private Date updateDate;
        private Date closedDate;
        private UserModel reporter;
        private PriorityModel priority;
        private ProjectModel project;
        private String comments;
        private String stories;
        private String attachment;
        private Integer status;

    public long getId() {
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

    public Date getDueData() {
        return dueData;
    }

    public void setDueData(Date dueData) {
        this.dueData = dueData;
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

    public String getCodtask() {
        return codtask;
    }

    public void setCodtask(String codtask) {
        this.codtask = codtask;
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

    public UserModel getReporter() {
        return reporter;
    }

    public void setReporter(UserModel reporter) {
        this.reporter = reporter;
    }

    public PriorityModel getPriority() {
        return priority;
    }

    public void setPriority(PriorityModel priority) {
        this.priority = priority;
    }

    public ProjectModel getProject() {
        return project;
    }

    public void setProject(ProjectModel project) {
        this.project = project;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

