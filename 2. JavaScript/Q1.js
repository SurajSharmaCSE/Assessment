class Q1 {
    revStr(s){
       //code here
       //method 1
      return s.split('').reverse().join('');
    
    //  Method-2
     let str = "";
     for(let i=0;i<s.length;i++)
     {
         str = s.charAt(i)+str;
     }
     
     return str;
     
    }
}