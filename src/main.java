import java.util.Scanner;

public class main {
    void main() {
        Scanner in = new Scanner(System.in);
        String playerA = " ";
        String playerB = " ";
        String resume = " ";
        boolean playing = true;
        boolean done = false;


        do {

            /*player a move get*/
            do {
                IO.print("Player A enter your RPS move [R/P/S]: ");
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R")) {
                    IO.println("You've chosen Rock!");
                    done = true;
                } else if (playerA.equalsIgnoreCase("P")) {
                    IO.println("You've chosen Paper!");
                    done = true;
                } else if (playerA.equalsIgnoreCase("S")) {
                    IO.println("You've chosen Scissors!");
                    done = true;
                } else {
                    IO.println("Invalid input! Only enter [R/P/S]. Please try again.");
                }
            } while (!done);

            done = false;

            do {
                IO.print("Player B enter your RPS move [R/P/S]: ");
                playerB = in.nextLine();

                if (playerB.equalsIgnoreCase("R")) {
                    IO.println("You've chosen Rock!");
                    done = true;
                }else if (playerB.equalsIgnoreCase("P")) {
                    IO.println("You've chosen Paper!");
                    done = true;
                }else if (playerB.equalsIgnoreCase("S")) {
                    IO.println("You've chosen Scissors!");
                    done = true;
                }else{
                    IO.println("Invalid input! Only enter [R/P/S]. Please try again.");
                }

            }while (!done);

            /*checking possibilities*/

            if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("R")){
                IO.println("You both chose Rock! Game is a tie!");
            }else if(playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("P")){
                IO.println("You both chose Paper! Game is a tie!");
            }else if(playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("S")){
                IO.println("You both chose Scissors!  Game is a tie!");
            }else if(playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")){
                IO.println("Scissors VS Paper! Player A wins!!");
            }else if(playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")){
                IO.println("Paper VS Rock! Player B wins!!");
            }else if(playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S")){
                IO.println("Paper VS Scissors! Player B wins!!");
            }else if(playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S")){
                IO.println("Scissors VS Paper! Player B wins!!");
            }else if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")){
                IO.println("Rock VS Scissors! Player A wins!!");
            }else if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("s")){
                IO.println("Rock VS Scissors! Player A wins!!");
            }else if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P")){
                IO.println("Rock VS Paper! Player B wins!!");
            }

            IO.print("Would you like to play again? (Y/N): ");
            resume = in.nextLine();
            if (resume.equalsIgnoreCase("Y")) {
                playing = true;
            }
            else {
                playing = false;
            }

        }while (playing);

    }
}
