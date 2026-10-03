import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water consumption in litres: ");
        double waterConsumed = sc.nextDouble();

        if (waterConsumed <= 500) {
            System.out.println("Water Bill: Rs.100");
        }
        else {
            System.out.println("Water Bill: Rs.200");
        }

        sc.close();
    }
}