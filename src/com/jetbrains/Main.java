package com.jetbrains;

import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    static void userChoice() {

        System.out.println("Choose the difficulty level");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        Scanner sc = new Scanner(System.in);

        int level = sc.nextInt();
        System.out.println("Choose the type of Arithmetic");

        System.out.println("Addition - 1");
        System.out.println("Multiplication - 2");
        System.out.println("Subtraction - 3");
        System.out.println("Division - 4");
        System.out.println("Mixer of all - 5");

        int arithType = sc.nextInt();

        solveProb(level,arithType);
    }

    static void solveProb(int level, int arithType) {

        int counter = 0;

        switch (arithType) {

            case 1:
                for (int i = 1; i <= 10; i++) {
                    counter += addition(level);
                }
                break;

            case 2:
                for (int i = 1; i <= 10; i++) {
                    counter += multiplication(level);
                }
                break;

            case 3:
                for (int i = 1; i <= 10; i++) {
                    counter += subtraction(level);
                }
                break;

            case 4:
                for (int i = 1; i <= 10; i++) {
                    counter += division(level);
                }
                break;

            case 5:
                for (int i = 1; i <= 10; i++) {

                    int ran = Random(1,4);

                    if (ran == 1) {
                        counter += addition(level);
                    }

                    if (ran == 2) {
                        counter += multiplication(level);
                    }

                    if (ran == 3) {
                        counter += subtraction(level);
                    }

                    if (ran == 4) {
                        counter += division(level);
                    }
                }
                break;

            default:
                System.out.println("Invalid Number");
                return;
        }


        if( (double) ( (double) counter / 10) * 100 >= (double) 75) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }

        else {
            System.out.println("Please ask your teacher for extra help");
        }
    }


    private static int addition(int level) {

        int a = 0;
        int b = 0;

        if (level == 1) {

            a = Random(0,9);
            b = Random(0,9);
        }

        if (level == 2) {

            a = Random(10,99);
            b = Random(10,99);
        }

        if (level == 3) {

            a = Random(100,999);
            b = Random(100,999);
        }

        if (level == 4) {

            a = Random(1000,9999);
            b = Random(1000,9999);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("How much is " + a + " plus " + b);

        int answer = sc.nextInt();

        if (answer == a + b) {

            int choose = Random(1,4);

            if (choose == 1) {
                System.out.println("Very good!");
            }

            if (choose == 2) {
                System.out.println("Excellent!");
            }

            if (choose == 3) {
                System.out.println("Nice work!");
            }

            if (choose == 4) {
                System.out.println("Keep up the good work!");
            }

            return 1;
        }

        else {
            System.out.println("Sorry, that is incorrect.");
        }

        while(true) {

            int ans = sc.nextInt();

            if (ans == a + b) {

                int choose = Random(1,4);

                if (choose == 1) {
                    System.out.println("Very good!");
                }

                if (choose == 2) {
                    System.out.println("Excellent!");
                }

                if (choose == 3) {
                    System.out.println("Nice work!");
                }

                if (choose == 4) {
                    System.out.println("Keep up the good work!");
                }

                return 0;
            }

            else {
                System.out.println("Sorry, that is incorrect.");
            }

        }
    }


    private static int subtraction(int level) {

        int a = 0,b = 0;

        if (level == 1) {

            a = Random(0,9);
            b = Random(0,9);
        }

        if (level == 2) {

            a = Random(10,99);
            b = Random(10,99);
        }

        if (level == 3) {

            a = Random(100,999);
            b = Random(100,999);
        }

        if (level == 4) {

            a = Random(1000,9999);
            b = Random(1000,9999);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("How much is " + a + " minus " + b);

        int answer = sc.nextInt();

        if (answer == b - a) {

            int choose = Random(1,4);

            if (choose == 1) {
                System.out.println("Very good!");
            }

            if (choose == 2) {
                System.out.println("Excellent!");
            }

            if (choose == 3) {
                System.out.println("Nice work!");
            }

            if (choose == 4) {
                System.out.println("Keep up the good work!");
            }

            return 1;
        }

        else {

            System.out.println("Sorry, that is incorrect.");
        }


        while(true) {

            int ans = sc.nextInt();

            if (ans == b - a) {

                int choose = Random(1,4);

                if (choose == 1) {
                    System.out.println("Very good!");
                }

                if (choose == 2) {
                    System.out.println("Excellent!");
                }

                if (choose == 3) {
                    System.out.println("Nice work!");
                }

                if (choose == 4) {
                    System.out.println("Keep up the good work!");
                }

                return 0;
            }

            else {

                System.out.println("Sorry, that is incorrect.");
            }
        }
    }

    private static int multiplication(int level) {

        int a = 0, b = 0;

        if (level == 1) {

            a = Random(0, 9);
            b = Random(0, 9);
        }

        if (level == 2) {

            a = Random(10, 99);
            b = Random(10, 99);
        }

        if (level == 3) {

            a = Random(100, 999);
            b = Random(100, 999);
        }

        if (level == 4) {

            a = Random(1000, 9999);
            b = Random(1000, 9999);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("How much is " + a + " times " + b);

        int answer = sc.nextInt();

        if (answer == b * a) {

            int choose = Random(1, 4);

            if (choose == 1) {
                System.out.println("Very good!");
            }

            if (choose == 2) {
                System.out.println("Excellent!");
            }

            if (choose == 3) {
                System.out.println("Nice work!");
            }

            if (choose == 4) {
                System.out.println("Keep up the good work!");
            }

            return 1;
        }

        else {

            System.out.println("Sorry, that is incorrect.");
        }

        while (true) {

            int ans = sc.nextInt();

            if (ans == b * a) {

                int choose = Random(1, 4);

                if (choose == 1) {
                    System.out.println("Very good!");
                }

                if (choose == 2) {
                    System.out.println("Excellent!");
                }

                if (choose == 3) {
                    System.out.println("Nice work!");
                }

                if (choose == 4) {
                    System.out.println("Keep up the good work!");
                }

                return 0;
            }

            else {

                System.out.println("Sorry, that is incorrect.");
            }
        }
    }

    private static int division(int level) {

        float a = 0, b = 0;

        if (level == 1) {

            a = Random(1,9);
            b = Random(1,9);
        }

        if (level == 2) {

            a = Random(10,99);
            b = Random(10,99);
        }

        if (level == 3) {

            a = Random(100,999);
            b = Random(100,999);
        }

        if (level == 4) {

            a = Random(1000,999);
            b = Random(1000,999);
        }

        Scanner sc = new Scanner(System.in);


        System.out.println("How much is " + a + " divided by " + b);
        String answer = sc.nextLine();

        // System.out.println(df2.format(b/a));
        if (answer.equals(df2.format(b/a))) {

            int choose = Random(1,4);

            if (choose == 1) {
                System.out.println("Very good!");
            }

            if (choose == 2) {
                System.out.println("Excellent!");
            }

            if (choose == 3) {
                System.out.println("Nice work!");
            }

            if (choose == 4) {
                System.out.println("Keep up the good work!");
            }

            return 1;
        }

        else {
            System.out.println("Sorry, that is incorrect.");
        }


        while(true) {
            String ans = sc.nextLine();
            //System.out.println(df2.format(b/a));

            if (ans.equals(df2.format(b/a))) {

                int choose = Random(1,4);

                if (choose == 1) {
                    System.out.println("Very good!");
                }

                if (choose == 2) {
                    System.out.println("Excellent!");
                }

                if (choose == 3) {
                    System.out.println("Nice work!");
                }

                if (choose == 4) {
                    System.out.println("Keep up the good work!");
                }

                return 0;
            }

            else {
                System.out.println("Sorry, that is incorrect.");
            }
        }
    }


    public static int Random (int min, int max) {
        SecureRandom rand = new SecureRandom();
        int x = (int) (rand.nextDouble() * ((max - min) + 1)) + min;
        return x;
    }

    public static void main(String arg[]) {

        while(true) {
            userChoice();
        }
    }
}