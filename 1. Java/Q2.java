import java.util.HashMap;

public class Q2 
{
    public int MySolution(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int n = str.length();

        int num=0;
        for(int i=0;i<n;i++)
        {
           
            if( i<n-1 && map.get(str.charAt(i))<map.get(str.charAt(i+1)) )
            {
                num+= map.get(str.charAt(i+1)) - map.get(str.charAt(i));
                i++;
            }
            else
            {
                num+= map.get(str.charAt(i));
            }
        }
        
        return num;
    }
    
    public  void  main(String[] args) 
    {
        String str = "IX";
        int ans =  MySolution(str); 
    }
     
}
