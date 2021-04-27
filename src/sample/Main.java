package sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Double amount = 700.75;
        System.out.println("Παρακαλώ δώστε την επιλογή σας:");
        System.out.println("1. Προβολή Υπολοίπου");
        System.out.println("2. Κατάθεση");
        System.out.println("3. Ανάληψη");
        System.out.println("4. Επιστροφή στο αρχικό μενού");

        Scanner amountScanner = new Scanner(System.in);
        Integer userChoise = amountScanner.nextInt();

        switch (userChoise) {
            case 1: {
                System.out.println("Επιλέξατε την επιλογή: Προβολή Υπολοίπου");
                System.out.println("Το υπολοιπό σας είναι: " + amount + "€");
                break;
            }

            case 2: {
                System.out.println("Επιλέξατε την επιλογή: Κατάθεση");
                System.out.println("Παρακαλώ εισάγετε το ποσό που θέλετε να καταθέσετε");

                Scanner addScanner = new Scanner(System.in);
                Double addCash = addScanner.nextDouble();
                amount += addCash;

                System.out.println("Το νέο σας υπόλοιπο είναι: " + amount + "€");
                break;
            }

            case 3: {
                System.out.println("Επιλέξατε την επιλογή: Ανάληψη");
                System.out.println("Παρακαλώ εισάγετε το ποσό που θέλετε να παραλάβετε");

                Scanner removeScanner = new Scanner(System.in);
                Double removeCash = removeScanner.nextDouble();
                amount -= removeCash;

                System.out.println("Το νέο σας υπόλοιπο είναι: " + amount + "€");
                break;
            }

            case 4: {
                //
            }

            default: {
                System.out.println("Αυτό που επέλεξες δεν υπάρχει.");
                break;
            }
        }
    }
}
