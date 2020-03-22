import java.util.Scanner;
/* contoh membaca integer menggunakan Class Scanner
   Class scanner berfungsi untuk mengambil input pada program yang berbasis teks
*/

public class BacaData {
	//method main lokasi program yang akan di eksekusi
	public static void main(String[] args) {
		//deklarasi variabel a.
		int a;
		
		//membuat scanner baru
		Scanner masukan;
		
		System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
		masukan = new Scanner(System.in);

		a = masukan.nextInt(); 
		/* coba ketik : masukan.nextInt(); ; Apa akibatnya ?*/

		System.out.print ("Nilai yang dibaca : "+ a);
	}
}