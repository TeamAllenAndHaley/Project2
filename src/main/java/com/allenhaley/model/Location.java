package com.allenhaley.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location", schema = "public")
public class Location {

    @Column(name="loc_id")
    @Id
    private long locId;

    @Column(name="location")
    private String location;

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

    @Override
    public String toString() {
        return "Location{" +
                "locId=" + locId +
                ", location='" + location + '\'' +
                '}';
    }
}
