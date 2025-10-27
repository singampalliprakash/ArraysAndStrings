package arraysAndStrings;

import java.util.*;


import job.Solution; 

public class FindDuplicates{
    public static List<Integer> findDuplicates(int[] nums) {
       
        HashSet<Integer> set = new HashSet<>();

      
        List<Integer> duplicates = new ArrayList<>();

      
        for (int val : nums) {
            
            if (!set.add(val)) {
                duplicates.add(val);
            }
        }

        
        return duplicates;
    }

    
    public static void main(Stringx[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println("Duplicate numbers: " + findDuplicates(nums));
    }
}
