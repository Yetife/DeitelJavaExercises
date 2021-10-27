package chapterSeven;

import java.util.Scanner;

public class SalesCommision {
    public static void main(String[] args) {
        int[] salaryRanges = new int[9];

        int gross = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter gross");
        System.out.println("Enter -1 to exit");
        gross = scanner.nextInt();

        conditionForsalesCommission(salaryRanges, gross, scanner);
        printTable(salaryRanges);
    }

    private static void printTable(int[] salaryRanges) {
        System.out.println(" Salary\t\t Frequency");
        System.out.printf(" $200-299 %8d%n $300-399 %8d%n $400-499 %8d%n $500-599 %8d%n " +
                "$600-699 %8d%n $700-799 %8d%n $800-899 %8d%n $900-999 %8d%n $1000 %11d%n", salaryRanges[0], salaryRanges[1], salaryRanges[2], salaryRanges[3],
                salaryRanges[4], salaryRanges[5], salaryRanges[6], salaryRanges[7], salaryRanges[8]);
    }

    private static void conditionForsalesCommission(int[] salaryRanges, int gross, Scanner scanner) {
        while (gross != -1) {
            int salary = (int) (200 + (0.09 * gross));
            if (salary >= 200 && salary <= 299) {
                salaryRanges[0]++;
            } else {
                if (salary >= 300 && salary <= 399) {
                    salaryRanges[1]++;
                } else {
                    if (salary >= 400 && salary <= 499) {
                        salaryRanges[2]++;
                    } else {
                        if (salary >= 500 && salary <= 599) {
                            salaryRanges[3]++;
                        } else {
                            if (salary >= 600 && salary <= 699) {
                                salaryRanges[4]++;
                            } else {
                                if (salary >= 700 && salary <= 799) {
                                    salaryRanges[5]++;
                                } else {
                                    if (salary >= 800 && salary <= 899) {
                                        salaryRanges[6]++;
                                    } else {
                                        if (salary >= 900 && salary <= 999) {
                                            salaryRanges[7]++;
                                        } else {
                                            if (salary >= 1000) {
                                                salaryRanges[8]++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Enter gross");
            System.out.println("Enter -1 to exit");
            gross = scanner.nextInt();
        }
    }
}

