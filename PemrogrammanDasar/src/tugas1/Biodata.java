package tugas1;

import java.util.Scanner;
class Biodata {
	public static void main(String[] args) { 
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Nama Anda : " );
		String nama=input.nextLine();
		System.out.print("Masukkan NIM Anda : " );
		String nim=input.next();
		System.out.print("Masukkan Kelas Anda : " );
		String kelas=input.next();
		System.out.print("Masukkan Tempat Lahir Anda : " );
		String tmpt_lahir=input.next();
		System.out.print("Masukkan Tahun Lahir Anda : " );
		int thn_lahir=input.nextInt();
		int usia=2017-thn_lahir;
		System.out.println("-----------MY BIODATA-----------");
		System.out.println("Hello, "+nama +"!");
		System.out.println("Your NIM is "+nim);
		System.out.println("Your class is "+kelas);
		System.out.println("You were born in "+tmpt_lahir);
		System.out.println("You are " +usia + "years old");
		
	}
}
