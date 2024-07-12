import java.util.Scanner;
import java.util.ArrayList;
class Atm
 {
    public static double totalAmount=10000;
     public static int i=1;
     public static boolean valid=false;
     public static boolean signup=false;
     public static boolean flag=true;
     public static String user;
     public static String pin;
     public static String userCome;
     public static String pinReg;
    
    public static void main(String args[]) 
    {
        while(0<1)
        {
         i=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("#################  WELCOME TO ATM SERVICE #################"
                          +"\n  ########################       ########################"  
                           +"\n   #####################################################");
       System.out.println("1.Login"
                           +"\n2.Signup");
       int choose=sc.nextInt();
       switch(choose)
       {
        case 1:
            login(sc);
            System.out.println("Signup to open the Registered Id");
            Signup(sc);
            Atm.valid=Atm.toVerifyPin(pin); 
            if(user.equals(userCome))
            {
               if(pinReg.equals(pin))
               {
                 System.out.println("user and pin are validated");
               }
               else
               {
                System.out.println("pin not validated");
                i++;
               }
            }
               else
               {
               System.out.println("user and pin are not validated");
               i++;
               }
            
            break;
        case 2:
            Signup(sc);
            Atm.tosignup(user);
            break;
       }
                   
       boolean authority=Atm.toAuthenticate(user);
       if(authority)
       {
        System.out.println("Welcome");
    }
       else
       System.out.println("User and Pin are not validated."

                          +"\nThank you.Visit again");
         boolean consider=Atm.tosignup(user);
       TransactionHis tran=new TransactionHis(); 
       if(Atm.valid||consider)
        {
        if(flag)
        {
        while(i==1)
        {
       System.out.println("Enter the number what you are looking for: ");
       System.out.println("1.WithDraw"+
                          "\n2.Deposit"+
                          "\n3.Transfer"+
                          "\n4.Quit"+
                          "\n5.Transaction History");
       System.out.println("Enter your choice: ");
       int choice=sc.nextInt();
       switch(choice)
       {
        case 1:
            withDraw();
            break;
        case 2:
            deposit();
            break;
        case 3:
            tran.transfer(sc);
            break;
        case 4:
            quit();
            break;
        case 5:
            tran.transactionHistory();
            break;
        default:
            System.out.println("You entered wrong choice");
       }
    }
}
      }
        }
    }
    

    public static void login(Scanner sc)
    {
        sc=new Scanner(System.in);
        System.out.println("Enter your userid: ");
        userCome=sc.nextLine();
        System.out.println("Enter your userpin: ");
        pinReg=sc.nextLine();
        System.out.println("Welcome"+userCome+"Userid and pin Registered");
    }
    public static void Signup(Scanner sc)
    {
        sc=new Scanner(System.in);
        System.out.println("Enter your userId: ");
        user=sc.nextLine();
        System.out.println("Enter your userPin: ");
        pin=sc.nextLine();
    }
 
   public static boolean toAuthenticate(String user)
    {
             for(int i=0;i<user.length();i++)
             {
               char ch=user.charAt(i);
               if(!(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'))                 
               {
                return false;
              }
                 
             }
             return true;
    }
    public static boolean tosignup(String user)
    {
             for(int i=0;i<user.length();i++)
             {
               char ch=user.charAt(i);
               if(!(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'))                 
               {
                return false;
              }
                 
             }
             return true;
    }
    public static boolean toVerifyPin(String pin)
    {
        if(pin.equals(pinReg))
        {
        return true;
        }
        else
        return false;
    }

    public static void withDraw()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Your TotalAmount in your Account is "+totalAmount+".How much Amount you want to WithDraw?");
        double draw=sc.nextDouble();
        totalAmount-=draw;
        System.out.println("Your Total Account balance after your withdrawn: "+totalAmount);
    }
    public static void deposit()
    {
        
       Scanner sc=new Scanner(System.in);
        System.out.println("Your TotalAmount in your Account is "+totalAmount+".How much Amount you want to Deposit?");
        double depo=sc.nextDouble();
        totalAmount+=depo;
        System.out.println("Your Total Account balance after your deposit: "+totalAmount); 
    }
    public static void quit()
    {
        System.out.println("Thanking You! You are logged out");
        i++;
    }

}

   class TransactionHis
   {
      private ArrayList<String> history;
      private ArrayList<Integer> Account;
       private ArrayList<Double> Amount;
       public String userIdNo;
     public int accno;
     public double transfer;
       public TransactionHis()
       {
        this.history=new ArrayList<String>();
      this.Account=new ArrayList<Integer>();
       this.Amount=new ArrayList<Double>();
       }
       public void transfer(Scanner sc)
       {
        sc = new Scanner(System.in);                                 
       System.out.println("Enter userName: ");
       userIdNo=sc.nextLine();
       history.add(userIdNo);
       System.out.println("Enter Accountno: ");
       accno=sc.nextInt();
       Account.add(accno);
       System.out.println("Your TotalAmount in your Account is "+Atm.totalAmount+".How much Amount you want to Transfer?");
       transfer=sc.nextDouble();
       Amount.add(transfer);
       Atm.totalAmount-=transfer;
       System.out.println("Your Account balance: "+Atm.totalAmount);
       }
       public void transactionHistory()
        {
        for(int i=0;i<history.size();i++)
       {
        System.out.println("username: "+history.get(i)+" "+"Account No: "+Account.get(i)+" "+"Transferred Amount: "+Amount.get(i)+Atm.totalAmount);
       }
    
        }
    }



    

    

