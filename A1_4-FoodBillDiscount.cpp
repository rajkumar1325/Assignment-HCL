// ************************************************************************Food Bill Discount******************************************************
import java.util.Scanner;

public class Q004_senior_citizen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter Bill amount: ");
        float bill = sc.nextInt();

        if (age>=60) {
            System.out.println("Senior citizen");
            float discount = bill * 0.3f;
            if (discount>=300) {
                bill = bill - 300;
                System.out.println("Final bill amount: " + bill);
            }
            else{
                bill = bill - discount;
                System.out.println("Final bill amount: " + bill);
                // System.out.println("discount  " + discount);

            }
        }
        else{
            System.out.println("Normal user");
            System.out.println("Final Bill amount: " + bill);
        }
    }
    
}






///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*

Food Bill Discount
Swato is a food delivery application. To increase their customer base, they plan to offer different discount offers. As GrandParents' Day is nearing, they plan to give offers to Senior citizens. The customer base is segregated into Senior citizen and regular user. They plan to write one small application to implement discount offers. If the person is a senior citizen, a 30% discount on the bill amount will be offered with a maximum discount of Rs. 300. 
Note : A Senior citizen can avail of a maximum ₹300 in a single order. 

Input Format:
The first line of the input is an integer that corresponds to the age of the person, followed by bill amount

Output Format:
The output should display "Regular User" or " Senior Citizen " based on the conditions given.
Refer sample input and output for formatting specifications.
 
[All text in bold corresponds to input and the rest corresponds to the output.]
 
Test Case 1: 
Sample Input
Enter age: 20
Enter Bill amount:300
Sample Output
Normal User
Final Bill amount:300

Test Case 2:
Sample Input
Enter age: 65
Enter Bill amount: 5678
Sample Output 
Senior Citizen
Final Bill amount:5378

Test Case 3:
Sample Input
Enter age: 65
Enter Bill amount: 456
Sample Output 
Senior Citizen
Final Bill amount: 319.20


*/
