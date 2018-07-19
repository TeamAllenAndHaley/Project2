package com.allenhaley.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ticket", schema = "public")
public class Ticket {

    private long ticketId;
    private Date date;
    private String category;
    private String content;
    private String status;
    private Employee employee;

    public Ticket() {
    }

    @Id
    @Column(name="ticket_id")
    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    @Column(name="ticket_date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name="ticket_category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Column(name="ticket_content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name="ticket_status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @ManyToOne
    public Employee getEmp() {
        return employee;
    }

    public void setEmp(Employee emp) {
        this.employee = emp;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", date=" + date +
                ", category='" + category + '\'' +
                ", content='" + content + '\'' +
                ", status='" + status + '\'' +
                ", emp=" + employee +
                '}';
    }
}
