import java.util.Scanner;
public class NextDayCalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tháng: ");
        int month = scanner.nextInt();
        System.out.println("nhập ngày: ");
        int day = scanner.nextInt();
        System.out.println("nhập năm: ");
        int year = scanner.nextInt();
        NextDayCalculator today = new NextDayCalculator(day,month,year);
        today.display();
    }
}
