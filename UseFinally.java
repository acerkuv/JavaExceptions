import java.util.NoSuchElementException;
import java.util.Scanner;

public class UseFinally {
    protected int number;
    protected Scanner scanner;

    protected void inputName(Scanner scanner){
        try {
            int number = scanner.nextInt();
            System.out.println(number);

        }catch (NoSuchElementException e) {
            System.out.println("Digits?");

        }finally {
            System.out.println("You are right if you have typed digits");
        }
        System.out.println();

    }

}
