import java.util.Scanner;

public class NumberGuessingGame
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
           System.out.println('\n');
           System.out.println("-------> WELCOME TO GUESSING GAME <-------");
           System.out.println("Rule : Guess a Number between 1 to 10 with three choices and Win the Game !");
           System.out.println("Lets Start the Game !!!!");
           System.out.println('\n');
            int count = 0;
            int randomNumber =   1+(int)(10* Math.random());
            do
            {
                count++;
                System.out.println("Guess a Number between 1 to 10");
                int userSelected = sc.nextInt();
                if(userSelected==randomNumber)
                    {
                    System.out.println("---> YOU WON <---");
                    System.out.println("You Guessied It Correctly !");
                    break;
                    }
                else if(userSelected<=randomNumber)
                    {
                        System.out.println("Wrong Answer !");
                        System.out.println("Number is Bigger than "+userSelected);
                    }
                else if(userSelected>=randomNumber)
                    {
                        System.out.println("Wrong Answer !");
                        System.out.println("Number is Smaller than "+userSelected);
                    }
                    
                if(count<3)
                {
                System.out.println("You still have "+(3-count)+" choices !");
                }
                System.out.println('\n');
            }
            while(count<=2);
            if(count==3)
            {
                System.out.println("You choices are fineshed !");
                System.out.println("The Correct Answer is "+randomNumber);
            }
            System.out.println("Thank you for Playing the Game !");
        }
    }
}