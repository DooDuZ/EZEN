package Homework;

import java.util.ArrayList;

public class test2 {

	public static void main(String[] args) {
		byte a = -126;
		
		for(int i = 1 ; i<4; i++) {
			a--;
			System.out.println(a);
		}		
	}
	
	public int countQuadruplets(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1; j<nums.length-2; j++){
                for(int k=j+1; k<nums.length-1; k++ ){
                    for(int z=k+1; z<nums.length; z++){
                        if(nums[i]+nums[j]+nums[k] == nums[z]){
                        	if(i==0) {
                        		System.out.println(i + " " + j + " " + z);
                        		System.out.println(nums[i]+nums[j]+nums[k]);
                        	}
                              count++;
                        }
                    }                    
                }
            }
        }
        return count;
    }
}