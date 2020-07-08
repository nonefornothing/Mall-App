package local.bots.mall_apps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static int totalHarga = 0;
	static int totalHargaBaju;
	static int totalHargaElektronik;
	static int jlhBaju;
	static int jlhElektronik;
	static int hargaBaju = 100_000;
	static int hargaElektronik = 500_000;

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("Selamat Datang di Mall Online");
			System.out.println("1. Kokas ");
			System.out.println("2. Ambasador ");
			System.out.println("3. Pejaten Village ");
			System.out.println("4. Kemang Village ");
			System.out.println("5. Keluar Aplikasi");
			System.out.print("Silakan Pilih Store dari Mall berikut : ");
			int pilihanMall = getAnInteger();

			if (pilihanMall == 1) {

				Calculate();
				totalHarga = ((totalHargaBaju) - (totalHargaBaju / 5) + (totalHargaElektronik)
						- (totalHargaElektronik / 10));
				System.out.println("Harga " + jlhBaju + " Baju dan " + jlhElektronik
						+ " Elektronik setelah diskon sebesar Rp. " + totalHarga);
				System.out.println();

			} else if (pilihanMall == 2) {

				Calculate();
				totalHarga = ((totalHargaBaju) - (totalHargaBaju / 4) + (totalHargaElektronik)
						- (totalHargaElektronik * 15 / 100));
				System.out.println("Harga " + jlhBaju + " Baju dan " + jlhElektronik
						+ " Elektronik setelah diskon sebesar Rp. " + totalHarga);
				System.out.println();
			} else if (pilihanMall == 3) {

				Calculate();
				if (jlhBaju == 1) {
					totalHarga = ((totalHargaBaju) - (totalHargaBaju * 5 / 100))
							+ ((totalHargaElektronik) - (totalHargaElektronik * 30 / 100));
				} else if (jlhBaju > 1) {
					totalHarga = ((totalHargaBaju) - (totalHargaBaju / 5))
							+ ((totalHargaElektronik) - (totalHargaElektronik * 30 / 100));
				}
				System.out.println("Harga " + jlhBaju + " Baju dan " + jlhElektronik
						+ " Elektronik setelah diskon sebesar Rp. " + totalHarga);
				System.out.println();

			} else if (pilihanMall == 4) {

				Calculate();
				totalHarga = ((totalHargaBaju) - (totalHargaBaju * 15 / 100) + (totalHargaElektronik)
						- (totalHargaElektronik * 15 / 100));
				System.out.println("Harga " + jlhBaju + " Baju dan " + jlhElektronik
						+ " Elektronik setelah diskon sebesar Rp. " + totalHarga);
				System.out.println();
			} else if (pilihanMall == 5) {
				System.exit(0);
			} else {
				System.out.println("Pilihan Salah silakan ulangi kembali");
				System.out.println();
			}
		}

	}

	public static Integer getAnInteger() {
		while (true) {
			try {
				return input.nextInt();
			} catch (InputMismatchException e) {
				input.next();
				System.err.print("Coba lagi dengan integer : ");
			}
		}
	}

	public static void Calculate() {

		System.out.print("Input jumlah baju yang ingin dibeli : ");
		jlhBaju = getAnInteger();
		System.out.print("Input jumlah elektronik yang ingin dibeli : ");
		jlhElektronik = getAnInteger();

		totalHargaBaju = jlhBaju * hargaBaju;
		totalHargaElektronik = jlhElektronik * hargaElektronik;

	}

}
