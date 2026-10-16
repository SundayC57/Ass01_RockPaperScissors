import java.util.Scanner;

public class main {
    void main() {
        Scanner in = new Scanner(System.in);
        String playerA = " ";
        String playerB = " ";
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

            IO.print("test complete");
            break;
        }while (playing);

    }
}
