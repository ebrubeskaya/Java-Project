package WorkSpace;

import java.util.Scanner;

public class HiTester {

    public static void main (String args ){

        System.out.println("Hi Tester");
        System.out.println("Java Workspace");

        int assignment_total=70;
        int assignment_grade ;
        int exam_total=350;
        int exam_grade;


        //Get input

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen toplam ödev notunu giriniz:");
        assignment_grade=input.nextInt();


        System.out.println("Lütfen final ödev notunu giriniz:");
        exam_grade=input.nextInt();

        int ogr_not = assignment_grade + exam_grade;
        int toplam=assignment_total +exam_total;
        int yuzde=ogr_not/toplam*100;

        System.out.println("Notunuz:" +ogr_not);
        System.out.println("YuzdeNotunuz:" +yuzde);


    }
}
