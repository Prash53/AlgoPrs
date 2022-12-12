package Arrayss;

import java.util.Arrays;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            //int j=0;
            int[] res = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length - 1; j++) {

                    if (i != j) {
                        if (target - nums[i] == nums[j] || target - nums[j] == nums[i]) {
                            res[0] = i;
                            res[1] = j;
                        }

                    }
                }
            }
            Arrays.sort(res);
            return res;
        }
        public static void main(String[] args){
            int[] res = new int[2];
            res=new TwoSum().twoSum(new int[]{-1,-2,-3,-4,-5},-8);
            Arrays.stream(res).forEach(a->System.out.println(a));
        }
    }

