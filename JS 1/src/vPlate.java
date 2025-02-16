import java.util.Scanner;

public class vPlate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] cPlate = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] tesP = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N' },
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        System.out.print("Input code: ");
        char tess = input.next().charAt(0);

        int isTrue = -1;

        for (int i = 0; i < cPlate.length; i++) {
            if (cPlate[i] == tess) {
                isTrue = i;
                break;
            }
        }

        if (isTrue != -1) {
            System.out.print("City: ");
            for (int j = 0; j < tesP[isTrue].length; j++) {
                System.out.print(tesP[isTrue][j] + " ");
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
