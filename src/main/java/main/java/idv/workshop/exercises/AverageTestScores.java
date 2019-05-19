package main.java.idv.workshop.exercises;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {
        int sum = 0;
        int score = 0;
        int classSize = 0;
        boolean fq = true;

        while (fq){

            try{
                System.out.print("請輸入班級人數: ");
                Scanner console = new Scanner(System.in);
                classSize = Integer.parseInt(console.nextLine());
                System.out.printf("班級人數為 %d 人", classSize);
                System.out.println();
                fq = false;

            } catch (Exception ex) {
                System.out.println("Only Number,please");
            }
        }


        for (int n = 1; n <= classSize; n++) {

            fq = true;

            while(fq) {

                try {
                    System.out.printf("No.%d: ", n);
                    Scanner console2 = new Scanner(System.in);
                    score = Integer.parseInt(console2.nextLine());
                    sum = sum + score;
                    fq = false;

                } catch(Exception ex) {
                    System.out.println("Only Number,please");
                }
            }
        }

        System.out.println("Total score: " + sum);
        System.out.println("Average: " + sum/classSize);

    }
}
