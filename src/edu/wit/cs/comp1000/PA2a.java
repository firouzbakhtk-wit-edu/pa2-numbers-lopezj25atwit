package edu.wit.cs.comp1000;

import java.util.Scanner;
// TODO: document this class
public class PA2a {

	
	    public static void main(String[] args) {
	    	Scanner input = new Scanner(System.in);
	        

	            System.out.print("Enter five whole numbers: ");

	            int inOne = input.nextInt();

	            int inTwo = input.nextInt();

	            int inThree = input.nextInt();

	            int inFour = input.nextInt();

	            int inFive = input.nextInt();

	            int sum = 0;

	            int sumN = 0;

	            int sumCount = 0;

	            int sumNCount = 0;

	           

	 

	            if( inOne > 0 ){

	                sum += inOne;

	                sumCount++;

	            }

	                else{

	                    sumN += inOne;

	                    sumNCount++;

	                }

	            if( inTwo> 0 ){

	                sum += inTwo;

	                sumCount++;

	            }

	                else{

	                    sumN += inTwo;

	                    sumNCount++;

	                }

	            if( inThree > 0 ){

	                sum += inThree;

	                sumCount++;

	            }

	                else{

	                    sumN += inThree;

	                    sumNCount++;

	                }

	            if( inFour > 0 ){

	                sum += inFour;

	                sumCount++;

	            }

	                else{

	                    sumN += inFour;

	                    sumNCount++;

	                }

	            if( inFive > 0 ){

	                sum += inFive;

	                sumCount++;

	            }

	                else{

	                    sumN += inFive;

	                    sumNCount++;

	                }

	            int sumAll = sum + sumN;

	            double sumDouble = sum;

	            double sumNDouble = sumN;

	            double sumAvg = (sumCount > 0) ? (double) sum/sumCount : 0.0;

	            double sumNAvg = (sumNCount > 0) ? (double) sumN/sumNCount : 0.0;

	            double sumAvgAll = (sumDouble + sumNDouble) / 5;

	            if(sumCount != 1){

	                System.out.println("The sum of the " + sumCount  + " positive numbers: " + sum);

	            }

	            else{

	                System.out.println("The sum of the " + sumCount  + " positive number: " + sum);

	            }

	            if(sumNCount != 1){

	                System.out.println("The sum of the " + sumNCount + " non-positive numbers: " + sumN);

	            }

	            else{

	                System.out.println("The sum of the " + sumNCount + " non-positive number: " + sumN);

	            }

	            System.out.println("The sum of the 5 numbers: " + sumAll);

	            if(sumCount != 1){

	                System.out.print("The average of the " + sumCount);

	                System.out.printf(" positive numbers: %.2f%n" , sumAvg);

	            }

	            else{

	                System.out.print("The average of the " + sumCount);

	                System.out.printf(" positive number: %.2f%n" , sumAvg);

	            }

	            if(sumNCount != 1){

	                System.out.print("The average of the " + sumNCount);

	                System.out.printf(" non-positive numbers: %.2f%n" , sumNAvg);

	            }

	            else{

	                System.out.print("The average of the " + sumNCount);

	                System.out.printf(" non-positive number: %.2f%n" , sumNAvg);

	            }

	            System.out.printf("The average of the 5 numbers: %.2f%n" , sumAvgAll);
	            
	        }
	    }
