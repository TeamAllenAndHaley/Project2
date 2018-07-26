package com.allenhaley.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "announcement", schema = "public")
public class Announcement {

    @Id
    @Column(name="a_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long aId;

    @Column(name="a_date")
    private Date aDate;

    @Column(name="a_content")
    private String content;

    @ManyToOne
    private Employee employee;

    public Announcement() {
    }

    public long getaId() {
        return aId;
    }

    public void setaId(long aId) {
        this.aId = aId;
    }

    public Date getaDate() {
        return aDate;
    }

    public void setaDate(Date aDate) {
        this.aDate = aDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

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
