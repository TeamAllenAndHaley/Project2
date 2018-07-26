package com.allenhaley.model;

import javax.persistence.*;

@Entity
@Table(name = "housing", schema = "public")
public class Housing {

    @Column(name="h_id")
    @Id
    private long housingId;

    @Column(name="apt_room")
    private String aptRoom;

    @OneToOne
    @JoinColumn(name="comp_id")
    private ApartmentComplex comp;

    public Housing() {
    }

    public long getHousingId() {
        return housingId;
    }

    public void setHousingId(long housingId) {
        this.housingId = housingId;
    }

    public String getAptRoom() {
        return aptRoom;
    }

    public void setAptRoom(String aptRoom) {
        this.aptRoom = aptRoom;
    }

    public ApartmentComplex getComp() {
        return comp;
    }

    public void setComp(ApartmentComplex comp) {
        this.comp = comp;
    }

    @Override
    public String toString() {
        return "Housing{" +
                "housingId=" + housingId +
                ", aptRoom='" + aptRoom + '\'' +
                ", comp=" + comp +
                '}';
    }
}
