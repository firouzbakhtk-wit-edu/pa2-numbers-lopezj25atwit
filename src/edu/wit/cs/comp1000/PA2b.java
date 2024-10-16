package edu.wit.cs.comp1000;

import java.util.Scanner;
// TODO: document this class
public class PA2b {

	// TODO: document this function
	 public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        

	            System.out.printf("Enter a b c: ");

	            float a = input.nextFloat();

	            float b = input.nextFloat();

	            float c = input.nextFloat();

	            float d = (float) (Math.pow(b,2))-(4*a*c);

	 

	            if(d<0) {

	                System.out.printf("Roots: imaginary%n");

	            }

	            else if(d == 0) {

	                float root = -b/2*a;

	                System.out.printf("Root: %.2f%n", root);

	            }

	            else{

	                float roota = (float) (((-b)-Math.sqrt(d))/(2.0*a));

	                float rootb = (float) (((-b)+Math.sqrt(d))/(2.0*a));

	                System.out.printf("Roots: %.2f, %.2f%n", roota, rootb);

	            }

}
}