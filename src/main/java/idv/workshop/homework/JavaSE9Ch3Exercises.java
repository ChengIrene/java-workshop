package idv.workshop.homework;

public class JavaSE9Ch3Exercises {
    public static void main(String[] args) {

        //找出最大公因數(GCD = greatest common divisor)與最小公倍數(LCM = lowest common multiple)
        int m = 1000;
        int n = 495;

        JavaSE9Ch3Exercises gcdAndLcm = new JavaSE9Ch3Exercises();
        int gcd = gcdAndLcm.calculateGcd(m, n);
        int lcm = gcdAndLcm.calculateLcm(m, n);

        System.out.println(gcd);
        System.out.println(lcm);

        //找出所有三位數的阿姆斯壯數
        JavaSE9Ch3Exercises armstrongNumber = new JavaSE9Ch3Exercises();
        armstrongNumber.calculateArmstrongNumber();
    }

    //最大公因數(GCD = greatest common divisor)
    public int calculateGcd(int a, int b) {
        while (b > 0) {
            int num1 = b;
            b = a % b;
            a = num1;
        }
        return a;
    }

    //最小公倍數(LCM = lowest common multiple)
    public int calculateLcm(int a, int b) {
        return a * (b / (calculateGcd(a, b)));
    }

    //找三位數的阿姆斯壯數(Armstrong number)
    public void calculateArmstrongNumber() {  //153.370.371.407
        double a;
        double b;
        double c;
        for(a = 1; a < 10; a++ ) {
            for(b = 0; b < 10; b++) {
                for (c = 0; c < 10; c++) {
                    double num1 = Math.pow(a, 3);
                    double num2 = Math.pow(b, 3);
                    double num3 = Math.pow(c, 3);
                    if(num1 + num2 + num3 == (a * 100) + (b * 10) + c) {
                        System.out.println((int)num1 + (int)num2 + (int)num3);
                    }
                }
            }
        }
    }
}