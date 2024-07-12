import java.util.Scanner;
class GuessingGame
{
    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in); 
          System.out.println("Welcome to the guessing game!");
          System.out.println("How many rounds you want to play?");
          int b=sc.nextInt();
          int min=1;int max=100;
          int number=min+ (int) (Math.random()*max);
          int count=0;
          for(int i=0;i<b;i++)
          {
            System.out.println("What is your guessed number?");
            int guessedNumber=sc.nextInt();
            if(number==guessedNumber)
            {
               System.out.println("Hurray! You won!");
               count++;
            }
            else if(number<guessedNumber)
            {
              System.out.println("GuessedNumber is Greater than the number.");
            }
            else if(number>guessedNumber)
            {
              System.out.println("GuessedNumber is lesser than the number.");
            }

          }
          System.out.println("Your score based upon your attempts are:"+count);
          sc.close();
        
      
    }
    
  
}
         