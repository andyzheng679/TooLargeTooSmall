import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        startGuess();
    }

    public static int getRandNum(){
        Random random = new Random();
        int ranNum = random.nextInt(11); //0 - 10, not including 11
        return ranNum;
    }

    public static void startGuess(){
        Scanner scanner = new Scanner(System.in);
        int numToGuess = getRandNum();


        while(true){
            System.out.println("Guess a number from 0 - 10: ");
            int input = scanner.nextInt();

            if(input > numToGuess){
                System.out.println("Your input is greater than the number to guess");
            }else if(input < numToGuess){
                System.out.println("Your input is less than the number to guess");
            }else{
                System.out.println("You have guessed the number");
                break;
            }
        }


    }
}
