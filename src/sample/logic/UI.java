package sample.logic;

import java.util.Scanner;

public class UI {

    private Double amount = 700.75;
    private Integer userChoice;
    private Scanner scanner;

    public Choices createMenu() {
        Choices returnChoices;

        System.out.println("Παρακαλώ δώστε την επιλογή σας:");
        System.out.println("1. Προβολή Υπολοίπου");
        System.out.println("2. Κατάθεση");
        System.out.println("3. Ανάληψη");
        System.out.println("4. Πληρωμή Λογαριασμού");
        System.out.println("5. Έξοδος Προγράμματος");

        scanner = new Scanner(System.in);

        try {
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1: {
                    return Choices.DISPLAY;
                }

                case 2: {
                    return Choices.DEPOSIT;
                }

                case 3: {
                    return Choices.WITHDRAWAL;
                }

                case 4: {
                    return Choices.BILL_PAYMENT;
                }

                case 5: {
                    return Choices.EXIT;
                }

                default: {
                    return Choices.ERROR;
                }
            }
        } catch (Exception E) {
            return Choices.ERROR;
        }
    }

    public void createUI() {
        Choices userChoice;

        do {
            userChoice = createMenu();

            switch (userChoice) {
                case DISPLAY: {
                    System.out.println("Επιλέξατε την επιλογή: Προβολή Υπολοίπου");
                    System.out.println("Το υπολοιπό σας είναι: " + amount + "€");
                    break;
                }
                case DEPOSIT: {
                    System.out.println("Επιλέξατε την επιλογή: Κατάθεση");
                    System.out.println("Παρακαλώ εισάγετε το ποσό που θέλετε να καταθέσετε");

                    Double addCash = scanner.nextDouble();
                    amount += addCash;

                    System.out.println("Το νέο σας υπόλοιπο είναι: " + amount + "€");
                    break;
                }
                case WITHDRAWAL: {
                    System.out.println("Επιλέξατε την επιλογή: Ανάληψη");
                    System.out.println("Παρακαλώ εισάγετε το ποσό που θέλετε να παραλάβετε");

                    Double removeCash = scanner.nextDouble();

                    if (removeCash > amount) {
                        System.out.println("Παρουσιάστηκε σφάλμα!");
                        System.out.println("Το υπόλοιπό σας δεν επαρκεί για να πραγματοποιηθεί η συναλλαγή.");
                    } else {
                        amount -= removeCash;
                        System.out.println("Το νέο σας υπόλοιπο είναι: " + amount + "€");
                    }
                    break;
                }
                case BILL_PAYMENT: {
                    BillPayment billPayment = new BillPayment();
                    billPayment.createBillPlaymentMenu(amount);
                    amount = billPayment.getNewAmount();
                    System.out.println("Το υπόλοιπό μου είναι " + amount + " €");
                    break;
                }
                case ERROR: {
                    System.out.println("Αυτό που επέλεξες δεν υπάρχει.");
                    break;
                }
            }
        } while (userChoice != Choices.EXIT);
    }
}
