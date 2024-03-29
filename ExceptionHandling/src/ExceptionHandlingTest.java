import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();
            int z = x / y;

            System.out.println("result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero! IDIOT!");
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("This will always print");
        }
    }
}