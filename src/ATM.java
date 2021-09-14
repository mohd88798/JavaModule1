import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double account_balance= sc.nextDouble();
        System.out.print("Enter amount to be withdrawn: ");
        double amt_to_withdraw= sc.nextDouble();

        if (amt_to_withdraw>0 && amt_to_withdraw<=2000 && account_balance>=amt_to_withdraw+0.5 && amt_to_withdraw%5==0 && account_balance>0){
            account_balance =account_balance-amt_to_withdraw-0.5;
        }
        System.out.println("Balance = "+account_balance);
    }
}
