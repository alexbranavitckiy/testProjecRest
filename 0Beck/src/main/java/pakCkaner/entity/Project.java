package pakCkaner.entity;


//use jira;
//CREATE TABLE billing_project (
//  id bigint(20) NOT NULL AUTO_INCREMENT,
//   nameproject varchar(45) DEFAULT NULL,
//  istorii varchar(255) DEFAULT NULL,
//   task varchar(255) DEFAULT NULL,
//      comments varchar(255) DEFAULT NULL,
// customeremail varchar(45) DEFAULT NULL,
//  PRIMARY KEY (id),
//  UNIQUE KEY userproject_UNIQUE (nameproject)
//) ENGINE=InnoDB AUTO_INCREMENT=1
//
//
//
import javax.persistence.*;
import java.util.Objects;

    @Entity
    @Table(name = "billing_project")
    public class Project {
        @Id
       //@GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String nameproject;
        private String istorii;
        private String task;
        private String comments;
        private String customeremail;


        public Project(){}

        public Project(String nameproject, String istorii, String task, String comments, String customeremail) {
            this.nameproject = nameproject;
            this.istorii = istorii;
            this.task = task;
            this.comments = comments;
            this.customeremail = customeremail;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Project{" +
                    "id=" + id +
                    ", nameproject='" + nameproject + '\'' +
                    ", istorii='" + istorii + '\'' +
                    ", task='" + task + '\'' +
                    ", comments='" + comments + '\'' +
                    ", customeremail='" + customeremail + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Project project = (Project) o;
            return id == project.id &&
                    Objects.equals(nameproject, project.nameproject) &&
                    Objects.equals(istorii, project.istorii) &&
                    Objects.equals(task, project.task) &&
                    Objects.equals(comments, project.comments) &&
                    Objects.equals(customeremail, project.customeremail);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, nameproject, istorii, task, comments, customeremail);
        }

        public String getNameproject() {
            return nameproject;
        }

        public void setNameproject(String nameproject) {
            this.nameproject = nameproject;
        }

        public String getIstorii() {
            return istorii;
        }

        public void setIstorii(String istorii) {
            this.istorii = istorii;
        }

        public String getTask() {
            return task;
        }

        public void setTask(String task) {
            this.task = task;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        public String getCustomeremail() {
            return customeremail;
        }

        public void setCustomeremail(String customeremail) {
            this.customeremail = customeremail;
        }
    }
