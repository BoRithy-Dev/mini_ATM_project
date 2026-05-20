import jdk.jshell.Snippet;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AtmOperationServiceIml op = new AtmOperationServiceIml();
        int atmnumber = 123;
        int ping =123;
        System.out.println("Enter Atm Number : ");
        Scanner sc = new Scanner(System.in);
        int atmNumber = sc.nextInt();
        System.out.println("Enter Pin Number");
        int pingNumber = sc.nextInt();
        if((atmNumber == atmnumber) && (pingNumber == ping)){
            while (true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini Statement\n5.Exit");
                System.out.println("Enter Choice :");
                int ch = sc.nextInt();
                if(ch ==1){
                    op.viewBalance();
                } else if (ch == 2) {
                    System.out.println("Enter Amount to Withdraw");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch == 3) {
                    System.out.println("Enter Amount to Deposit: ");
                    double depositAmount = sc.nextDouble();
                    op.depositAmount(depositAmount);
                } else if (ch == 4) {
                    op.viewMiniStatement();

                } else if (ch==5) {
                    System.out.println("Please Collect your ATM card\n Thank you using ATM Machine");
                    System.exit(0);
                }
            }

        }else{
            System.out.println("Incorrect Atm Number or Ping");
            System.exit(0);
        }

    }
}