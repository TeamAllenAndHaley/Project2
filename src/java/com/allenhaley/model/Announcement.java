package com.allenhaley.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "announcement", schema = "public")
public class Announcement {

    private long aId;
    private Date aDate;
    private String content;
    private Employee employee;

    public Announcement() {
    }

    @Id
    @Column(name="a_id")
    public long getaId() {
        return aId;
    }

    public void setaId(long aId) {
        this.aId = aId;
    }

    @Column(name="a_date")
    public Date getaDate() {
        return aDate;
    }

    public void setaDate(Date aDate) {
        this.aDate = aDate;
    }

    @Column(name="a_content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @ManyToOne
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "aId=" + aId +
                ", aDate=" + aDate +
                ", content='" + content + '\'' +
                ", employee=" + employee +
                '}';
    }
}
