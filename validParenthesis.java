import java.io.*; 

class Solution {
    public boolean isValid(String s) {
        
   Stack<Character>  stack = new Stack();
    
    for(int i=0 ; i<s.length(); i++)
    {
        if(s.charAt(i)== '('  || s.charAt(i)=='{'  || s.charAt(i)=='[')
            stack.push(s.charAt(i));
        
        else if(stack.isEmpty())
            return false;
        
        else
            
        {
            switch(s.charAt(i)) {
                
                case ')':
           if(stack.peek()=='(')
           stack.pop();
           
    
        else
        return false;
        break;
        
        case '}':
        
         if(stack.peek()=='{')
           stack.pop();
           
    
        else
        return false;
        break;
        
        case ']' :
              if(stack.peek()=='[')
           stack.pop();
           
    
        else
        return false;
        break;

}

            }

        
        
    }
        
   if(!stack.isEmpty()) 
       return false;
        
        return true;
        
        
}
}