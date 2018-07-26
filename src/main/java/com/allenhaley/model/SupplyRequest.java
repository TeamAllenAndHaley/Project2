package com.allenhaley.model;

import javax.persistence.*;

@Entity
@Table(name = "supplyrequest", schema = "public")
public class SupplyRequest {

    @Id
    @Column(name="req_id")
    private long reqId;

    @Column(name="tp")
    private boolean tp;

    @Column(name="paper_towels")
    private boolean paperTowels;

    @Column(name="dish_soap")
    private boolean dishSoap;

    @Column(name="dishwasher_soap")
    private boolean dishwasherSoap;

    @Column(name="sponge")
    private boolean sponge;

    @Column(name="garbage_bag")
    private boolean garbageBag;

    @Column(name="hand_soap")
    private boolean handSoap;

    @Column(name="pots_pans")
    private boolean potsPans;

    @Column(name="cups")
    private boolean cups;

    @Column(name="silverware")
    private boolean silverware;

    @Column(name="flatware")
    private boolean flatware;

    @Column(name="other")
    private String other;

    @ManyToOne
    private Employee employee;

    public SupplyRequest() {
    }

    public long getReqId() {
        return reqId;
    }

    public void setReqId(long reqId) {
        this.reqId = reqId;
    }

    public boolean isTp() {
        return tp;
    }

    public void setTp(boolean tp) {
        this.tp = tp;
    }

    public boolean isPaperTowels() {
        return paperTowels;
    }

    public void setPaperTowels(boolean paperTowels) {
        this.paperTowels = paperTowels;
    }

    public boolean isDishSoap() {
        return dishSoap;
    }

    public void setDishSoap(boolean dishSoap) {
        this.dishSoap = dishSoap;
    }

    public boolean isDishwasherSoap() {
        return dishwasherSoap;
    }

    public void setDishwasherSoap(boolean dishwasherSoap) {
        this.dishwasherSoap = dishwasherSoap;
    }

    public boolean isSponge() {
        return sponge;
    }

    public void setSponge(boolean sponge) {
        this.sponge = sponge;
    }

    public boolean isGarbageBag() {
        return garbageBag;
    }

    public void setGarbageBag(boolean garbageBag) {
        this.garbageBag = garbageBag;
    }

    public boolean isHandSoap() {
        return handSoap;
    }

    public void setHandSoap(boolean handSoap) {
        this.handSoap = handSoap;
    }

    public boolean isPotsPans() {
        return potsPans;
    }

    public void setPotsPans(boolean potsPans) {
        this.potsPans = potsPans;
    }

    public boolean isCups() {
        return cups;
    }

    public void setCups(boolean cups) {
        this.cups = cups;
    }

    public boolean isSilverware() {
        return silverware;
    }

    public void setSilverware(boolean silverware) {
        this.silverware = silverware;
    }

    public boolean isFlatware() {
        return flatware;
    }

    public void setFlatware(boolean flatware) {
        this.flatware = flatware;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

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
