package ITDiffMemory;

import java.util.Scanner;

public class ComputerMain {
    
    // As parameters, the command line arguments
    public static void main(String[] args) {
        
        int diffMemory;
        
        // Created an instance for existing computer. 
        Computer existedComputer = new Computer(); 
        
        System.out.println("This is information for existing computer:");
        existedComputer.Name();
        existedComputer.Memory();
        
        // Created an instance for future computer. 
        Computer futureComputer = new Computer(); 
        
        System.out.println("This is information for future computer:");
        futureComputer.Name();
        futureComputer.Memory();
        
        /* Calculate and output differential memory between existing 
                                            and future computers. */ 
        diffMemory = futureComputer.getMemory() - existedComputer.getMemory();
        System.out.println("A differential memory: " +diffMemory); 
    }   
}