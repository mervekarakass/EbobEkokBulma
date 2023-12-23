package ebobEkokBulma;

import java.util.Scanner;

public class EbobEkokBulma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci sayiyi girin: ");
		int sayi1 = scanner.nextInt();
		
		System.out.print("Ikinci sayiyi girin: ");
		int sayi2 = scanner.nextInt();
		
		int ebob = findEBOB(sayi1, sayi2);
		int ekok = findEKOK(sayi1, sayi2);
		
		System.out.println("Girilen sayilarin EBOB'u: " +ebob);
		System.out.println("Girilen sayilarin EKOK'u: " +ekok);
		

	}
	
	private static int findEBOB(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
			
		}
		
		return a;
	}
	private static int findEKOK(int a, int b) {
		return (a * b) / findEBOB(a, b);
		
	}

}
