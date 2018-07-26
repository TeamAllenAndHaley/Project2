package com.allenhaley.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ticket", schema = "public")
public class Ticket {

    @Id
    @Column(name="ticket_id")
    private long ticketId;

    @Column(name="ticket_date")
    private Date date;

    @Column(name="ticket_category")
    private String category;

    @Column(name="ticket_content")
    private String content;

    @Column(name="ticket_status")
    private String status;

    @ManyToOne
    private Employee employee;

    public Ticket() {
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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
