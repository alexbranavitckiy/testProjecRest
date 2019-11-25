package pakCkaner.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "TASK")
public class Task
{
    @Id
    @Column(name="ID_TASK")
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
    private Integer reporter_USER;

  // @Column(name = "reporter_USER")

 //    @Column(name = "PRIOTITI_TASK")
 //   @ManyToOne (optional=false, cascade=CascadeType.ALL)
 //
   // @Column(name = "PRIOTITI_TASK")
//   @ManyToOne (optional=false, cascade=CascadeType.ALL)
//   @JoinColumn (name="ID_PRIOTITI")



   // @ManyToOne(targetEntity = Priority.class)
    private Integer PRIOTITI_TASK;

   // @OneToMany(targetEntity = Project.class)
 //  @Column(name = "PROJECT_TASK")
   @ManyToOne (optional=false, cascade=CascadeType.ALL)
   @JoinColumn (name="PROJECT_TASK")
    private Project  PROJECT_TASK;

 @Column (name="ommentary")
 private String  сommentary;



    @Column (name="stories")
    private String  stories;

    @Column (name="attachment")
    private String  attachment;

//   @OneToMany(targetEntity = Status.class)
  //  @ManyToOne (optional=false, cascade=CascadeType.ALL)
  //  @JoinColumn (name="ID_STATUS")
    private Integer  STATUS;
    public Task(){super();}

    public Task(Integer id, String description, Date due, Date estimation, String assigne, String codtas, Date creat, Date updat, Date clos, Integer reporter_USER, Integer PRIOTITI_TASK, Project PROJECT_TASK, String comments, String stories, String attachment, Integer STATUS) {
        this.id = id;
        this.description = description;
        this.due = due;
        this.estimation = estimation;
        this.assigne = assigne;
        this.codtas = codtas;
        this.creat = creat;
        this.updat = updat;
        this.clos = clos;
        this.reporter_USER = reporter_USER;
        this.PRIOTITI_TASK = PRIOTITI_TASK;
        this.PROJECT_TASK = PROJECT_TASK;
        this.сommentary = comments;
        this.stories = stories;
        this.attachment = attachment;
        this.STATUS = STATUS;
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
                Objects.equals(reporter_USER, task.reporter_USER) &&
                Objects.equals(PRIOTITI_TASK, task.PRIOTITI_TASK) &&
                Objects.equals(PROJECT_TASK, task.PROJECT_TASK) &&
                Objects.equals(сommentary, task.сommentary) &&
                Objects.equals(stories, task.stories) &&
                Objects.equals(attachment, task.attachment) &&
                Objects.equals(STATUS, task.STATUS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, due, estimation, assigne, codtas, creat, updat, clos, reporter_USER, PRIOTITI_TASK, PROJECT_TASK, сommentary, stories, attachment, STATUS);
    }

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

    public Integer getReporter_USER() {
        return reporter_USER;
    }

    public void setReporter_USER(Integer reporter_USER) {
        this.reporter_USER = reporter_USER;
    }

    public Integer getPRIOTITI_TASK() {
        return PRIOTITI_TASK;
    }

    public void setPRIOTITI_TASK(Integer PRIOTITI_TASK) {
        this.PRIOTITI_TASK = PRIOTITI_TASK;
    }

    public Project getPROJECT_TASK() {
        return PROJECT_TASK;
    }

    public void setPROJECT_TASK(Project PROJECT_TASK) {
        this.PROJECT_TASK = PROJECT_TASK;
    }

    public String getComments() {
        return сommentary;
    }

    public void setComments(String comments) {
        this.сommentary = comments;
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

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }
}
