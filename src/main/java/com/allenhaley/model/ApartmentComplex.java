package com.allenhaley.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "apartmentcomplex", schema = "public")
public class ApartmentComplex {

    @Column(name="comp_id")
    @Id
    private int compId;

    @Column(name="comp_name")
    private String complexName;

    @Column(name="comp_street")
    private String streetAddress;

    @Column(name="comp_city")
    private String city;

    @Column(name="comp_state")
    private String state;

    @Column(name="comp_zip")
    private int zip;

    public ApartmentComplex() {
    }

    public long getCompId() {
        return compId;
    }

    public void setCompId(int compId) {
        this.compId = compId;
    }

    public String getComplexName() {
        return complexName;
    }

    public void setComplexName(String complexName) {
        this.complexName = complexName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "ApartmentComplex{" +
                "compId=" + compId +
                ", complexName='" + complexName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
