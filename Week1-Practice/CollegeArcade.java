/*
@author Vedh
*/
import java.util.Random;
import java.util.Scanner;

public class CollegeArcade {

    public static String playRound(String player, String computer) {

        if(player.equalsIgnoreCase(computer)) {
            return "Draw";
        }

        if((player.equalsIgnoreCase("Rock")) && (computer.equalsIgnoreCase("Scissors"))  ||
                (player.equalsIgnoreCase("Paper")) && (computer.equalsIgnoreCase("Rock")) ||
                (player.equalsIgnoreCase("Scissors")) && (computer.equalsIgnoreCase("Paper"))
        ) {
            return "Player Wins";

        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("WELCOME TO COLLEGE ARCADE");
        System.out.println("---------------------------");


        Random rand=new Random();

        String moves[]={"Rock","Paper","Scissors"};

        int win=0;int loss=0; int draw=0;

        int currentRound=1;
        int totalRounds=5;

        while(currentRound<=totalRounds){
            System.out.printf("Enter Round %d  move:",currentRound);
            String player=input.nextLine().trim();

            if(!player.equalsIgnoreCase("Rock") && !player.equalsIgnoreCase("Paper") && !player.equalsIgnoreCase("Scissors")){
                System.out.println("Invalid input please enter rock or scissors or paper only");
                continue;
            }

            String computer=moves[rand.nextInt(moves.length)];

            String result=playRound(player,computer);

            System.out.printf("Round %d | player Move  %s | computer Move  %s | round result -->  %s\n",currentRound,player,computer,result);

            if(result.equals("Player Wins")){
                win=win+1;

            } else if (result.equals("Computer Wins")) {
                loss=loss+1;

            }
            else{
                draw=draw+1;
            }
            currentRound++;

        }
        double winPercentage=(double)win/totalRounds*100;

        System.out.printf("wins %d  | loss %d  | draw %d  | winPecentage for Player %f",win,loss,draw ,winPercentage);
        input.close();

    }

}