import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Lenght : - ");
        int length = input.nextInt();
        int value = (length / 2) + 1;

        for (int i = 1; i <= length; i++) {

            if (i <= value) {

                for (int j = 1; j <= length; j++) {

                    if (i == 1 || i == length / 2 +1) {

                        System.out.print("* ");

                    } else {
                        if (j == 1 || j == length) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }

                    }

                }
            } else {

                for (int k = 1; k <= length; k++) {

                    if (k == value) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }

            }

            System.out.println();
        }
    }
}
