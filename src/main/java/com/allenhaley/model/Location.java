package com.allenhaley.model;

import javax.persistence.*;

@Entity
@Table(name = "location", schema = "public")
public class Location {

    @Column(name="loc_id")
    @Id
    private long locId;

    @Column(name="program_location")
    private String location;

    @Column(name="classroom")
    private String classLoc;

    public Location() {
    }

    public long getLocId() {
        return locId;
    }

    public void setLocId(long locId) {
        this.locId = locId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getClassLoc() {
        return classLoc;
    }

    public void setClassLoc(String classLoc) {
        this.classLoc = classLoc;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locId=" + locId +
                ", location='" + location + '\'' +
                ", classLoc='" + classLoc + '\'' +
                '}';
    }
}
