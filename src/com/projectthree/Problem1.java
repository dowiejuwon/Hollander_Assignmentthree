package com.projectthree;

import java.util.Scanner;
import java.security.SecureRandom;


public class Problem1 {
    public static void main(String[] args) {
        problem_type();
    }

    public static int Random(int min, int max) {
        SecureRandom rnd = new SecureRandom();
        int i = (int) (rnd.nextDouble() * ((max - min) + 1)) + min;
        return i;
    }

    static void problem_type() {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please pick a level for difficulty");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        int level = scnr.nextInt();

        System.out.println("Please choose an arithmetic type ");
        System.out.println("Type 1 for addition.");
        System.out.println("Type 2 for subtraction.");
        System.out.println("Type 3 for multiplication.");
        System.out.println("Type 4 for division.");
        System.out.println("Type 5 for a mixture of all.");
        int arithmetic_type = scnr.nextInt();

        question(level, arithmetic_type);
    }

    static void question(int level, int arithmetic_type) {
        int counter = 0;

        switch (arithmetic_type) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    counter += addition(level);
                }
                break;
            case 2:
                for (int i = 1; i <= 10; i++) {
                    counter += substraction(level);
                }
                break;
            case 3:
                for (int i = 1; i <= 10; i++) {
                    counter += multiplication(level);
                }
                break;
            case 4:
                for (int i = 1; i <= 10; i++) {
                    counter += division(level);
                }

                break;
            case 5:
                for (int i = 1; i <= 10; i++) {
                    int rnd = Random(1, 4);
                    if (rnd == 1) {
                        counter += addition(level);
                    }
                    if (rnd == 2) {
                        counter += multiplication(level);
                    }
                    if (rnd == 3) {
                        counter += substraction(level);
                    }
                    if (rnd == 4) {
                        counter += division(level);
                    }
                }
                break;

