package com.allenhaley.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "event", schema = "public")
public class Event {

    @Id
    @Column(name="evt_id")
    private long evtId;

    @Column(name="evt_date")
    private Date evtDate;

    @Column(name="evt_location")
    private String evtLocation;

    @Column(name="evt_time")
    private String evtTime;

    @Column(name="evt_desc")
    private String evtDesc;

    @ManyToOne
    private Employee employee;

    public Event() {
    }

    public long getEvtId() {
        return evtId;
    }

    public void setEvtId(long evtId) {
        this.evtId = evtId;
    }

    public Date getEvtDate() {
        return evtDate;
    }

    public void setEvtDate(Date evtDate) {
        this.evtDate = evtDate;
    }

    public String getEvtLocation() {
        return evtLocation;
    }

    public void setEvtLocation(String evtLocation) {
        this.evtLocation = evtLocation;
    }

    public String getEvtTime() {
        return evtTime;
    }

    public void setEvtTime(String evtTime) {
        this.evtTime = evtTime;
    }

    public String getEvtDesc() {
        return evtDesc;
    }

    public void setEvtDesc(String evtDesc) {
        this.evtDesc = evtDesc;
    }

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
