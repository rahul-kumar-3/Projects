import java.util.Scanner;
public class CurrencyConverter {
    public static double usdToRupee(double usd){
        return usd * 83.83;
    }
    public static double rupeeToUsd(double rupee){
        return rupee * 0.012;
    }
    public static double euroToRupee(double euro){
        return euro * 93.78;
    }
    public static double rupeeToEuro(double rupee){
        return rupee * 0.011;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n******WELCOME TO CURRENCY CONVERTER******");
        System.out.println("\n1.USD to Rupee \n2.Rupee to USD \n3.Euro to Rupee \n4.Rupee to Euro \n5.Exit");
        System.out.println("\nEnter your choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            System.out.println("\nEnter the amount in USD: ");
            double usd = sc.nextDouble();
                System.out.println(usdToRupee(usd)+" Rupees");
                break;
            case 2:
            System.out.println("\nEnter the amount in Rupee : ");
            double rupee = sc.nextDouble();
            System.out.println(rupeeToUsd(rupee)+" Dollar");
            break;
            case 3:
            System.out.println("\nEnter the amount in Euro : ");
            double euro = sc.nextDouble();
            System.out.println(euroToRupee(euro)+"Rupees");
            break;
            case 4:
            System.out.println("\nEnter the amount in Rupee : ");
            double rupeeForEuro = sc.nextDouble();
            System.out.println(rupeeToEuro(rupeeForEuro)+"Euro");
            break;
            case 5:
            System.exit(0);
        }
        sc.close();
    }
}
