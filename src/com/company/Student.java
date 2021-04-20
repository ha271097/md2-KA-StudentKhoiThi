package com.company;

public class Student {
    private String sbd;
    private String name;
    private String address;
    private String prioritize;
    public static KhoiThi khoiThi;


    public Student(String sbd, String name, String address, String Prioritize, KhoiThi khoiThi) {
        this.sbd = sbd;
        this.name = name;
        this.address = address;
        this.prioritize = Prioritize;
        this.khoiThi = khoiThi;
    }


    public Student() {
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress(String address) {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrioritize(String prioritize) {
        return this.prioritize;
    }

    public void setPrioritize(String uutien) {
        this.prioritize = uutien;
    }

    public KhoiThi getKhoiThi() {
        return khoiThi;
    }

    public void setKhoiThi(KhoiThi khoiThi) {
        Student.khoiThi = khoiThi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sbd='" + sbd + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", prioritize='" + prioritize + '\'' +
                '}'+ " Khoi thi ='" + khoiThi +"\n";
    }
}
