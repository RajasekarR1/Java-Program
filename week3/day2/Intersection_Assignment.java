package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_Assignment {
	
	    public static void main(String[] args) {
	    	//Declare to 2 array list
	        Integer[] arr1 = {3, 2, 11, 4, 6, 7};
	        Integer[] arr2 = {1, 2, 8, 4, 9, 7};
	        
	        // Array.asList return will be stored in list1
	       List<Integer> list1  = new ArrayList<Integer>(Arrays.asList(arr1));
	       
	       //Array.aslist(arr2) will be stored in List 2
	       List<Integer> list2  = (Arrays.asList(arr2));
	        
	        //retain only the elements in list 1 and list 2
	        list1.retainAll(list2);
	        
	        System.out.println("Intersection number of two array is :" + list1);
	    
	}
}
	    /*    HashSet<Integer> set = new HashSet<Integer>();

	        for(int num : arr1) {
	            set.add(num);
	        }

	        System.out.println("Intersection of two arrays is: ");
	        for(int num : arr2) {
	            if(set.contains(num)) {
	                System.out.println(num);
	            }
	        }
	    }*/

