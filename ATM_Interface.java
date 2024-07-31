import java.util.*;



class UserAccount{
    float Balance = 1000;
    int PIN = 5694;
}

class ATM{
   
    UserAccount ua = new UserAccount();

    public void CheckPin(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the pin: ");
        int enteredPin = sc.nextInt();

        // check if pin is correct or not!!!
        if(enteredPin == ua.PIN){
            menu();
        }
        else
        {
            System.out.println("You have entered wrong pin");
            CheckPin();
        }
    }

    public void menu(){

        System.out.println("Please enter your choise:");
        System.out.println("<------------------------------------------------------------>");
        System.out.println("1. Check Bank Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option == 1)
        {
            checkBalance();
        }
        else if(option == 2){
            withdrawMoney();
        }
        else if(option==3)
        {
            depositMoney();    
        }
        else if(option ==4)
        {
            System.out.println("<----------Thank you---------->");
        }
        else {
            System.out.println("Enter a valid choise");
            menu();
        }
    }


    // check bank balance 

public void checkBalance(){
    System.out.print("Balance:  " + ua.Balance);
    menu();
}

// withdraw money from ATM 

public void withdrawMoney()
{
    System.out.print("Enter the amount to withdraw");
    Scanner sc = new Scanner(System.in);
    float Amount = sc.nextInt();

    if(Amount > ua.Balance)
    {
        System.out.println("Unsufficient Balance");
    }
    else{
        ua.Balance  = ua.Balance-Amount;
        System.out.println("Money withdrwan Successfully!");   
    }
    menu();
}


// deposit money in Bank 
public void depositMoney()
{
System.out.print("Enter the amount");
Scanner sc = new Scanner(System.in);
    float Amount  = sc.nextInt();

    ua.Balance = ua.Balance + Amount;
    System.out.println("Money Deposited Successfully!");
    System.out.println();
    menu();

}
}
public class ATM_Interface{
    public static void main(String[] args) {
        ATM r = new ATM();
        r.CheckPin();
    }
}




    
