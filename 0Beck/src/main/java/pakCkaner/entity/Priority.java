package pakCkaner.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "PRIOTITI")
public class Priority
{
    @Id
    @GeneratedValue    (strategy=GenerationType.SEQUENCE)
    @Column (name="id_priotiti")
    private Integer id_priotiti;

  //  @ManyToOne (fetch=FetchType.LAZY,
    //            cascade=CascadeType.ALL)
    //    @JoinColumn (name="PRIOTITI_TASK")
    //    private Task task;

   // @Column(name = "name_PRIOTITI")

   // @OneToMany (mappedBy="PRIOTITI_TASK", fetch=FetchType.EAGER)
    @Column(name = "name_PRIOTITI")
    private String name_PRIOTITI;


    //@OneToMany (mappedBy="PRIOTITI_TASK", fetch=FetchType.EAGER)
    //    private Collection<Task> ID_PRIOTITI;


    public Integer getId() {
        return id_priotiti;
    }

    public void setId(Integer id) {
        this.id_priotiti = id;
    }

    public String getName_PRIOTITI() {
        return name_PRIOTITI;
    }

    public void setName_PRIOTITI(String name_PRIOTITI) {
        this.name_PRIOTITI = name_PRIOTITI;
    }
}
