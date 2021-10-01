package tugas1;

import java.util.Scanner;
class BodyMassIndex {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Weight :");
		float weight = input.nextFloat();
		System.out.print("Enter Your Height :");
		float height = input.nextFloat();
		float bmi = weight/(height*height);
		System.out.println("---------------------------");
		System.out.println("Your Weight : "+weight);
		System.out.println("Your Height : "+height);
		System.out.println("Your BMI : " +bmi);
		
		}
}
