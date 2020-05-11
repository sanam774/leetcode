class Solution {
    public int romanToInt(String s) {
        int res = 0;
        Ro.load();
        char[] ch = s.toCharArray();
        int prevVal = Ro.getVal(ch[ch.length-1]);
        for(int i=ch.length-1; i>=0; i--){
           if(prevVal > Ro.getVal(ch[i])){
               res = res - Ro.getVal(ch[i]);
           } else {
               res = res + Ro.getVal(ch[i]);
           }
           prevVal = Ro.getVal(ch[i]);
        }
        return res;
    }
}
class Ro {
    public char val;
    public int intVal;
    public static Map<Character,Ro> mp = new HashMap<>();
    
    public Ro(char c, int intVal){
        this.val = c;
        this.intVal = intVal;
    }
    
    public static void load(){
        Ro I = new Ro('I', 1);
        Ro V = new Ro('V', 5);
        Ro X = new Ro('X', 10);
        Ro L = new Ro('L', 50);
        Ro C = new Ro('C', 100);
        Ro D = new Ro('D', 500);
        Ro M = new Ro('M', 1000);
        mp.put('I', I);
        mp.put('V', V);
        mp.put('X', X);
        mp.put('L', L);
        mp.put('C', C);
        mp.put('D', D);
        mp.put('M', M);
        
    }
    
    public static int getVal(char c){
        if( null != mp.get(c)){
           return  mp.get(c).intVal;
        }
        return 0;
    }
    
    
    
}