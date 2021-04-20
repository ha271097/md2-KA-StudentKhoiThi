package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerTuyenSinh {
    public static KhoiThi khoiA = new KhoiThi("Toán", "Lý", "Hóa");
    public static KhoiThi khoiB = new KhoiThi("Toán", "Hóa", "Lý");
    public static KhoiThi khoiC = new KhoiThi("Văn", "Sử", "Địa");

    public static ArrayList <Student> listStudent = new ArrayList<>();

    static {
        Student student1 = new Student("001,","student1", "Hanoi", "DanToc", khoiA);
        Student student2 = new Student("001,","student1", "Hanoi", "DanToc", khoiA);
        Student student3 = new Student("001,","student1", "Hanoi", "DanToc", khoiB);
        Student student4 = new Student("001,","student1", "Hanoi", "DanToc", khoiB);
        Student student5 = new Student("001,","student1", "Hanoi", "DanToc", khoiC);
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);
    }
    public void displayListStudent(){
        System.out.println(listStudent);
    }
    public void addStudent(){
        Scanner sc = new Scanner(System.in);
        Student newStudent = new Student();
        System.out.println(" Enter SBD:");
        String sbd = sc.next();
        newStudent.setSbd(sbd);

        System.out.println(" Enter name: ");
        String name = sc.next();
        newStudent.setName(name);

        System.out.println(" Enter address: ");
        String address = sc.next();
        newStudent.setAddress(address);

        System.out.println(" Enter Prioritize: ");
        String prioritize = sc.next();
        newStudent.setPrioritize(prioritize);

        System.out.println(" Enter khoi :");
        System.out.println(" khoiA = A , khoiB = B, khoiC = C" );
        newStudent.setKhoiThi(addKhoiThi());

        listStudent.add(newStudent);
    }
    public KhoiThi addKhoiThi(){
        Scanner sc = new Scanner(System.in);
        String khoi = sc.next();
        if(khoi.equals("A")){
            return khoiA;
        }else if(khoi.equals("B")){
            return khoiB;
        }else if (khoi.equals("C")){
            return khoiC;
        }
        return null;
    }
    public  void searchStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SBD: ");
        String sbd = sc.next();
        for (int i = 0 ; i < listStudent.size() ; i++) {
            if(listStudent.get(i).getSbd().equals(sbd)){
                System.out.println(listStudent.get(i));
            }
        }
    }
}
