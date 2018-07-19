package com.allenhaley.model;

import javax.persistence.*;

@Entity
@Table(name = "supplyrequest", schema = "public")
public class SupplyRequest {

    private long reqId;
    private boolean tp;
    private boolean paperTowels;
    private boolean dishSoap;
    private boolean dishwasherSoap;
    private boolean sponge;
    private boolean garbageBag;
    private boolean handSoap;
    private boolean potsPans;
    private boolean cups;
    private boolean silverware;
    private boolean flatware;
    private String other;
    private Employee employee;

    public SupplyRequest() {
    }

    @Id
    @Column(name="req_id")
    public long getReqId() {
        return reqId;
    }

    public void setReqId(long reqId) {
        this.reqId = reqId;
    }

    @Column(name="tp")
    public boolean isTp() {
        return tp;
    }

    public void setTp(boolean tp) {
        this.tp = tp;
    }

    @Column(name="paper_towels")
    public boolean isPaperTowels() {
        return paperTowels;
    }

    public void setPaperTowels(boolean paperTowels) {
        this.paperTowels = paperTowels;
    }

    @Column(name="dish_soap")
    public boolean isDishSoap() {
        return dishSoap;
    }

    public void setDishSoap(boolean dishSoap) {
        this.dishSoap = dishSoap;
    }

    @Column(name="dishwasher_soap")
    public boolean isDishwasherSoap() {
        return dishwasherSoap;
    }

    public void setDishwasherSoap(boolean dishwasherSoap) {
        this.dishwasherSoap = dishwasherSoap;
    }

    @Column(name="sponge")
    public boolean isSponge() {
        return sponge;
    }

    public void setSponge(boolean sponge) {
        this.sponge = sponge;
    }

    @Column(name="garbage_bag")
    public boolean isGarbageBag() {
        return garbageBag;
    }

    public void setGarbageBag(boolean garbageBag) {
        this.garbageBag = garbageBag;
    }

    @Column(name="hand_soap")
    public boolean isHandSoap() {
        return handSoap;
    }

    public void setHandSoap(boolean handSoap) {
        this.handSoap = handSoap;
    }

    @Column(name="pots_pans")
    public boolean isPotsPans() {
        return potsPans;
    }

    public void setPotsPans(boolean potsPans) {
        this.potsPans = potsPans;
    }

    @Column(name="cups")
    public boolean isCups() {
        return cups;
    }

    public void setCups(boolean cups) {
        this.cups = cups;
    }

    @Column(name="silverware")
    public boolean isSilverware() {
        return silverware;
    }

    public void setSilverware(boolean silverware) {
        this.silverware = silverware;
    }

    @Column(name="flatware")
    public boolean isFlatware() {
        return flatware;
    }

    public void setFlatware(boolean flatware) {
        this.flatware = flatware;
    }

    @Column(name="other")
    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
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
        return "SupplyRequest{" +
                "reqId=" + reqId +
                ", tp=" + tp +
                ", paperTowels=" + paperTowels +
                ", dishSoap=" + dishSoap +
                ", dishwasherSoap=" + dishwasherSoap +
                ", sponge=" + sponge +
                ", garbageBag=" + garbageBag +
                ", handSoap=" + handSoap +
                ", potsPans=" + potsPans +
                ", cups=" + cups +
                ", silverware=" + silverware +
                ", flatware=" + flatware +
                ", other='" + other + '\'' +
                ", employee=" + employee +
                '}';
    }
}
