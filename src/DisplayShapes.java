import java.util.Scanner;

public class DisplayShapes {
    public static void main(String[] args) {
        int choice;
        do {

            System.out.println("Menu: ");
            System.out.println("1.Print rectangle: ");
            System.out.println("2.Print square triangle:");
            System.out.println("3.Print isosceles triangle:");
            System.out.println("4.Exit!");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 3:
                    for (int i =1; i <= 5; i++) {
                        for (int j = 1;j<i; j++) {
                            System.out.print("*");

                        }
                        System.out.println("*");
                    }
                    for (int i = 4; i>=1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;

            }
        } while (choice != 0);





    }
}
