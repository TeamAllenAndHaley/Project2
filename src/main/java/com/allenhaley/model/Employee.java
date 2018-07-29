package com.allenhaley.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employee", schema = "public")
public class Employee {

    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empId;

    @Column(name = "f_name", nullable = false)
    private String fName;

    @Column(name = "l_name", nullable = false)
    private String lName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name = "contact")
    private boolean canContact;

    @Column(name = "dob")
    private Date dOfBirth;

    @Column(name="department")
    private String department;

    @Column(name="has_car")
    private boolean hasCar;

    @Column(name="keys")
    private boolean hasKeys;

    @Column(name="email_sub")
    private boolean isEmailSubbed;

    @OneToOne
    @JoinColumn(name="housing_id")
    private Housing h;

    @OneToOne
    @JoinColumn(name="location_id")
    private Location loc;

    @OneToMany(mappedBy="employee")
    @ElementCollection(targetClass=Ticket.class)
    private List<Ticket> tickets;

    @OneToMany(mappedBy="employee")
    @ElementCollection(targetClass=Event.class)
    private List<Event> events;

    @OneToMany(mappedBy="employee")
    @ElementCollection(targetClass=Announcement.class)
    private List<Announcement> announcements;

    @OneToMany(mappedBy="employee")
    @ElementCollection(targetClass=SupplyRequest.class)
    private List<SupplyRequest> supplyRequests;

    public Employee() {
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isCanContact() {
        return canContact;
    }

    public void setCanContact(boolean canContact) {
        this.canContact = canContact;
    }

    public Date getdOfBirth() {
        return dOfBirth;
    }

    public void setdOfBirth(Date dOfBirth) {
        this.dOfBirth = dOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isHasKeys() {
        return hasKeys;
    }

    public void setHasKeys(boolean hasKeys) {
        this.hasKeys = hasKeys;
    }

    public boolean isEmailSubbed() {
        return isEmailSubbed;
    }

    public void setEmailSubbed(boolean emailSubbed) {
        isEmailSubbed = emailSubbed;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public Housing getH() {
        return h;
    }

    public void setH(Housing h) {
        this.h = h;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<Announcement> announcements) {
        this.announcements = announcements;
    }

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
