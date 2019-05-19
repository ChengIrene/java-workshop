package main.java.idv.workshop.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1A2B {

    private List ans = new ArrayList();
    private static int getA;

    public void answer() {

        int rnd;

        while (ans.size() < 4) {
            rnd = (int)(Math.random() * 10);

            if(ans.indexOf(rnd) == -1) {
                ans.add(rnd);
            }
        }

    }

    public void checkAns(List keyIn) {

        int getB = 0;

        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if(keyIn.get(i) == ans.get(j)) {

                    if(i == j) {
                        getA++;
                    } else {
                        getB++;
                    }
                }
            }
        }

        if(getA < 4) {
            System.out.println("Result: " + getA + "A" + getB + "B");
        } else {
            System.out.println("Congratulation!!!");
        }
    }

    public static void main(String[] args) {

        int sum = 0;
        String in;
        List keyIn = new ArrayList();
        Exercise1A2B dp = new Exercise1A2B();
        dp.answer();

        z:while (getA < 4) {

            keyIn.clear();
            getA = 0;

            sum = sum + 1;
            System.out.println("Please enter four numbers. (not repeated) times: " + sum );
            Scanner sc = new Scanner(System.in);
            in = sc.next();


            if(in.length() != 4) {

                sum = sum - 1;

                System.out.println("Enter error");
                continue z;

            } else {

                for(int i = 0; i < 4; i++) {

                    int key = Character.getNumericValue(in.charAt(i));

                    if(keyIn.indexOf(key) == -1) {
                        keyIn.add(key);

                    } else {

                        sum = sum - 1;

                        System.out.println("Number is repeated");
                        continue z;
                    }
                }

                dp.checkAns(keyIn);

            }
        }
    }
}
