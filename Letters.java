
/**
 * Write a description of class Letters here.
 * The class letters prints a letter to a parent, a letter to a friend, and a letter to a sibling. 
 * 
 * Ramya Nagarajan and Emily Yamashita
 * 08/30/2015, Edited Version
 */
public class Letters {
    public static void main(String[] args) {
        parentLetter(); 
        friendLetter(); 
        siblingLetter(); 
    }
    
    //the below method prints the letter to frined
    public static void friendLetter() {
        System.out.println("Hello Friend! \n Hope you are doing well and enjoying the beginning of your school year!"); 
        school(); 
        hobbies(); 
        weather(); 
        ending(); 
    }
    
    //the below method prints the letter to a sibling
    public static void siblingLetter() {
        System.out.println("Hello sister \n I hope you are enjoying college and the beginning of your school year.");
        school(); 
        extracurriculars(); 
        weather(); 
        ending(); 
    }
    
    //the below method prints a letter to parents
    public static void parentLetter() {
        System.out.println("Hi Mom and Dad! \n I have recently started school and decided to write you a letter about my new activities."); 
        school(); 
        hobbies(); 
        extracurriculars(); 
        ending(); 
    }
    //the below method prints info on school for the letter
    public static void school() {
        System.out.println("School started two weeks. I have classes from periods one to six, and I am finally a senior!"); 
        System.out.println("School seems good so far"); 
    }
    
    //the below method prints info on hobbies for the letter
    public static void hobbies() {
        System.out.println("In my free time, I have been enjoying going hiking, especially over the weekends."); 
        System.out.println("I have gone to San Bruno Mountain and Sweeney Ridge and they are really pretty!."); 
    }
    
    //the below method prints info on extracurriculars for the letter
    public static void extracurriculars() {
        System.out.println("I have quit playing the flute. It is nice because I don't have to wake up early for band anymore."); 
    }
    //the below method prints info on the weather
    public static void weather() {
        System.out.println("The weather has been nice. It hasn't been too cool or too warm, but yesterday it was pretty humid."); 
    }
    //the below method is the ending of the letters (the formality)
    public static void ending() {
        System.out.println("Sincerely, \n Ramya and Emily"); 
        System.out.println(""); 
    }
        
}
