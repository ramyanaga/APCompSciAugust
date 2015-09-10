
/**
 * Write a description of class Mississippi here.
 * prints Mississippi vertically
 * 
 * @author Ramya Nagarajan
 * @version 08/25/2015
 */
public class Mississippi {
    //the below method draws the letter M
    public static void drawM() {
        System.out.println("M     M"); 
        System.out.println("MM   MM"); 
        System.out.println("M M M M");
        System.out.println("M  M  M"); 
        System.out.println("M     M"); 
        System.out.println("M     M"); 
        System.out.println("M     M"); 
    }
    
    
    //the below function draws the letter I; 
    public static void drawI() {
        System.out.println("IIIII");  
        System.out.println("  I  "); 
        System.out.println("  I"); 
        System.out.println("  I"); 
        System.out.println("  I"); 
        System.out.println("  I"); 
        System.out.println("IIIII"); 
    }
    
   
   
    
    // the below function draws the letter S 
    public static void drawS() {
        System.out.println(" SSSSS "); 
        System.out.println("S     S"); 
        System.out.println("S"); 
        System.out.println(" SSSSS");  
        System.out.println("      S"); 
        System.out.println("S     S"); 
        System.out.println(" SSSSS"); 
    }
    
    //the below function draws the bar of the P used in the 
    
    public static void drawP() {
        System.out.println("PPPPPP"); 
        System.out.println("P     P"); 
        System.out.println("P     P"); 
        System.out.println("PPPPPP");   
        System.out.println("P"); 
        System.out.println("P");
        System.out.println("P");
    }  
    
    //the below function draws the letters I, S and S to avoid repetition in the main
    public static void drawISS () {
        drawI(); 
        drawS(); 
        drawS(); 
    }
    
    //the below function draws the letter P twice, to avoid repetition in the main
    public static void drawDoubleP() {
        drawP(); 
        drawP(); 
    }
        
    public static void main(String[] args) {
        drawM(); 
        drawISS();  
        drawISS(); 
        drawI(); 
        drawDoubleP(); 
        drawI(); 
       
    }
}
    
        