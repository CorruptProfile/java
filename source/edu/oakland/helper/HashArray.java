package edu.oakland.helper;

/**
 * Class generates the elements that will be placed into the array.
 * 
 */
public class HashArray {
        
    public int[] generateHashArray(int maxValueSize, int hashArraySize) {
        
        int[] hashArray = new int[hashArraySize];
        
        System.out.println("The hashArray length is: " + hashArray.length);
        
        for (int i = 0; i < hashArray.length; i++) {
            // Math.random() multiples maxValueSize by a random value 0.0 < x < 1.0 
            // and ensures value is greater then the hashArraySize
            hashArray[i] = (int) (Math.random() * maxValueSize + hashArraySize);
        } 
        
        return hashArray;
        
    }
    
    
    
    
}
