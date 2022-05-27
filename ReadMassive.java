
import java.util.Random;

public class ReadMassive {
    private int[] BookCount = new int[10];
    private Random random;

    ReadMassive() {
        this.random = new Random();
    }

    protected void fillBooksNumbers() {
        for (int i = 0; i < BookCount.length; i++) {
            BookCount[i] = random.nextInt(0, 20);
        }
    }

    protected void readBooks(){
        for (int i = 0; i < 20; i++) {
            try {
                int temp = BookCount[i];
                System.out.println(i);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Last exist element index " + (i - 1) );
                break;
            }
        }

    }
}


