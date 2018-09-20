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
        System.out.println("Welcome to the Magic 8 Ball, ask a yes or no question");
        question = keyboard.nextLine();
        System.out.println("pick a number between 1 and 100");
        number = keyboard.nextInt();

        if(number >= 1 && number <= 10){
            System.out.println("you chose wrong");
        }
        else if(number >= 11 && number <= 20){
            System.out.println("i have to inform you that it's a no");
        }
        else if(number >= 21 && number <= 30){
            System.out.println("i follow you with your decision 100%");
        }
        else if(number >= 31 && number <= 40){
            System.out.println("go away, I'm tryna sleep");
        }
        else if(number >= 41 && number <= 50){
            System.out.println("i agree with your decision");
        }
        else if(number >= 51 && number <= 60){
            System.out.println("too shooken up to answer");
        }
        else if(number >= 61 && number <= 70){
            System.out.println("your access to the Magic8Ball has been denied");
        }
        else if(number >= 71 && number <= 80){
            System.out.println("ci");
        }
        else if(number >= 81 && number <= 90){
            System.out.println("your outlook is good");
        }
        else if(number >= 91 && number <= 100){
            System.out.println("to my understanding, yes");
        }













    }
}
