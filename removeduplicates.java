class Solution {
    public int removeDuplicates(int[] nums) {
        
     int i=0;
        int j=1;
    while(i< nums.length &&  j<nums.length ) 
    {
        if(nums[i] == nums[j])
            j++;
        
        else if(j-i>1 )
        {

    
            int temp = nums[i+1];
             nums[i+1]= nums[j];
         nums[j]= temp;
         
         
            i++;
            j++;
            

}
        else
        {
            i++;
            j++;


}   
        


        
        
    }
        
        return i+1;
}
    
}
