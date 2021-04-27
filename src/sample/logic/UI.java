package sample.logic;

import java.util.Scanner;

public class UI {

    private Double amount = 700.75;
    private Integer userChoice;

    public void createUI() {
        System.out.println("Παρακαλώ δώστε την επιλογή σας:");
        System.out.println("1. Προβολή Υπολοίπου");
        System.out.println("2. Κατάθεση");
        System.out.println("3. Ανάληψη");
        System.out.println("4. Επιστροφή στο αρχικό μενού");

        Scanner amountScanner = new Scanner(System.in);
        userChoice = amountScanner.nextInt();

        switch (userChoice) {
            case 1: {
                System.out.println("Επιλέξατε την επιλογή: Προβολή Υπολοίπου");
                System.out.println("Το υπολοιπό σας είναι: " + amount + "€");
                break;
            }

            case 2: {
                System.out.println("Επιλέξατε την επιλογή: Κατάθεση");
                System.out.println("Παρακαλώ εισάγετε το ποσό που θέλετε να καταθέσετε");

                //Scanner addScanner = new Scanner(System.in);
                Double addCash = amountScanner.nextDouble();
                amount += addCash;

                System.out.println("Το νέο σας υπόλοιπο είναι: " + amount + "€");
                break;
            }

            case 3: {
                System.out.println("Επιλέξατε την επιλογή: Ανάληψη");
                System.out.println("Παρακαλώ εισάγετε το ποσό που θέλετε να παραλάβετε");

                //Scanner removeScanner = new Scanner(System.in);
                Double removeCash = amountScanner.nextDouble();
                amount -= removeCash;

                System.out.println("Το νέο σας υπόλοιπο είναι: " + amount + "€");
                break;
            }

            case 4: {
                System.out.println("under construction");
                break;
            }

            default: {
                System.out.println("Αυτό που επέλεξες δεν υπάρχει.");
                break;
            }
        }
    }
}
