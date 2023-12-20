/*

    Name of the program: _4Election.java
*/

import java.util.*;

class Counter {
    int spoiltBallot = 0;

    void counting(int[] count) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n[Enter '-1' to EXIT] ");
            System.out.print("Enter the Candidate number on the ballot paper: ");
            int vote = sc.nextInt();
            if (vote >= 1 && vote <= 5) {
                System.out.println("Entered a VALID Ballot!");
                switch (vote) {
                    case 1:
                        count[0]++;
                    case 2:
                        count[1]++;
                    case 3:
                        count[2]++;
                    case 4:
                        count[3]++;
                    case 5:
                        count[4]++;
                }
            } else if (vote == -1) {
                break;
            } else {
                System.out.println("Entered a SPOILT Ballot!");
                spoiltBallot++;
            }
        }
        sc.close();
    }

    void displayResult(int[] count) {
        System.out.println("\n******** Election RESULTS ********");
        for (int i = 0; i < 5; i++) {
            System.out.println("Candidate ~" + (i + 1) + " got " + count[i] + " votes");
        }
        System.out.println("Number of Spoilt Ballot are: " + spoiltBallot);
    }
}

public class _4Election {
    public static void main(String[] args) {
        int[] count = new int[5];

        System.out.println("\n***** WELCOME TO ELECTION VOTES COUNTING PROGRAM *****");
        Counter obj = new Counter();
        obj.counting(count);
        obj.displayResult(count);
    }
}

