package com.letty.object;

public class Course {
    public int id;
    public String title;
    public String description;
    public String updatedDate;
    public String submissionDate;
    public String learnStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getLearnStatus() {
        return learnStatus;
    }

    public void setLearnStatus(String learnStatus) {
        this.learnStatus = learnStatus;
    }

}
