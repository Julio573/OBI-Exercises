package year2008;

import java.util.Scanner;

//Link to the exercise: https://olimpiada.ic.unicamp.br/pratique/pj/2008/f1/obi/

public class OBI {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int P = scan.nextInt();

        int approved = 0;
        for (int i = 0; i < N; i++) {
            int X = scan.nextInt();
            int Y = scan.nextInt();
            if (X + Y >= P) {
                approved++;
            }
        }
        System.out.println(approved);

        scan.close();
    }
}
