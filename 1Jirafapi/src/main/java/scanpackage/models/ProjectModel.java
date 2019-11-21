package scanpackage.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;






public class ProjectModel {
    private String idproject;
    private String summary;
    private String nameproject;

    public String getIdproject() {
        return idproject;
    }

    public String getNameproject() {
        return nameproject;
    }

    public void setIdproject(String idproject) {
        this.idproject = idproject;
    }

    public void setNameproject(String nameproject) {
        this.nameproject = nameproject;
    }


    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getNameProject() {
        return nameproject;
    }
    public void setNameProject(String nameProject) {
        this.nameproject = nameProject;
    }

}






//@JsonIgnoreProperties(ignoreUnknown = true)
//public class ProjectModel {
//    private long id;
//    private String nameproject;
//    private String istorii;
//    private String task;
//    private String comments;
//    private String customeremail;
//
//    public ProjectModel(){}
//    public ProjectModel(long id, String nameproject, String istorii, String task, String comments, String customeremail) {
//        this.id = id;
//        this.nameproject = nameproject;
//        this.istorii = istorii;
//        this.task = task;
//        this.comments = comments;
//        this.customeremail = customeremail;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getNameproject() {
//        return nameproject;
//    }
//
//    public void setNameproject(String nameproject) {
//        this.nameproject = nameproject;
//    }
//
//    public String getIstorii() {
//        return istorii;
//    }
//
//    public void setIstorii(String istorii) {
//        this.istorii = istorii;
//    }
//
//    public String getTask() {
//        return task;
//    }
//
//    public void setTask(String task) {
//        this.task = task;
//    }
//
//    public String getComments() {
//        return comments;
//    }
//
//    public void setComments(String comments) {
//        this.comments = comments;
//    }
//
//    public String getCustomeremail() {
//        return customeremail;
//    }
//
//    public void setCustomeremail(String customeremail) {
//        this.customeremail = customeremail;
//    }
//}
