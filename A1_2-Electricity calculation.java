// Electricity Bill Generation
import java.lang.Thread.State;
import java.util.Scanner;

public class Electricity {
    public static float calAmount(int unitCons) {
        float total; 
        float unitPrice;

        if (unitCons <= 199) {
            unitPrice = 1.20f;
            total = unitCons * unitPrice;
        } 
        else if (unitCons < 400) { 
            unitPrice = 1.50f;
            total = unitCons * unitPrice;
        } 
        else if (unitCons < 600) { 
            unitPrice = 1.80f;
            total = unitCons * unitPrice;
        } 
        else {
            unitPrice = 2.00f;
            total = unitCons * unitPrice;
        }
        System.out.println("Amount Charges @Rs."+ unitPrice + " per unit: "+ total);
        return total; 
    }

    public static float calcSurcharge(float amount){
        float sCharge=0;
        if (amount>400) {
            sCharge = amount *0.15f;
            return sCharge;
            // sCharge = newAmount + amount;
        }
        return 0; // No surcharge for amounts <= 400
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculate Electricity Bill");
        System.out.print("Enter Customer ID: ");
        int customID = sc.nextInt();

        System.out.print("Enter the name of Customer: ");
        String customerName = sc.next();

        System.out.print("Enter the unit consumed by the Customer: ");
        int unitConsumed = sc.nextInt();

        System.out.println("\n\n");

        System.out.println("Electricity Bill");
        System.out.println("Customer Id: " + customID);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Unit consumed: " + unitConsumed);
        int calTotal = (int)calAmount(unitConsumed);    //stores Total amount in integer
        int surchargeTotal = (int)calcSurcharge(calTotal);
        System.out.println("Surcharge Amount"+ surchargeTotal);
        System.out.println("Net amount to be paid : " + (calTotal + surchargeTotal));   //use parenthesis to avoid concatination


    }
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Electricity Bill Generation
Jack Dowson, the founder of “Dowson Enterprises” wished to design an automated Electricity System to let its customers pay their electricity bills using an online platform. 
As a part of this requirement, Jack Dowson wanted to write a piece of code for his company’s Electricity System where the customer must enter details like customer ID, name, and unit consumed. The final electricity bill will be calculated and generated based on the units entered.

Tariff details are as follow :
Unit Consumed	Unit Price
upto 199 units	@1.20
200 and above but less than 400	@1.50
400 and above but less than 600	@1.80
600 and above	@2.00

Note: If bill exceeds Rs. 400 then a surcharge of 15% will be charged and the minimum bill should be of Rs. 100/-
Amount to be charged and surcharge, if any to be calculated in separate static methods
calcAmount(int) with return type as float
calcSurcharge(float) with return type as float

Help Jack Dowson to achieve this task.

Input Format:
The first input is an integer value that corresponds to the customer id.
The second input is a string value that corresponds to the customer name
The third input is a integer value that corresponds to the electricity unit consumed by customer

Output Format:
Refer sample output for formatting specifications.

[All text in bold corresponds to input and the rest corresponds to output.]

Sample Input and Output:

Calculate Electricity Bill
Enter Customer ID: 1001
Enter the name of the customer: Sana
Enter the unit consumed by the customer: 800

Electricity Bill
Customer ID :1001
Customer Name :Sana
Unit Consumed :800
Amount Charges @Rs. 2  per unit :1600
Surcharge Amount :240
Net Amount to be paid :1840
*/
