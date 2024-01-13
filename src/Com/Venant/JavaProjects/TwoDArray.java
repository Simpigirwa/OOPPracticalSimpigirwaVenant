package Com.Venant.JavaProjects;

import java.util.Random;
import java.util.Scanner;

public class TwoDArray {
	
	 public static void main(String[] args) {
		 int maths=0;
	     int programming=0;
	     int design=0 ;
	     int art=0;
	     int minProgramming=0;
	     int minDesign=0 ;
	     int minArt=0;
	     int maxProgramming=0;
	     int maxDesign=0 ;
	     int maxArt=0;
	     int totalMarks =0;
	     double percentage=0;
	     double average=0;

	     int minMaths = 0 ;
	     int maxMaths=0;
	        String[] students = {"Claire", "Sano", "Theogene"};
	       
	        int[] mathsMarks = {55, 63, 52};
	        int[] programmingMarks = {87, 85, 77};
	        int[] designMarks = {47, 63, 47};
	        int[] artMarks = {85, 45, 80};
	        System.out.println("\r------------------------------------------------------------------------------------------------");
	        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
	                "|Student", "|Maths", "|Programming", "|Design", "|Art", "|Percentage", "|Average");
	        System.out.println("------------------------------------------------------------------------------------------------");
	        for (int i = 0; i < students.length; i++) {
	             maths = mathsMarks[i];
	            programming = programmingMarks[i];
	           design = designMarks[i];
	             art = artMarks[i];

	             totalMarks = maths + programming + design + art;
	             percentage = (double) totalMarks / 4;
	            average = (double) totalMarks / 4;

	           minMaths = Math.min(mathsMarks[0],Math.min(mathsMarks[1],mathsMarks[2]));
	           maxMaths = Math.max(mathsMarks[0],Math.max(mathsMarks[1],mathsMarks[2]));
	           
	           minProgramming = Math.min(programmingMarks[0],Math.min(programmingMarks[1],programmingMarks[2]));
	           maxProgramming = Math.max(programmingMarks[0],Math.max(programmingMarks[1],programmingMarks[2]));
	           
	           minDesign = Math.min(designMarks[0],Math.min(designMarks[1],designMarks[2]));
	           maxDesign = Math.max(designMarks[0],Math.max(designMarks[1],designMarks[2]));
	           
	           minArt = Math.min(artMarks[0],Math.min(artMarks[1],artMarks[2]));
	           maxArt = Math.max(artMarks[0],Math.max(artMarks[1],artMarks[2]));
	        

	            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
	                    "|"+students[i], "|"+maths, "|"+programming, "|"+design, "|"+art, "|"+percentage, "|"+average);
	            System.out.println("------------------------------------------------------------------------------------------------");
	        }
	       
	        
	        	 System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
		                    "|Min", "|"+minMaths, "|"+minProgramming, "|"+minDesign, "|"+minArt, "| ", "| ");
	        	 System.out.println("------------------------------------------------------------------------------------------------");
	        	 System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
		                    "|Max", "|"+maxMaths, "|"+maxProgramming, "|"+maxDesign, "|"+maxArt, "| ", "| ");
	        	 System.out.println("------------------------------------------------------------------------------------------------");
	    }

	}
