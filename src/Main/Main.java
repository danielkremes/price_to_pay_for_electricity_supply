package Main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        boolean continueLoop = true;

        while (continueLoop) {
            String menu = "C(Comercial), R(Residency), I(Industry)";
            String priceToBuyMessage = "Price to pay is ";

            JOptionPane.showMessageDialog(null, menu);
            try {
                String quantityKwh = JOptionPane.showInputDialog("Quantity kWh consumption ?");
                String typeResidency = JOptionPane.showInputDialog("Type residency ?").toUpperCase();
                float quantityKwhSystem = Float.parseFloat(quantityKwh);
                float price = 0;

                switch (typeResidency) {
                    case "R":
                        if (quantityKwhSystem <= 500) {
                            price = quantityKwhSystem * 0.40F;
                            JOptionPane.showMessageDialog(null, priceToBuyMessage + price);
                        } else {
                            price = quantityKwhSystem * 0.65F;
                            JOptionPane.showMessageDialog(null, priceToBuyMessage + price);
                        }
                        break;
                    case "C":
                        if (quantityKwhSystem <= 1000) {
                            price = quantityKwhSystem * 0.55F;
                            JOptionPane.showMessageDialog(null, priceToBuyMessage + price);
                        } else {
                            price = quantityKwhSystem * 0.60F;
                            JOptionPane.showMessageDialog(null, priceToBuyMessage + price);
                        }
                        break;
                    case "I":
                        if (quantityKwhSystem <= 5000) {
                            price = quantityKwhSystem * 0.55F;
                            JOptionPane.showMessageDialog(null, priceToBuyMessage + price);
                        } else {
                            price = quantityKwhSystem * 0.60F;
                            JOptionPane.showMessageDialog(null, priceToBuyMessage + price);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error try again");
                } // END SWICH
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Certifique-se de inserir apenas números.");
                continue;
            }

            String continueOrNot = JOptionPane.showInputDialog("Would you like to continue or not (Q:quit) (Y:continue)").toUpperCase();
            if (continueOrNot.equals("Q")) {
                continueLoop = false;
                JOptionPane.showMessageDialog(null, "Program finished. thanks!");
            } // END WHILE
        } //END MAIN
    }
}
