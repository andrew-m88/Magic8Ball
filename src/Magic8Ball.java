import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){
        //declare
        Scanner keyboard;
        int testing;
        String question;
        int number;

        //initialization

        keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball, what is your question?");
        question = keyboard.nextLine();
        System.out.println("pick a number between 1 and 100");
        number = keyboard.nextInt();

        if(number >= 1 && number <= 10){
            System.out.println("you chose wrong");
        }
        else if(number >= 11 && number <= 20){
            System.out.println("you have recieved the black plague");
        }
        else if(number >= 21 && number <= 30){
            System.out.println("you get a cookie");
        }
        else if(number >= 31 && number <= 40){
            System.out.println("you are going to kermit suicide");
        }
        else if(number >= 41 && number <= 50){
            System.out.println("i agree with your decision");
        }
        else if(number >= 51 && number <= 60){
            System.out.println("too shooken up to answer");
        }
        else if(number >= 61 && number <= 70){
            System.out.println("my name is JOHN CENA");
        }
        else if(number >= 71 && number <= 80){
            System.out.println("ci");
        }
        else if(number >= 81 && number <= 90){
            System.out.println("outlook good");
        }
        else if(number >= 91 && number <= 100){
            System.out.println("to my understanding, yes");
        }













    }
}
