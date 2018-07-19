package com.allenhaley.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employee", schema = "public")
public class Employee {

    private long empId;
    private String fName;
    private String lName;
    private String email;
    private boolean canContact;
    private Date dOfBirth;
    private String department;
    private boolean hasCar;
    private boolean hasKeys;
    private boolean isEmailSubbed;
    private Housing h;
    private Location loc;
    private List<Ticket> tickets;
    private List<Event> events;
    private List<Announcement> announcements;
    private List<SupplyRequest> supplyRequests;

    public Employee() {
    }

    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    @Column(name = "f_name", nullable = false)
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Column(name = "l_name", nullable = false)
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "contact")
    public boolean isCanContact() {
        return canContact;
    }

    public void setCanContact(boolean canContact) {
        this.canContact = canContact;
    }

    @Column(name = "dob")
    public Date getdOfBirth() {
        return dOfBirth;
    }

    public void setdOfBirth(Date dOfBirth) {
        this.dOfBirth = dOfBirth;
    }

    @Column(name="department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Column(name="keys")
    public boolean isHasKeys() {
        return hasKeys;
    }

    public void setHasKeys(boolean hasKeys) {
        this.hasKeys = hasKeys;
    }

    @Column(name="email_sub")
    public boolean isEmailSubbed() {
        return isEmailSubbed;
    }

    public void setEmailSubbed(boolean emailSubbed) {
        isEmailSubbed = emailSubbed;
    }

    @Column(name="has_car")
    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    @OneToOne
    @JoinColumn(name="h_id")
    public Housing getH() {
        return h;
    }

    public void setH(Housing h) {
        this.h = h;
    }

    @OneToOne
    @JoinColumn(name="loc_id")
    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    @OneToMany(mappedBy="employee")
    @ElementCollection(targetClass=Ticket.class)
    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @OneToMany(mappedBy="employee")
    @ElementCollection(targetClass=Event.class)
    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @OneToMany(mappedBy="employee")
    @ElementCollection(targetClass=Announcement.class)
    public List<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<Announcement> announcements) {
        this.announcements = announcements;
    }

    @OneToMany(mappedBy="employee")
    @ElementCollection(targetClass=SupplyRequest.class)
    public List<SupplyRequest> getSupplyRequests() {
        return supplyRequests;
    }

    public void setSupplyRequests(List<SupplyRequest> supplyRequests) {
        this.supplyRequests = supplyRequests;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", canContact=" + canContact +
                ", dOfBirth=" + dOfBirth +
                ", department='" + department + '\'' +
                ", hasKeys=" + hasKeys +
                ", isEmailSubbed=" + isEmailSubbed +
                ", hasCar=" + hasCar +
                ", h=" + h +
                ", loc=" + loc +
                '}';
    }
}
