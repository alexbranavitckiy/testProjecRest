package pakScan.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "task")
public class Task
{
    @Id
    @Column(name="id")
    private Integer  id;

    @Column (name="description")
    private String description;


    @Column (name="due")
    @Temporal(TemporalType.DATE)
    private Date due;

    @Column (name="estimation")
    @Temporal(TemporalType.DATE)
    private Date estimation;


    @Column (name="assigne")
    private String  assigne;

    @Column (name="codtas")
    private String  codtas;

    @Column (name="creat")
    @Temporal(TemporalType.DATE)
    private Date creat;


    @Column (name="updat")
    @Temporal(TemporalType.DATE)
    private Date updat;

    @Column (name="clos")
    @Temporal(TemporalType.DATE)
    private Date clos;


    //@ManyToOne (optional=false, cascade=CascadeType.ALL)
   // @JoinColumn (name="ID_USER")
   // @ManyToOne(targetEntity = User.class)
    @Column(name = "reporter_user")
    private Integer reporter_user;

  // @Column(name = "reporter_USER")

 //    @Column(name = "PRIOTITI_TASK")
 //   @ManyToOne (optional=false, cascade=CascadeType.ALL)
 //
   // @Column(name = "PRIOTITI_TASK")
//   @ManyToOne (optional=false, cascade=CascadeType.ALL)
//   @JoinColumn (name="ID_PRIOTITI")



   // @ManyToOne(targetEntity = Priority.class)
   @Column(name = "priority_task")
    private Integer prioritytask;

   // @OneToMany(targetEntity = Project.class)
 //  @Column(name = "PROJECT_TASK")
  // @ManyToOne (optional=false, cascade=CascadeType.ALL)
  // @JoinColumn (name="project_t")
   @Column(name = "project_task")
    private String  projecttask;

   @Column (name="comments")
    private String  comments;

    @Column (name="attachment")
    private String  attachment;


    @Column (name="stories")
    private String  stories;


    @Column (name="status_task")
    private String  statustask;





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

    public Integer getReporter_user() {
        return reporter_user;
    }

    public void setReporter_user(Integer reporter_user) {
        this.reporter_user = reporter_user;
    }

    public Integer getPrioritytask() {
        return prioritytask;
    }

    public void setPrioritytask(Integer prioritytask) {
        this.prioritytask = prioritytask;
    }

    public String getProjecttask() {
        return projecttask;
    }

    public void setProjecttask(String projecttask) {
        this.projecttask = projecttask;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getStories() {
        return stories;
    }

    public void setStories(String stories) {
        this.stories = stories;
    }

    public String getStatustask() {
        return statustask;
    }

    public void setStatustask(String statustask) {
        this.statustask = statustask;
    }
    public Task(){}
    public Task(Integer id, String description, Date due, Date estimation, String assigne, String codtas, Date creat, Date updat, Date clos, Integer reporter_user, Integer prioritytask, String projecttask, String comments, String attachment, String stories, String statustask) {
        this.id = id;
        this.description = description;
        this.due = due;
        this.estimation = estimation;
        this.assigne = assigne;
        this.codtas = codtas;
        this.creat = creat;
        this.updat = updat;
        this.clos = clos;
        this.reporter_user = reporter_user;
        this.prioritytask = prioritytask;
        this.projecttask = projecttask;
        this.comments = comments;
        this.attachment = attachment;
        this.stories = stories;
        this.statustask = statustask;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", due=" + due +
                ", estimation=" + estimation +
                ", assigne='" + assigne + '\'' +
                ", codtas='" + codtas + '\'' +
                ", creat=" + creat +
                ", updat=" + updat +
                ", clos=" + clos +
                ", reporter_user=" + reporter_user +
                ", prioritytask=" + prioritytask +
                ", projecttask=" + projecttask +
                ", comments='" + comments + '\'' +
                ", attachment='" + attachment + '\'' +
                ", stories='" + stories + '\'' +
                ", statustask='" + statustask + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) &&
                Objects.equals(description, task.description) &&
                Objects.equals(due, task.due) &&
                Objects.equals(estimation, task.estimation) &&
                Objects.equals(assigne, task.assigne) &&
                Objects.equals(codtas, task.codtas) &&
                Objects.equals(creat, task.creat) &&
                Objects.equals(updat, task.updat) &&
                Objects.equals(clos, task.clos) &&
                Objects.equals(reporter_user, task.reporter_user) &&
                Objects.equals(prioritytask, task.prioritytask) &&
                Objects.equals(projecttask, task.projecttask) &&
                Objects.equals(comments, task.comments) &&
                Objects.equals(attachment, task.attachment) &&
                Objects.equals(stories, task.stories) &&
                Objects.equals(statustask, task.statustask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, due, estimation, assigne, codtas, creat, updat, clos, reporter_user, prioritytask, projecttask, comments, attachment, stories, statustask);
    }
}
