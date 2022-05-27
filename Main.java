import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IsNumber isNumber = new IsNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println(isNumber.checkForNumber(scanner));

        ReadMassive readMassive = new ReadMassive();
        readMassive.fillBooksNumbers();
        readMassive.readBooks();

        UseFinally useFinally = new UseFinally();
        useFinally.inputName(scanner);

    }
}