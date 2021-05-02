package sample.logic;

import java.util.Scanner;

public class BillPayment {

    Double amount;
    Scanner billscanner = new Scanner(System.in);

    public void createBillPlaymentMenu(Double amount) {
        this.amount = amount;

        System.out.println("Πληκτρολογήστε την επωνυμίας της εταιρίας για την πληρωμή του λογαριασμού");
        String billCompany = billscanner.nextLine();

        System.out.println("Πληκτρολόγησε τον αριθμό λογαριασμού");
        String billNumber = billscanner.nextLine();

        System.out.println("ΠΛηκτρολόγησε το ποσό πληρωμής");

        try {
            Double billAmount = billscanner.nextDouble();

            if (billAmount <= amount) {
                System.out.println("Πληρώσατε " + billAmount + " € στη " + billCompany);

                Double newAmount = amount - billAmount;
                this.amount = newAmount;
                getNewAmount();
            } else {
                System.out.println("Το υπόλοιπό σας δεν επαρκεί για να πραγματοποιηθεί η συναλλαγή");
            }
        } catch (Exception e) {
            System.out.println("Τα δεκαδικά στο ποσό που πληκτρολογήσατε πρέπει να διαχωρίζονται με κόμμα (,) και όχι με τελεία (.)");
        }
    }

    public Double getNewAmount() {
        return amount;
    }
}
