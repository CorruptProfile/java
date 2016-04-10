package edu.oakland.production;

import java.util.Arrays;

/**
 *
 * @author brianodisho
 */
public class HashTable {

    private int collisions;
    
    /**
     * 
     * @param hashArray contains the values to be placed in the hashTable
     * @param hashTableSize size of the hashTable (should be larger then the hashArray).
     * @return hashTable
     */
    public int[] generateHashTable(int[] hashArray, int hashTableSize) {
        
        collisions = 0;
        
        int[] hashTable = new int[hashTableSize];
        
        // Assign value of -1 to every index in the hashTable
        Arrays.fill(hashTable, -1);
        
        
        // Calculate index in the hashTable for each value in the hashArray
        for (int i = 0; i < hashArray.length; i++) {
            
            int value = hashArray[i];
            int index = value % (hashTableSize - 1);
            
            System.out.println("The index = " + index + "for value " + value);
            
            // Handle collisions
            while (hashTable[index] != -1) {
            
                ++index;
                ++collisions;

                System.out.printf("Collision occured attempting to insert at index %d instead", index);
                
                if (index > hashTableSize) { index = 0;}
            
            }
            
            hashTable[index] = value;
            
        }
        
        return hashTable;
        
    }
    
    public int getCollisions() {
        return collisions;
    }
    
}
