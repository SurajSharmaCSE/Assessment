class Q2
{
    sortDescending(arr) 
    {
        // Sort the array in descending order using a custom comparison function
        arr.sort(function(a, b) {
          return b - a;  // Compare in descending order
        });
        return arr;
    }
    
}
