import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputnumber;
    public int numberofGuesses =0;

    public int getNumberofGuesses() {
        return numberofGuesses;
    }

    public void setNumberofGuesses(int numberofGuesses) {
        this.numberofGuesses = numberofGuesses;
    }

     game(){
        Random ran =new Random();
        this.number= ran.nextInt(100);

    }
    void takeuserInput(){
        numberofGuesses ++;
        System.out.println("guess the number");
        Scanner sc =new Scanner(System.in);
        inputnumber= sc.nextInt();
    }
    boolean isCorrectNumber() {
        if (inputnumber == number) {
            System.out.format("yes you guessed it right it was %d\n you gusses it in %d attempt",number, numberofGuesses);
            return true;
        } else if (inputnumber < number) {
            System.out.println("Two low....");
        } else if (inputnumber > number) {
            System.out.println("two hight ....");
        }
        return false;
    }
}

public class CWH_50_Ex3sol {
  /*  create a class Game , Which allow a user to paly a game "gess the number" game ones
    game should have the following methods
    1. Construstor to genrate the random number
    2. takuserinput to take a user input of a number
    3.iscorrectnumber() to detct whether the number entered by the user is true
            4. getter and setter as no of gusses(int) etc to get this task done !
            */
    public static void main(String[] args) {
        game g= new game();
        boolean b = false;
        while (!b) {
            g.takeuserInput();
             b = g.isCorrectNumber();
            System.out.println(b);
        }

    }
}
