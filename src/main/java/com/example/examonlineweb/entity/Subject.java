package com.example.examonlineweb.entity;

public class Subject {
    private String sysId;

    private Integer stNum;

    private String stTitle;

    private String stOptionA;

    private String stOptionB;

    private String stOptionC;

    private String stOptionD;

    private String stAnswer;

    private String stParse;

    private String stStatus;

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    public Integer getStNum() {
        return stNum;
    }

    public void setStNum(Integer stNum) {
        this.stNum = stNum;
    }

    public String getStTitle() {
        return stTitle;
    }

    public void setStTitle(String stTitle) {
        this.stTitle = stTitle == null ? null : stTitle.trim();
    }

    public String getStOptionA() {
        return stOptionA;
    }

    public void setStOptionA(String stOptionA) {
        this.stOptionA = stOptionA == null ? null : stOptionA.trim();
    }

    public String getStOptionB() {
        return stOptionB;
    }

    public void setStOptionB(String stOptionB) {
        this.stOptionB = stOptionB == null ? null : stOptionB.trim();
    }

    public String getStOptionC() {
        return stOptionC;
    }

    public void setStOptionC(String stOptionC) {
        this.stOptionC = stOptionC == null ? null : stOptionC.trim();
    }

    public String getStOptionD() {
        return stOptionD;
    }

    public void setStOptionD(String stOptionD) {
        this.stOptionD = stOptionD == null ? null : stOptionD.trim();
    }

    public String getStAnswer() {
        return stAnswer;
    }

    public void setStAnswer(String stAnswer) {
        this.stAnswer = stAnswer == null ? null : stAnswer.trim();
    }

    public String getStParse() {
        return stParse;
    }

    public void setStParse(String stParse) {
        this.stParse = stParse == null ? null : stParse.trim();
    }

    public String getStStatus() {
        return stStatus;
    }

    public void setStStatus(String stStatus) {
        this.stStatus = stStatus == null ? null : stStatus.trim();
    }
}