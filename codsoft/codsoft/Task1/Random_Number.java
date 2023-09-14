import java.util.Random;
import java.util.Scanner;



public class Random_Number extends Thread{

void options(){
    System.out.println("Choose the option:");
    System.out.println();    
    System.out.println("      1] TO PLAY NEXT LEVEL");
    System.out.println("      2] TO PLAY SAME LEVEL");
    System.out.println("      3] MAIN MENU");
    System.out.println("      4] QUIT");
}    

void pause(int n){
      try{
            Thread.sleep(n);
        }catch(InterruptedException e){
            System.out.println(e);
        }
}

void MainMenu(){
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("******MAIN MENU*****");
    System.out.println("Choose the option:");
    System.out.println();    
    System.out.println("      1] LEVEL 1");
    System.out.println("      2] LEVEL 2");
    System.out.println("      3] LEVEL 3");
    System.out.println("      4] QUIT");

    int choice = input.nextInt();

    if(choice == 1){
        Level1();
    }
    else if(choice == 2){
        Level2(0);
    }
    else if(choice == 3){
        Level3(0);
    }
    else if(choice == 4){
        System.out.println();
        System.out.println("We hope that you like this game.");
        System.out.println("         THANK YOU!!");
    }
    else{
        System.out.println("You Enter the wrong input. Please try again.");
        pause(3000);
        MainMenu();

    }
    input.close();
   
}

void L1Rule(){
    System.out.println();
    System.out.println("The Rules for Level1:");
    System.out.println("1]There are 5 chances");
    System.out.println("2]The Maximum score of this level is 500");
    System.out.println("3]For every extra chance maximum score get reduced by 100");
    System.out.println("4]For every wrong guess 50 is get deduced from current score");
    System.out.println();    
}

void Level1(){
    Random r = new Random();
    Scanner ans = new Scanner(System.in);

    int x = r.nextInt(100);
    int a1[] = {500,400,300,200,100};
    int n = 0;
    System.out.println("****WELCOME TO THE LEVEL 1****");
    L1Rule();

    for(int i=0; i<5; i++){
    
       System.out.println("Please Guess the Number in the range between 0 to 100");
       int result = ans.nextInt();
       System.out.println();

       if(result > x){
        System.out.println("The Desired Number is too low, Please try again");
        System.out.println();
        if(a1[i]==0){
            n = -50;
        }else
         n = n + a1[i] - 50;
       }
       else if(result < x){
        System.out.println("The Desired Number is too high, please try again");
        System.out.println();
        if(a1[i]==0){
            n = -50;
        }else
         n = n + a1[i] - 50;
       }
       else if(result == x){
        System.out.println("You guessed it! Congradulation!!");
        n += a1[i];
        System.out.println("Your score is: "+n);
        options();
        int choice = ans.nextInt();
        if(choice == 1){
            pause(5000);
           Level2(n);
        }
        else if(choice == 2){
            pause(5000);
            Level1();
        }
        else if(choice == 3){
            pause(5000);
            MainMenu();
        }
        else if(choice == 4){
        System.out.println();
        System.out.println("We hope that you like this game.");
        System.out.println("         THANK YOU!!");
        }
       }    
    }
    System.out.println("The Required Number is: "+x);
    System.out.println();

    System.out.println("GAME OVER!");
    pause(5000);
    MainMenu();
    ans.close();
}  

void L2Rule(){
    System.out.println();
    System.out.println("The Rules for Level2:");
    System.out.println("1]There are 4 chances");
    System.out.println("2]The Maximum score of this level is 900");
    System.out.println("3]For every extra chance maximum score get reduced by 100");
    System.out.println("4]For every wrong guess 100 is get deduced from current score");
    System.out.println();    
}

void Level2(int n){
    Random r = new Random();
    Scanner ans = new Scanner(System.in);

    int x = r.nextInt(500);
    int a1[] = {900,800,700,600};
    
    System.out.println("****WELCOME TO THE LEVEL 2****");
    L2Rule();

    for(int i=0; i<4; i++){
    
       System.out.println("Please Guess the Number in the range between 0 to 500");
       int result = ans.nextInt();
       System.out.println();

       if(result > x){
        System.out.println("The Desired Number is too low, Please try again");
        System.out.println();
        n = n + a1[i] - 100;
       }
       else if(result < x){
        System.out.println("The Desired Number is too high, please try again");
        System.out.println();
        n = n + a1[i] - 100;
       }
       else if(result == x){
        System.out.println("You guessed it! Congradulation!!");
        n += a1[i];
        System.out.println("Your score is: "+n);
        options();
        int choice = ans.nextInt();
        if(choice == 1){
            pause(5000);
           Level3(n);
        }
        else if(choice == 2){
            pause(5000);
            Level2(0);
        }
        else if(choice == 3){
            pause(5000);
            MainMenu();
        }
        else if(choice == 4){
        System.out.println();
        System.out.println("We hope that you like this game.");
        System.out.println("         THANK YOU!!");
        }
       }    
    }
    System.out.println("The Required Number is: "+x);
    System.out.println();

    System.out.println("GAME OVER!");
    pause(5000);
    MainMenu();
    ans.close();
}

void L3Rule(){
    System.out.println();
    System.out.println("The Rules for Level1:");
    System.out.println("1]There are 3 chances");
    System.out.println("2]The Maximum score of this level is 1500");
    System.out.println("3]For every extra chance maximum score get reduced by 200");
    System.out.println("4]For every wrong guess 110 is get deduced from current score");
    System.out.println();    
}

void Level3(int n){
    Random r = new Random();
    Scanner ans = new Scanner(System.in);

    int x = r.nextInt(1000);
    int a1[] = {1500,1300,1100};
    System.out.println("****WELCOME TO THE LEVEL 3****");
    L3Rule();

    for(int i=0; i<3; i++){
    
       System.out.println("Please Guess the Number in the range between 0 to 1000");
       int result = ans.nextInt();
       System.out.println();

       if(result > x){
        System.out.println("The Desired Number is too low, Please try again");
        System.out.println();
         n = n + a1[i] - 110;
       }
       else if(result < x){
        System.out.println("The Desired Number is too high, please try again");
        System.out.println();
         n = n + a1[i] - 110;
       }
       else if(result == x){
        System.out.println("You guessed it! Congradulation!!");
        n += a1[i];
        System.out.println("Your score is: "+n);
        System.out.println("You won the highest level of the game.");
        pause(5000);
        MainMenu();
       }    
    }
    System.out.println("The Required Number is: "+x);
    System.out.println();

    System.out.println("GAME OVER!");
    pause(5000);
    MainMenu();
    ans.close();
}
public static void main(String[] args) {
    System.out.println("********Welcome to Random Number Guessing Game********");

    //to the main menu
     Random_Number r1 = new Random_Number();
     r1.MainMenu();

}
}
