import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import javax.swing.*;
// Buffered selain inputan dari keyboard dapat membaca input dari file dan jaringan.
public class Bacakar {

	public static void main(String[] args) throws IOException {

		char cc ;
		int bil;
		// Membuat objek inputstream
		InputStreamReader isr = new InputStreamReader(System.in);

		// membuat objek bufferreader
		BufferedReader dataIn = new BufferedReader(isr);
		// atau


		BufferedReader datAIn = new BufferedReader(new
		InputStreamReader(System.in));

		/* Algoritma */
		System.out.print ("hello\n");
		System.out.print("baca 1 karakter : ");

		//perintah baca karakter cc
		cc =dataIn.readLine().charAt(0);
		System.out.print("baca 1 bilangan : ");

		//perintah baca bil
		bil =Integer.parseInt(datAIn.readLine());

		System.out.print (cc +"\n" +bil+"\n");
		System.out.print ("bye \n");
	}
}