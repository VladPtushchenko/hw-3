public class ATM{
 public int countBanknotes(int sum){
   int count = 0;
   int[] bankVal = new int[]{500,200,100,50,20,10,5,2,1};
   int i =0;
  while (i<bankVal.length){
        int quotient = sum / bankVal[i];
        int remainder = sum % bankVal[i];    
       count = count+quotient;
       sum = remainder;
    i++;
   }
   return count;
 }
  
}
