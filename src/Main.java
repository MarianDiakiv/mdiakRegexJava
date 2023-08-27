import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomUserMenu customUserMenu = new CustomUserMenu();
        customUserMenu.showOperation();
        int operation = scanner.nextInt();

        while (operation != 0) {
            System.out.println("---------------");
            customUserMenu.caseOne();
            customUserMenu.showOperation();
            operation = scanner.nextInt();

        }


    }
}