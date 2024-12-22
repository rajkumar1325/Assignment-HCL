// *******************************************EMPLOYEE MANAGEMENT PROGRAM*****************************************
import java.util.*;

public class EmployeeManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of emp data u wanted to insert :");
        int n = Integer.parseInt(sc.nextLine());   // Integer.parseInt() :: convert String to its corresponding integer value.

        List<String> empId = new ArrayList<>();
        List<String> empNames = new ArrayList<>();
        List<Double> empSalaries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee id, Name, salary:");
            String input = sc.nextLine();

            String[] details = input.split(",");    //details:: store the value of splitted input {String[] :: Array of String}

            // Add the details to respective lists
            empId.add(details[0]);
            empNames.add(details[1]);
            empSalaries.add(Double.parseDouble(details[2]));  //Double.parseDouble convert String into a double type.
        }

        System.out.println("Displaying SAP IDS");
        System.out.println(displayId(empId));

        System.out.println("Displaying Emp names");
        System.out.println(displayName(empNames));

        System.out.println("Displaying Emp salary");
        System.out.println(displaySal(empSalaries));

        sc.close();
    }

    // Method to return comma-separated employee IDs
    public static String displayId(List<String> id) {
        return String.join(",", id);
    }

    // Method to return comma-separated employee names
    public static String displayName(List<String> names) {
        return String.join(",", names);
    }

    // Method to return comma-separated employee salaries
    public static String displaySal(List<Double> salaries) {
        StringBuilder result = new StringBuilder();
        for (double salary : salaries) {
            result.append(String.format("%.2f", salary)).append(",");
        }
        // Remove the trailing comma
        return result.substring(0, result.length() - 1);
    }
}





///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*

Employee Details
Praneeth Packaging Company is one of the leading Corrugated box manufacturing companies. It has manufacturing units in different locations in India, and Several employees are working in that organization.
 
Swetha is working as an accounts manager for that company. She must keep track of employee records. Presently, she is using the manual bookkeeping process. It’s taking a lot of time to process and update the records. Swetha requests you to write a program to read multiple Employee details like ID, name, and salary. Store and print them.
 
Constraints:
Use for each loop to iterate and print the elements.
Use Spring split method
Create 3 methods displayId(), displayName(), displaySal() which returns comma separated list of items.

Note:
salary value should be displayed up to 2 decimal places.
Refer sample input and output for formatting specifications.
All text in bold corresponds to input and the rest corresponds to output.

Sample Input and Output :
 
Enter no emp data u wanted to insert :
3
Enter Emp id,name,salary:
52003640,Balakrishna,45000.00
52003645,Pavan,55000.00
52003649,Sai,48000.00
Displaying SAP IDS
52003640,52003645,52003649
Displaying Emp names
Balakrishna,Pavan,Sai
Displaying Emp salary
45000.00,55000.00,48000.00
*/
