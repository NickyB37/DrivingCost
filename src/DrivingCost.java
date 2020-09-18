import java.util.Scanner;
public class DrivingCost {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	     
	     double milesPerGallon;
	     double dollarsPerGallon;
	     double cost;
	     
	     milesPerGallon = scnr.nextDouble();
	     dollarsPerGallon = scnr.nextDouble();
	     
	     cost = drivingCost(10,milesPerGallon,dollarsPerGallon);
	    System.out.printf("%.2f " , drivingCost(10,milesPerGallon,dollarsPerGallon));
	    
	    cost = drivingCost(50,milesPerGallon,dollarsPerGallon);
	    System.out.printf("%.2f ", drivingCost(50,milesPerGallon,dollarsPerGallon));
	  
	    cost = drivingCost(400,milesPerGallon,dollarsPerGallon);
	     System.out.printf("%.2f ", drivingCost(400,milesPerGallon,dollarsPerGallon));
	}
	     public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon){
	         
	         
	         double total = drivenMiles /milesPerGallon ;
	         double cost = total * dollarsPerGallon;
	        
	        return cost;
	        
	        
	         }	
	}


