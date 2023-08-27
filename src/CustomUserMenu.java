import java.util.Scanner;

public class CustomUserMenu {

    public void caseOne(){
        System.out.println("Enter max length for string (only Number)");
        Scanner scanner = new Scanner(System.in);
        int maxLength = scanner.nextInt();
        String regex = "[a-zA-Z ]{0," +
                maxLength +
                "}";
        System.out.println("Regex: "+ regex);
        System.out.println("Enter String For Validate: ");
        String str = scanner.next();
        CustomStringValidator customStringValidator = new CustomStringValidator(regex);
        boolean isValid = customStringValidator.isValid(str);
        System.out.println(" IS Valid: "+ isValid);

    }
    public void showOperation(){
        System.out.println("Operation List: Number");
        System.out.println("Validate string: 1");
        System.out.println("Stop program: 0");
        System.out.println("Write correct number for operation");
    }


}
