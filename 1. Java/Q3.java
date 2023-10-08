import java.util.HashSet;

public class Q3 
{
        public static boolean MySolution(String str)
    {
        HashSet<Character> set = new HashSet<>();
        
        for(char val : str.toCharArray())
        {
            if(val>='A' && val<='Z')
            {
                set.add(Character.toLowerCase(val));
            }
            if(val>='a' && val<='z')
            {
                set.add(val);
            }
        }
        
        if(set.size()==26){return true;}
        return false;
    } 
    
    public static void main(String[] args) {
        String str = "aaaZZaWWxW";
        boolean ans =  MySolution(str);
        System.out.println(ans);
    }
}
