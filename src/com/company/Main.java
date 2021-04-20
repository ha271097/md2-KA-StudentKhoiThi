package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ManagerTuyenSinh haanh = new ManagerTuyenSinh();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--Menu__");
            System.out.println("Number 1: Display.");
            System.out.println("Number 2: Add.");
            System.out.println("Number 3: Search.");
            System.out.println("Number 0: Exit.");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    haanh.displayListStudent();
                    break;
                case 2:
                    haanh.addStudent();
                    break;
                case 3:
                    haanh.searchStudent();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
