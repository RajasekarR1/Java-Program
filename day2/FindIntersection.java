package week1.day2;

public class FindIntersection {
	
	public static void main(String[] args) {
		 int[]a={3,2,11,4,6,7};
	     int[]b={1,2,8,4,9,7};
	     for (int i = 0; i <=a.length-1; i++) {
	    	 for (int j = 0; j <=b.length-1; j++){
				
	    		 if (a[i]==b[j] && (a[i]!=-1) && (b[i]!=-1)) {
	    			 
					System.out.println("The Intersection number:"+ a[i]);
					//Assign -1
					a[i]=-1;
					b[j]=-1;
				}
			}
			}
	}
}