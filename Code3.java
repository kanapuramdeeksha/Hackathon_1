import java.util.Scanner;
class Code3 {
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter morning energy: ");
        double morning = sc.nextDouble();
        System.out.print("Enter evening energy: ");
        double evening = sc.nextDouble();
        System.out.println("Total Energy: " + calculateTotalEnergy(morning, evening));
    }
}