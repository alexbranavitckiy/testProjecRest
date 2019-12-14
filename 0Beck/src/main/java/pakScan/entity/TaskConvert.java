package pakScan.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "task")
public class TaskConvert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "code")
    private String code;


    @Column(name = "description")
    private String description;

    @Column(name = "due")
    @Temporal(TemporalType.DATE)
    private Date due;

    @Column(name = "estimation")
    private Integer estimation;


    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private User assigne;


    @Column(name = "creat")
    @Temporal(TemporalType.DATE)
    private Date creat;

    @Column(name = "updat")
    @Temporal(TemporalType.DATE)
    private Date updat;

    @Column(name = "clos")
    @Temporal(TemporalType.DATE)
    private Date clos;


    @ManyToOne(targetEntity = Priority.class)
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Priority priority_task;

    @ManyToOne(targetEntity = Project.class, fetch = FetchType.EAGER)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Project project_task;


    @Column(name = "stories")
    private String stories;

    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Status status_task;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskConvert)) return false;
        TaskConvert that = (TaskConvert) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getCode(), that.getCode()) &&
                Objects.equals(getDescription(), that.getDescription()) &&
                Objects.equals(getDue(), that.getDue()) &&
                Objects.equals(getEstimation(), that.getEstimation()) &&
                Objects.equals(getAssigne(), that.getAssigne()) &&
                Objects.equals(getCode(), that.getCode()) &&
                Objects.equals(getCreat(), that.getCreat()) &&
                Objects.equals(getUpdat(), that.getUpdat()) &&
                Objects.equals(getClos(), that.getClos()) &&
                Objects.equals(getPriority_task(), that.getPriority_task()) &&
                Objects.equals(getProject_task(), that.getProject_task()) &&
                Objects.equals(getStories(), that.getStories()) &&
                Objects.equals(getStatus_task(), that.getStatus_task());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCode(), getDescription(), getDue(), getEstimation(), getAssigne(), getCode(), getCreat(), getUpdat(), getClos(), getPriority_task(), getProject_task(), getStories(), getStatus_task());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreat() {
        return creat;
    }

    public void setCreat(Date creat) {
        this.creat = creat;
    }

    public Date getUpdat() {
        return updat;
    }

    public void setUpdat(Date updat) {
        this.updat = updat;
    }

    public Date getClos() {
        return clos;
    }

    public void setClos(Date clos) {
        this.clos = clos;
    }

    public Priority getPriority_task() {
        return priority_task;
    }

    public void setPriority_task(Priority priority_task) {
        this.priority_task = priority_task;
    }

    public Project getProject_task() {
        return project_task;
    }

    public void setProject_task(Project project_task) {
        this.project_task = project_task;
    }


    public String getStories() {
        return stories;
    }

    public void setStories(String stories) {
        this.stories = stories;
    }

    public Status getStatus_task() {
        return status_task;
    }

    public void setStatus_task(Status status_task) {
        this.status_task = status_task;
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

    public Integer getEstimation() {
        return estimation;
    }

    public void setEstimation(Integer estimation) {
        this.estimation = estimation;
    }

    public User getAssigne() {
        return assigne;
    }

    public void setAssigne(User assigne) {
        this.assigne = assigne;
    }

    @Override
    public String toString() {
        return "TaskConvert{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", due=" + due +
                ", estimation=" + estimation +
                ", assigne=" + assigne +
                ", creat=" + creat +
                ", updat=" + updat +
                ", clos=" + clos +
                ", priority_task=" + priority_task +
                ", project_task=" + project_task +
                ", stories='" + stories + '\'' +
                ", status_task=" + status_task +
                '}';
    }
}