            default:
                return;

        }

        double result = ((double) counter / 10) * 100;

        if (result >= 75) {
            System.out.println("You got " + counter + " correct out of 10. Your percentage is " + result + "%");
            System.out.println("Congratulations, you are ready to go to the next level!");

        } else {
            System.out.println("You got " + counter + " correct out of 10. Your percentage is " + result + "%");
            System.out.println("Please ask your teacher for extra help.");
        }
    }

    static int addition(int level) {
        int x = 0;
        int y = 0;
        if (level == 1) {
            x = Random(0, 9);
            y = Random(0, 9);
        }
        if (level == 2) {
            x = Random(10, 99);
            y = Random(10, 99);
        }
        if (level == 3) {
            x = Random(100, 999);
            y = Random(100, 999);
        }
        if (level == 4) {
            x = Random(1000, 9999);
            y = Random(1000, 9999);
        }
        Scanner scnr = new Scanner(System.in);
        System.out.println("How much is " + x + " plus " + y);
        int answer = scnr.nextInt();
        if (answer == x + y) {
            int cresponse = Random(1, 4);
            if (cresponse == 1) {
                System.out.println("Very good!");
            }
            if (cresponse == 2) {
                System.out.println("Excellent!");
            }
            if (cresponse == 3) {
                System.out.println("Nice work!");
            }
            if (cresponse == 4) {
                System.out.println("Keep up the good work!");
            }
            return 1;
        } else {


            int iresponse = Random(1, 4);
            if (iresponse == 1) {
                System.out.println("No. Please try again.");
            }
            if (iresponse == 2) {
                System.out.println("Wrong. Try once more.");
            }
            if (iresponse == 3) {
                System.out.println("Don't give up!");
            }
            if (iresponse == 4) {
                System.out.println("No. Keep trying");
            }
            return 0;

        }
    }

    static int substraction(int level) {
        int x = 0, y = 0;
        if (level == 1) {
            x = Random(0, 9);
            y = Random(0, 9);
        }
        if (level == 2) {
            x = Random(10, 99);
            y = Random(10, 99);
        }
        if (level == 3) {
            x = Random(100, 999);
            y = Random(100, 999);
        }
        if (level == 4) {
            x = Random(1000, 9999);
            y = Random(1000, 9999);
        }
        Scanner scnr = new Scanner(System.in);
        System.out.println("How much is " + x + " minus " + y);
        int answer = scnr.nextInt();
        if (answer == x - y) {
            int cresponse = Random(1, 4);
            if (cresponse == 1) {
                System.out.println("Very good!");
            }
            if (cresponse == 2) {
                System.out.println("Excellent!");
            }
            if (cresponse == 3) {
                System.out.println("Nice work!");
            }
            if (cresponse == 4) {
                System.out.println("Keep up the good work!");
            }
            return 1;
        } else {
            int iresponse = Random(1, 4);
            if (iresponse == 1) {
                System.out.println("No. Please try again.");
            }
            if (iresponse == 2) {
                System.out.println("Wrong. Try once more.");
            }
            if (iresponse == 3) {
                System.out.println("Don't give up!");
            }
            if (iresponse == 4) {
                System.out.println("No. Keep trying");

            }
            return 0;

        }
    }

    static int multiplication(int level) {
        int x = 0, y = 0;
        if (level == 1) {
            x = Random(0, 9);
            y = Random(0, 9);
        }
        if (level == 2) {
            x = Random(10, 99);
            y = Random(10, 99);
        }
        if (level == 3) {
            x = Random(100, 999);
            y = Random(100, 999);
        }
        if (level == 4) {
            x = Random(1000, 9999);
            y = Random(1000, 9999);
        }
        Scanner scnr = new Scanner(System.in);
        System.out.println("How much is " + x + " times " + y);
        int answer = scnr.nextInt();
        if (answer == x * y) {
            int cresponse = Random(1, 4);
            if (cresponse == 1) {
                System.out.println("Very good!");
            }
            if (cresponse == 2) {
                System.out.println("Excellent!");
            }
            if (cresponse == 3) {
                System.out.println("Nice work!");
            }
            if (cresponse == 4) {
                System.out.println("Keep up the good work!");
            }
            return 1;
        } else {
            int iresponse = Random(1, 4);
            if (iresponse == 1) {
                System.out.println("No. Please try again.");
            }
            if (iresponse == 2) {
                System.out.println("Wrong. Try once more.");
            }
            if (iresponse == 3) {
                System.out.println("Don't give up!");
            }
            if (iresponse == 4) {
                System.out.println("No. Keep trying");


            }
            return 0;


        }
    }

    static int division(int level) {
        int x = 0, y = 0;
        if (level == 1) {
            x = Random(1, 9);
            y = Random(1, 9);
        }
        if (level == 2) {
            x = Random(10, 99);
            y = Random(10, 99);
        }
        if (level == 3) {
            x = Random(100, 999);
            y = Random(100, 999);
        }
        if (level == 4) {
            x = Random(1000, 999);
            y = Random(1000, 999);
        }
        Scanner scnr = new Scanner(System.in);

        System.out.println("How much is " + x + " Divide " + y);
        int answer = scnr.nextInt();

        if (answer == x / y) {
            int cresponse = Random(1, 4);
            if (cresponse == 1) {
                System.out.println("Very good!");
            }
            if (cresponse == 2) {
                System.out.println("Excellent!");
            }
            if (cresponse == 3) {
                System.out.println("Nice work!");
            }
            if (cresponse == 4) {
                System.out.println("Keep up the good work!");
            }
            return 1;
        } else {
            int iresponse = Random(1, 4);
            if (iresponse == 1) {
                System.out.println("No. Please try again.");
            }
            if (iresponse == 2) {
                System.out.println("Wrong. Try once more.");
            }
            if (iresponse == 3) {
                System.out.println("Don't give up!");
            }
            if (iresponse == 4) {
                System.out.println("No. Keep trying");

            }
            return 0;

        }
    }
}






