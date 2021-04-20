package com.company;

public class KhoiThi  {
    private String subjects;
    private String subjects1;
    private String subjects2;

    public KhoiThi(String subjects) {
        this.subjects = subjects;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getSubjects1() {
        return subjects1;
    }

    public void setSubjects1(String subjects1) {
        this.subjects1 = subjects1;
    }

    public String getSubjects2() {
        return subjects2;
    }

    public void setSubjects2(String subjects2) {
        this.subjects2 = subjects2;
    }

    public KhoiThi(String subjects, String subjects1, String subjects2) {
        this.subjects = subjects;
        this.subjects1 = subjects1;
        this.subjects2 = subjects2;
    }

    @Override
    public String toString() {
        return "KhoiThi{" +
                "subjects='" + subjects + '\'' +
                ", subjects1='" + subjects1 + '\'' +
                ", subjects2='" + subjects2 + '\'' +
                '}';
    }
}
