
package msgroup.ip3;

import java.util.Scanner;  

public class ip3Main {

    public static void main(String[] args) {
                     
        int choice; 
        int stateChoice; 
        int numCase;  
                                         
        States stateObject = new States(); 
        Products productObject = new Products();
        Items itemObject = new Items();
                       
        productObject.productMenu(); 
        
        Scanner aObject = new Scanner(System.in); 

        choice = aObject.nextInt();
                                            
        while(choice >= 1 || choice <=4)
        {                   
            switch(choice)
            {
                case 1:
                    System.out.println("The Green Bean product selected. \n");                
                    stateObject.productLocated("Green Bean"); 
                                                           
                    stateChoice = aObject.nextInt();
   
                    stateObject.stateTax(stateChoice); 
                    
                    productObject.setPrice(1.00);  
                                 
                    System.out.println("Please enter number cases:");
                    
                    Scanner caseOne = new Scanner(System.in);
                    numCase = caseOne.nextInt(); 
                    
                    itemObject.numCases(numCase);

                    itemObject.countItems(numCase, 12);
 
                    productObject.Subtotal(itemObject.getItems(), productObject.getPrice());

                    stateObject.saleTax(productObject.Subtotal(), stateChoice); 
                    
                    itemObject.totalCost(productObject.Subtotal(), stateObject.saleTax());
                    
                    break;
                
                case 2:
                    System.out.println("The Chicken Soup product selected. \n");
                    stateObject.productLocated("Chicken Soup");
                    
                    stateChoice = aObject.nextInt();
                    
                    stateObject.stateTax(stateChoice);

                    productObject.setPrice(1.25);
                    
                    System.out.println("Please enter number cases:");
                    
                    Scanner caseTwo = new Scanner(System.in);
                    numCase = caseTwo.nextInt(); 
                    
                    itemObject.numCases(numCase);
                    
                    itemObject.countItems(numCase, 12);

                    productObject.Subtotal(itemObject.getItems(), productObject.getPrice());
                    
                    stateObject.saleTax(productObject.Subtotal(), stateChoice); 
                                        
                    itemObject.totalCost(productObject.Subtotal(), stateObject.saleTax());
                    
                    break; 
                    
                case 3: 
                    System.out.println("Te Vegetable Soup product selected. \n");
                    stateObject.productLocated("Vegetable Soup");
                    
                    stateChoice = aObject.nextInt();
                    
                    stateObject.stateTax(stateChoice);

                    productObject.setPrice(1.30);
                    
                    System.out.println("Please enter number cases:");
                    
                    Scanner caseThree = new Scanner(System.in);
                    numCase = caseThree.nextInt(); 
                    
                    itemObject.numCases(numCase);
                    
                    itemObject.countItems(numCase, 12);

                    productObject.Subtotal(itemObject.getItems(), productObject.getPrice());
                    
                    stateObject.saleTax(productObject.Subtotal(), stateChoice); 
                    
                    itemObject.totalCost(productObject.Subtotal(), stateObject.saleTax());
                    
                    break;
                    
                case 4: 
                    System.out.println("Exit.");
                    System.exit(0);
                    break;
                    
                default: 
                    System.out.println("Invalid selection.\n");
                    break; 
            }
             
        productObject.productMenu(); 
        
        Scanner aObject2 = new Scanner(System.in); 

        choice = aObject2.nextInt();
        }
    } 
}
