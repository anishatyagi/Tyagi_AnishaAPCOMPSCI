import java.util.ArrayList; 
 public class satellite 
 { 
  public static void main(String[]args)  
 	{ 
  ArrayList<location> locate = new ArrayList<>(); 
 
 
 	double[] hLoc = {5, 6}; 
  locate.add(new honda(hLoc)); 
  locate.add(new toyota("8, 9")); 
  locate.add(new GMC(3, 8)); 
   
 	double[] home = {0, 0}; 
  String printout = "==========================\n" + "STARTING LOCATIONS: "; 
   
 	for(location l : locate)  
 	{ 
  printout += "\nLocation for " + l.getID() + ": " + getLocation(l.getLoc()); 
  }  
 	 
  printout += "\n\nDISTANCE FROM HOME:"; 
   
 	for(location l : locate)  
 	{ 
  printout += "\nDistance for " + l.getID() + ": " + getDistance(l.getLoc(), home); 
  } 
 	 
 	printout += "\n\n==========================\n"; 
 	 
 	for(location l : locate)  
 	{ 
  double one = Math.random() * 99 + 1; 
 	double two = Math.random() * 99 + 1; 
 	l.move(one, two); 
 	 
  printout += "\n\nAfter " + l.getID() + " moved (" + one + ", " + two + ")" 
  + "\nNew location: " + "(" + one + ", " + two + ")" + "\n"; 
 	 
  } 
 	 
  printout += "\n\nDistance from home:"; 
   
 	for(location l : locate)  
 	{ 
  printout += "\nDistance for " + l.getID() + ": " + getDistance(l.getLoc(), home); 
  } 
 	 
 	printout += "\n\n==========================\n"; 
 	 
  System.out.println(printout); 
  } 
 	 
  public static String getDistance(double[] car, double[] home)  
 	{ 
  return String.format("(%.2f)", Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)))); 
  } 
 	 
  public static String getLocation(double[] Loc)  
 	{ 
  return String.format("(%.2f, %.2f)", Loc[0], Loc[1]); 
  } 
 }


 

 

 

 

