package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
			int[]num= {2,5,7,7,5,9,2,3};
			//size of the array
			int arrSize= num.length;
			System.out.println("Length of the Array:"+arrSize);
			Arrays.sort(num);
			for (int i = 0; i < num.length; i++) {
				for (int j = i+1; j <num.length; j++) {
					if (num[i]==num[j]) {
						System.out.println(num[j]);
					}
				}
			}

	}

}
