// ******************************************************Sales Commission************************************************************

import java.util.Scanner;
public class Q005_salesCommision {
    public static float incentiveCalc(float amount){
        float fixedSalary = 10000f;
        float commissionAmt=0f;
        float commissionRate;

        if (amount<=50000) {
            System.out.println("Please provide justification for low sales");
            System.out.println("Fixed Salary: " + fixedSalary);
            return commissionAmt;
        }
        else if(amount>50000 && amount<=100000){
            commissionRate = 1.0f;
            System.out.println("Commission offered is "+ commissionRate +"%");
            System.out.println("Fixed Salary: " + fixedSalary);
            commissionAmt = amount * (commissionRate/100);
            return commissionAmt;
        }

        else if(amount>100000 && amount<=200000){
            commissionRate = 2.5f;
            System.out.println("Commission offered is "+ commissionRate +"%");
            System.out.println("Fixed Salary: " + fixedSalary);
            commissionAmt = amount * (commissionRate/100);
            return commissionAmt;
        }

        else if(amount>200000 && amount<=300000){
            commissionRate = 3.8f;
            System.out.println("Commission offered is "+ commissionRate +"%");
            System.out.println("Fixed Salary: " + fixedSalary);
            commissionAmt = amount * (commissionRate/100);
            return commissionAmt;
        }

        else if(amount>300000 && amount<=400000){
            commissionRate = 4.2f;
            System.out.println("Commission offered is "+ commissionRate +"%");
            System.out.println("Fixed Salary: " + fixedSalary);
            commissionAmt = amount * (commissionRate/100);
            return commissionAmt;
        }

        else{
            commissionRate = 5.5f;
            System.out.println("Commission offered is "+ commissionRate +"%");
            System.out.println("Fixed Salary: " + fixedSalary);
            commissionAmt = amount * (commissionRate/100);         
            return commissionAmt;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details");
        System.out.print("sales executive id: ");
        int salesId = sc.nextInt();
        sc.nextLine();  //Consumes the newline char that is left by nextInt()
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Monthly sales amount: ");
        float salesAmount = sc.nextInt(); 

        System.out.println("\n");

        System.out.println("Sales executive Salary details");
        System.out.println("Sales Executive id " + salesId);
        System.out.println("Name: "+ name);
        System.out.println("Monthly sales amount: "+ salesAmount);
        float commissionTotal = incentiveCalc(salesAmount);
        System.out.println("Commission Amount: " + commissionTotal);
        System.out.println("Net salary: " + (commissionTotal + 10000));


    }
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*

Sales Commission
ABC CROP  is a product-based company that plans to expand its business and has deployed sales executives for different regions. Based on their sales completion, they were offered incentives.

The incentive is calculated monthly based on the sales made by the salesperson. To provide error-free and fast calculations, ABC CROP  has requested the programming team to generate an application to calculate the commission of a salesperson.
Monthly Sales	 % of commission offered
between 50000 and 100000	1%
between 100001 and 200000    	2.5%
between 200001 and 300000   	3.8%
>between 300001 and 400000   	4.2%
>400000	5.5%
**If the sale amount is below 50 K, the salesperson must provide a reason for low sales. 
** Every sales executive has a fixed salary of 10K.
Include a method calcComm that takes sales value as input and returns commission as output
float calcComm(double)
Input Format:

The first input is an integer value that corresponds to the Sales executive id.
The second input is a string value that corresponds to the Sales executive name.
The third input is an integer value that corresponds to the Sales executive Monthly sales.

Output Format:

Refer sample input and output for formatting specifications.

[All text in bold corresponds to input and the rest corresponds to output.]

Sample Input and Output:
Test Case 1:
Enter Details
Sales Executive id: 2001
Name: Ravi
Monthly sales amount: 80000.00
Sales Executive Salary details
Sales Executive id: 2001
Name: Ravi
Monthly sales amount: 80000.00
Commission offered:1.0%
Fixed salary Sales Executive: 10000.00
Sales Executive Commission amount: 800.00
Net Amount Paid to Sales Executive: 10800.00

Test Case 2:

Enter Details
Sales Executive id: 2003
Name: Tom
Monthly sales amount: 30000
Sales Executive Salary details
Sales Executive id: 2003
Name: Tom
Monthly sales amount: 30000.00
Commission offered: Please provide justification for low sales
Fixed salary: 10000.00
Commission amount: 0.00
Net salary: 10000.00


*/
