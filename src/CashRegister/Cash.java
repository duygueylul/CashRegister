package CashRegister;
import java.util.Scanner;

public class Cash {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Girmek İstediğiniz 1 Kuruş Adedini Giriniz: ");
		double kurus1 = scan.nextDouble();
		
		System.out.println("Lütfen Girmek İstediğiniz 5 Kuruş Adedini Giriniz: ");
		double kurus5 = scan.nextDouble();
		
		System.out.println("Lütfen Girmek İstediğiniz 10 Kuruş Adedini Giriniz: ");
		double kurus10 = scan.nextDouble();
		
		System.out.println("Lütfen Girmek İstediğiniz 25 Kuruş Adedini Giriniz: ");
		double kurus25 = scan.nextDouble();
		
		System.out.println("Lütfen Girmek İstediğiniz 50 Kuruş Adedini Giriniz: ");
		double kurus50 = scan.nextDouble();
		
		
		
		double topKurus = ((kurus1 * 1) + (kurus5 * 5) + (kurus10 * 10) + (kurus25 * 25) + (kurus50 *50));
		System.out.println("Toplam Kuruş Maaliyeti: " + topKurus + " Kuruş.");

	}

}
