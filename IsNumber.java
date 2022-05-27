import java.util.Scanner;

public class IsNumber {

    public IsNumber() {
    }

    protected boolean checkForNumber(Scanner scanner){
        try {
            Integer.parseInt(scanner.nextLine());
            return true;
        }catch (NumberFormatException e){
            return false;
        }

    }

}
