package CodsoftTask3;

import java.util.Scanner;
public class Task3
{
    public static void main(String args[]){

        int Current_balance = 89000;
        int Withdraw, Deposit;
        Scanner sc = new Scanner(System.in);
        int Pin = 1234;
        System.out.println("Enter Pin : ");
        int entry = sc.nextInt();
        int i = 0;
        if(entry!=Pin){

            while(true){
                i++;
                System.out.println("Invalid Pin!!");
                System.out.println("Please enter the Valid Pin: ");
                entry = sc.nextInt();
                if(entry==Pin)
                {
                    break;
                }

            }
        }
        if(entry==Pin)
        {
            System.out.println("<------Welcome To The SBI ATM Bank------>");
            System.out.println("Please Select Your Options Given Below:");
            while(true)
            {
                System.out.println("Select 1 To Withdraw The Money From The Bank Account.");
                System.out.println("Select 2 To Check The Current Balance In The Account.");
                System.out.println("Select 3 To Deposit The Money In The Bank Account.");
                System.out.println("Select 4 To Exit The Options.");
                int Selection = sc.nextInt();
                switch(Selection)
                {

                    case 1:
                        System.out.println("Enter the Money to be Withdrawn From The Bank Account: ");
                        Withdraw = sc.nextInt();
                        if(Withdraw>Current_balance||Current_balance==0)
                        {
                            System.out.println("Sorry you have insufficient balance in the Bank Account!!");
                            break;
                        }
                        System.out.println("Please Collect your Money!!");
                        Current_balance -= Withdraw;
                        break;

                    case 2:
                        System.out.println("Current Balance in the Bank Account is :- "+Current_balance);
                        break;
                    case 3:
                        System.out.print("Enter the Money to be deposited in the Bank Account: ");
                        Deposit = sc.nextInt();
                        Current_balance += Deposit;
                        System.out.println("Your Money has been deposited successfully in the Bank Account");
                        break;

                    case 4:
                        System.out.println("Thank you!!");
                        System.out.println("Come Back Again!!");
                        System.exit(0);
                }
            }
        }
    }
}
