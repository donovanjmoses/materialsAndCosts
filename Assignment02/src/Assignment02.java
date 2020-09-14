import java.util.Scanner;

public class Assignment02 {
    
    public static void main(String[] args) {
    	
        // declare and instantiate a Scanner
    	Scanner in = new Scanner(System.in);

        // declare and initialize variables for inputs
        double roadLength; // measured in miles
        int numberOfLanes;
        int depthOfAsphault;
        int numberOfDays;
      
        // collect inputs
        System.out.println("What is the length of the road project in miles? ");
        roadLength = in.nextDouble();
        System.out.println("What are the number of lanes? ");
        numberOfLanes = in.nextInt();
        System.out.println("What is the depth of asphault in inches? ");
        depthOfAsphault = in.nextInt();
        System.out.println("How many days to complete the project? ");
        numberOfDays = in.nextInt();
               
        // declare and initialize variables to compute required values for Truckloads of Asphault output
        int laneWidth;
        int laneLength;
        int laneHeight;
        int asphaultVolume;
        int asphaultWeight;
        int truckloadsOfAsphault;
        
        // compute required values for Truckloads of Asphault output
        laneWidth = 12; // measured in feet
        laneLength = (int) (roadLength * 5280); //measured in feet
        laneHeight = (depthOfAsphault / 12); //measured in feet
        asphaultVolume = (laneWidth * laneLength * laneHeight);
        asphaultWeight = (asphaultVolume * 150);
        truckloadsOfAsphault = (int) (asphaultWeight / 10000);
        
        // declare and initialize variables to compute required values for Stoplights
        int stoplightsPerIntersection;
        int numberOfStoplights;
        
        // compute required values for Stoplights
        stoplightsPerIntersection = (int) Math.floor(roadLength * 2);
        numberOfStoplights = (stoplightsPerIntersection + numberOfLanes);
               
        //declare and initialize variables to compute required values for Conduit Pipes
        double numberOfConduits = Math.ceil(laneLength / 24);
       
        // declare and initialize variables to compute required values for Crew Members
        int numberOfCrewMembers;
        
        // compute required values for Crew Members
        numberOfCrewMembers = (int) Math.ceil(50 * roadLength * numberOfLanes) / numberOfDays;
       
        // declare and initialize variables to compute required values for Cost of Asphault
        int costPerTruckload;
        int totalCostOfAsphault;
    
        // compute required values for Cost of Asphault
        costPerTruckload = 1000;
        totalCostOfAsphault = (costPerTruckload * truckloadsOfAsphault);
     
        // declare and initialize variables to compute required values for Cost of Stoplights
        int totalCostOfStoplights;
     
        // compute required values for Cost of Stoplights
        totalCostOfStoplights = (numberOfStoplights * 25000);
            
        // declare and initialize variables to compute required values for Cost of Conduit Pipes
        int totalCostOfConduits;
     
        // compute required values for Cost of Conduit Pipes
        totalCostOfConduits = (int) (numberOfConduits * 500);
                
        // declare and initialize variables to compute required values for Cost of Labor
        int crewMemberDailyPayRate;
        int totalCostOfLabor;
             
        // compute required values for Cost of Labor
        crewMemberDailyPayRate = (8 * 25);
        totalCostOfLabor = (crewMemberDailyPayRate * numberOfDays);
            
        // declare and initialize variables to compute required values for Cost of Labor
        int totalCostOfProject;
       
        // compute required values for Cost of Labor
        totalCostOfProject = (totalCostOfAsphault + totalCostOfStoplights + totalCostOfConduits + totalCostOfLabor);
  
        // display results
        System.out.println("=== Amount of materials needed ===");
        System.out.println("Truckloads of Asphault: " + Math.ceil(truckloadsOfAsphault * numberOfLanes));
        System.out.println("Stoplights: " + numberOfStoplights);
        System.out.println("Conduit Pipes: " + numberOfConduits);
        System.out.println("Crew Members needed: " + numberOfCrewMembers);
        System.out.println("=== Cost of materials ============");
        System.out.println("Cost of asphault: " + totalCostOfAsphault);
        System.out.println("Cost of stoplights: " + totalCostOfStoplights);
        System.out.println("Cost of conduits: " + totalCostOfConduits);
        System.out.println("Cost of labor: " + totalCostOfLabor);
        System.out.println("=== Total Cost of Project ========");
        System.out.println("Total cost of project: " + totalCostOfProject);         
    }
}
