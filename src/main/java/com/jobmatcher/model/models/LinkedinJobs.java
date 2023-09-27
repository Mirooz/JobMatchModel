package com.jobmatcher.model.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class LinkedinJobs {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "url")
    private String url;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "jobdesc")
    private String jobdesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJobdesc() {
        return jobdesc;
    }

    public void setJobdesc(String jobdesc) {
        this.jobdesc = jobdesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedinJobs that = (LinkedinJobs) o;
        return id == that.id && Objects.equals(url, that.url) && Objects.equals(title, that.title) && Objects.equals(jobdesc, that.jobdesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, title, jobdesc);
    }
}
