package year2008;

// Link to the exercise: https://olimpiada.ic.unicamp.br/pratique/pj/2008/f1/telefone2/

import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] letters = {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String word = scanner.nextLine().toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 2; j < letters.length; j++) {
                if (letters[j].contains(Character.toString(word.charAt(i)))) {
                    System.out.print(j);
                    break;
                }
            }
        }


        scanner.close();

    }
}
