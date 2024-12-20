//ANSWER 1: Discount Offers

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        int[] amount = new int[] { 469, 469, 625, 625, 1000, 899, 999, 625, 725, 500 };
        System.out.println("Select the product from the below list");
        System.out.println("1)Women T-shirts - Rs." + amount[0]);
        System.out.println("2)Men T-shirts - Rs." + amount[1]);
        System.out.println("3)Kids T-shirts - Rs." + amount[2]);
        System.out.println("4)Women Ethnic Wear - Rs." + amount[3]);
        System.out.println("5)Men Formals - Rs." + amount[4]);
        System.out.println("6)Women Western Wear- Rs." + amount[5]);
        System.out.println("7)Kids Night Suit - Rs." + amount[6]);
        System.out.println("8)Men Jeans- Rs." + amount[7]);
        System.out.println("9)Women Sarees Rs." + amount[8]);
        System.out.println("10)Girl Skirts- Rs." + amount[9]);
        System.out.println("How many products you want to purchase?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter product purchased");
        int totalAmount = 0;
        for (int i = 0; i < n; i++) {

            System.out.print("Product Number: ");
            int pNumber = sc.nextInt();
            totalAmount += amount[pNumber - 1]; // b/c indexing of amount is from 0 and I am taking here from 1

        }

        if (n >= 5 && totalAmount >= 3000 && totalAmount % 10 == 5) {
            System.out.println("Congrats! You are eligible for 50% discount on your total purchase..");
            System.out.println("Your actual total is " + totalAmount);
            System.out.println("Your total amount after discount is " + totalAmount / 2);
        } else {
            System.out.println("Better luck next time!!");
            System.out.println("Your total purchase amount is " + totalAmount);
        }

    }
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 
Discount Offers
A branded clothing company, Ria Stores, announces a special offer to customers on the purchase of newly launched products. 
Ria Stores offers special discounts; if the customer purchases a minimum of 5 products with a total purchase amount of more than 3000 and ends with digit 5, then the customer will get 50% discount on the total purchase amount.
Product	Price
Women T-shirts	469
Men T-shirts	469
Kids T-shirts	625
Women Ethnic Wear	625
Men Formals	1000
Women Western Wear	899
Kids Night Suit	999
Men Jeans	625
Women Sarees	725
Girl Skirts	500

Input Format:
This application will take an integer value  ‘n’ that corresponds to the number of product purchased by customer followed by the item number purchased (n times)

Output Format:
The output will show the discounts given to the customer based on conditions applied

Refer sample input and output for formatting specifications.

[All text in bold corresponds to input and the rest corresponds to output.]

Sample Input and Output:
Sample Input 1:
Select the products from the below list
1)Women T-shirts - Rs.469
2)Men T-shirts - Rs.469
3)Kids T-shirts - Rs.625
4)Women Ethnic Wear - Rs.625
5)Men Formals - Rs.1000
6)Women Western Wear - Rs.899
7)Kids Night Suit - Rs.999
8)Men Jeans - Rs.625
9)Women Sarees - Rs.725
10)Girl Skirts - Rs.500
How many products you want to purchase?
5
Enter products purchased
Product Number: 5
Product Number: 5
Product Number: 5
Product Number: 4
Product Number: 5

Sample Output 1:
Congrats! You are eligible for 50% discount on your total purchase..
Your actual total is 4625
Your total amount after discount is 2312

Sample Input 2:
Select the products from the below list
1)Women T-shirts - Rs.469
2)Men T-shirts - Rs.469
3)Kids T-shirts - Rs.625
4)Women Ethnic Wear - Rs.625
5)Men Formals - Rs.1000
6)Women Western Wear - Rs.899
7)Kids Night Suit - Rs.999
8)Men Jeans - Rs.625
9)Women Sarees - Rs.725

10)Girl Skirts - Rs.500
How many products you want to purchase?
6
Enter products purchased
Product Number: 1
Product Number: 2
Product Number: 5
Product Number: 6
Product Number: 9
Product Number: 10

Sample Output 2:
Better luck next time!!
Your total purchase amount 4062

*/
