class Solution {
    public int[] twoSum(int[] nums, int target) {
 int solution[] =  new int[2];   
     
   Map<Integer ,Integer> resultMap = new HashMap<>();
  
  for(int i=0 ; i<nums.length ; i++) 
  {

      if(resultMap.get(target-nums[i])==  null)
          resultMap.put(nums[i], i);
      else
      {
          solution[0]=  resultMap.get(target-nums[i]);
      solution[1]= i;
      }



}
        return solution;
        
        

          }
        
        
        
    }
