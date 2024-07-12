import java.util.Scanner;
class Online
{
    public static String nameUser;
    public static int pass;
    public static int word;
    public static String passenger[];
    public static int agePassenger[];
    public static String berth[];
    public static int seatNo[];
    public static int passWord;
    public static String str;
    public static String toCheck,equ;
    public static int i=1;

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to online reservation system");
        System.out.println("1.Login"
                           +"\n2.Signup");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                validLogin();
                 break;
            case 2:
              signup();
                 break;
              
        }
        while(i==1)
        {
        System.out.println("*******For Reservation*******");
        System.out.println("1.Reservation"
                           +"\n2.Cancel Reservation ticket"
                           +"\n3.Exit");
        System.out.println("Enter your choice");
        int choose=sc.nextInt();
        switch(choose)
        {
        case 1:
          reservation();
          break;
        case 2:
          cancelTicket();
          break;
        case 3:
          exit();
          break;
         }
}
    
    }
    public static void validLogin()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your username: ");
        nameUser=sc.nextLine();
        System.out.println("Enter your username again: ");
        toCheck=sc.nextLine();
        System.out.println("Enter password: ");
        word=sc.nextInt();
        System.out.println("Enter your password again: ");
        pass=sc.nextInt();
        if(toCheck.equals(nameUser))
        {
            if(word==pass)
            {
            System.out.println("Valid username and password");
            }
        }
        else 
        System.out.println("Not a valid user Id and Password");
        sc.close();
    }
    public static void signup()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username: ");
        String username=sc.nextLine();
        System.out.println("Enter password: ");
        passWord=sc.nextInt();
        System.out.println("welcome "+username);
    }
    public static void reservation() 
    {
        int maxi=100;
        int mini=1;
        StringBuilder addPassengerr=new StringBuilder();
        int length=10;
        String nums="1234567890";
        String passenger[]=new String[5];
        int agePassenger[]=new int[5];
        String berth[]=new String[5];
        int seatNo[]=new int[5];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter how many passengers(For one userid you can book upto five passengers: ");
        int b=scan.nextInt();
        for(int i=0;i<b;i++)
        {
          scan.nextLine();
          System.out.println("Enter Passenger name: ");
          passenger[i]=scan.nextLine();
          System.out.println("Enter age: ");
          agePassenger[i]=scan.nextInt();
          System.out.println("Enter which berth you like"
                              +"\n1.Lower berth"
                              +"\n2.upper berth"
                              +"\n3.Aisle");
        berth[i]=scan.next();
        seatNo[i]=mini+(int)(Math.random()*maxi);
        }
        scan.nextLine();
        System.out.println("Enter Departure place: ");
        String place=scan.nextLine();
        System.out.println("Enter Destination place: ");
        String destination=scan.nextLine();
        System.out.println("Enter train number: ");
        int num=scan.nextInt();
        System.out.println("Enter date of journey(dd/mm/yyyy): ");
        String date=scan.next();
        for(int i=0;i<length;i++)
        {
            int pnrnum=(int)(nums.length()*Math.random());
            addPassengerr.append(nums.charAt(pnrnum));
        }
        String str=addPassengerr.toString();
        equ=str;
        for(int i=0;i<b;i++)
        {
        System.out.println("Name: "+passenger[i]+" Age: "+agePassenger[i]+" Train Number: "+num+" Berth: "+berth[i]+" SeatNo: "+seatNo[i]+" Date: "+date+" Departure Place: "+place+" Destination Place: "+destination+ " PNR Number: " +str);
        System.out.println("Reservation seat allocated");
        }
      }
      public static void cancelTicket()
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your PNR number");
        String enter=sc.nextLine();
        if(enter.equals(equ))
        {
            System.out.println("Reservation Ticket cancelled.");
        }
      }
      public static void exit()
      {
        System.out.println("Session Logged out.Visit Again");
        i++;
      }
}