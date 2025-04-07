package year2008;

//Link to the exercise: https://olimpiada.ic.unicamp.br/pratique/pj/2008/f1/vestib/

import java.util.Scanner;

public class Vestibular {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String gabarito = scan.next();
        String alternativas = scan.next();

        int acertos = 0;
        for (int i = 0; i < n; i++) {
            if (alternativas.charAt(i) == gabarito.charAt(i)) {
                acertos++;
            }
        }

        System.out.println(acertos);

        scan.close();
    }
}
