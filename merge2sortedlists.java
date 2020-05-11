**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1== null )
            return l2;
        if(l2==null)
            return l1;
        
        
       ListNode temp1 =  l1;
        
        ListNode  temp2 = l2;
        ListNode head = null;
    ListNode temp3 = null;     
while(temp1 !=null && temp2 !=null )
{
    
if(head  == null)
{
    
    if(temp1.val <=  temp2.val)
    {
        head= new ListNode(temp1.val);
        temp1 = temp1.next;
        
    }
    
    else
    {
        head =  new ListNode(temp2.val);
        temp2 = temp2.next;
        
    }

     temp3 = head;

}

else
{
    if(temp1.val <=  temp2.val)
    {
        temp3.next = new ListNode(temp1.val);
        temp3= temp3.next;
        temp1 = temp1.next;
        
    }
    
    else
    {
       temp3.next = new ListNode(temp2.val);
        temp3= temp3.next;
        temp2 = temp2.next;
        
    }


}
}
    
  while(temp1 !=null)  
  {

 temp3.next = new ListNode(temp1.val);
        temp3= temp3.next;
        temp1 = temp1.next;
        

}
    
    while(temp2 !=null)
    {

 temp3.next = new ListNode(temp2.val);
        temp3= temp3.next;
        temp2 = temp2.next;
        


}
    
    
 return   head; 
    


}
        
        
            
        
    }
