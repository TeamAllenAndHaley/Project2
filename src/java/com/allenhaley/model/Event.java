package com.allenhaley.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "event", schema = "public")
public class Event {

    private long evtId;
    private Date evtDate;
    private String evtLocation;
    private String evtTime;
    private String evtDesc;
    private Employee employee;

    public Event() {
    }

    @Id
    @Column(name="evt_id")
    public long getEvtId() {
        return evtId;
    }

    public void setEvtId(long evtId) {
        this.evtId = evtId;
    }

    @Column(name="evt_date")
    public Date getEvtDate() {
        return evtDate;
    }

    public void setEvtDate(Date evtDate) {
        this.evtDate = evtDate;
    }

    @Column(name="evt_location")
    public String getEvtLocation() {
        return evtLocation;
    }

    public void setEvtLocation(String evtLocation) {
        this.evtLocation = evtLocation;
    }

    @Column(name="evt_time")
    public String getEvtTime() {
        return evtTime;
    }

    public void setEvtTime(String evtTime) {
        this.evtTime = evtTime;
    }

    @Column(name="evt_desc")
    public String getEvtDesc() {
        return evtDesc;
    }

    public void setEvtDesc(String evtDesc) {
        this.evtDesc = evtDesc;
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
        return "Event{" +
                "evtId=" + evtId +
                ", evtDate=" + evtDate +
                ", evtLocation='" + evtLocation + '\'' +
                ", evtTime='" + evtTime + '\'' +
                ", evtDesc='" + evtDesc + '\'' +
                ", employee=" + employee +
                '}';
    }
}
