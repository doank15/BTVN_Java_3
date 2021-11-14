package Bai3;

import java.util.Scanner;

public class RunMainBai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Class a = new Class();

        System.out.print("Enter ID: ");
        a.setMaLopHoc(sc.nextLine());
        System.out.print("Enter Name Class: ");
        a.setTenLopHoc(sc.nextLine());
        System.out.println("Enter Date Open: ");
        a.setNgayMo(sc.nextLine());
        System.out.println("Enter Teacher: ");
        a.setGiaoVien(sc.nextLine());
        System.out.println("Enter quantity Student: ");
        a.setNumber(sc.nextInt());
        for(int i = 0; i < a.getNumber() ;i++) {
            System.out.println("\tStudent: " + (i + 1) + ": ");
            Students student = new Students();
            student.s_Input();
            a.getX().add(student);
        }

        // output
        System.out.printf("%40s", "Classroom");
        System.out.println("");
        Output(a);
        int dem = 0 ;
        for(int i = 0;i < a.getNumber() ;i++) {
            if(a.getX().get(i).getLock() == 15) {dem++;}
        }
        System.out.println("Have " + dem + " student K15");

        //Sort 
        for(int i = 0 ; i< a.getNumber() -1 ;i++) {
            for(int j = i + 1 ;j<a.getNumber() ; j++) {
                if(a.getX().get(i).getLock() > a.getX().get(j).getLock()) {
                    Students temp = a.getX().get(i);
                    a.getX().set(i,a.getX().get(j));
                    a.getX().set(j, temp);
                }
            }
        }
        System.out.printf("%40s","After Sort" );
        Output(a);
        sc.close();
    }   
    public static void Output(Class a) {
        System.out.println("ID Class: " + a.getMaLopHoc());
        System.out.println("Name Class: " + a.getTenLopHoc());
        System.out.println("Date Open: " + a.getNgayMo());
        System.out.println("");
        
        System.out.printf("%10s %10s %10s", "Name", "Date", "hometown");
        System.out.printf("%10s %10s %10s\n", "idStudent", "Major", "keyCourse");
        for (int i = 0; i < a.getNumber(); i++) {
            a.getX().get(i).s_Output();
            System.out.println("");
        }
        System.out.println("teacher: " + a.getGiaoVien());
    }
}
