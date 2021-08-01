package msgroup.ip3;

import java.util.Scanner;

public class Items {
    
    private int numCases; // Number of Cases
    private int numItems; // Number of Items.
    private double totalCost; // total cost. 
    
    // Default constructor. 
    public Items(){};
    
    // Copy constructor. 
    public Items (int totalCases, int totalUnits, double Amount)
    {
        numCases = totalCases;
        numItems = totalUnits;  
        totalCost = Amount; 
    }
    
    // Set number of cases. 
    public void setCase(int totalCases)
    {
        numCases = totalCases;
    }
    
    // Display number of cases. 
    public void numCases(int totalCases)
    {
       System.out.println("Number Cases Entered: " +totalCases);
    }
    
    // Get number of cases. 
    public int getCase()
    {
        return numCases;
    }
    
    // Set number of items as total units. 
    public void setItems(int totalUnits)
    {
        numItems = totalUnits;  
    }
    
    // Get number of items as total units. 
    public int getItems()
    {
        return numItems;  
    }
    
    // Set total cost.   
    public void setCost(double Amount)
    {
        totalCost = Amount;  
    }
    
    // Get total cost.  
    public double getCost()
    {
        return totalCost;  
    }
    
    /* Calculate and display number of items. It equals to number of cases multiple by items per cases. */
    public void countItems(int numCases, int perCase)
    {
        numItems = numCases * perCase; 
        System.out.println("Number of Items: " +numItems);
    }
    
    /* Calculate and display total cost of purchases. */
    public void totalCost (double subtotal, double stateTax)
    {
        totalCost = subtotal + stateTax; 
        System.out.println("Total Cost: $" + totalCost +"\n");
    }
}
