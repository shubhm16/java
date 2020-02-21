public class NumberTask{
    public static void main (String[] args){
        
        int CheckNumber=2;
        
        boolean isPrime=true;

        int remainder;

        for(int i=2;i<=CheckNumber/2;i++)
        {
            remainder=CheckNumber%i;
            
           // System.out.println(CheckNumber+"get two number"+ remainder);
            
            if(remainder==0)
            {
               isPrime=false;
               //break;
            }
         
        }

            if(isPrime)
                 System.out.println(CheckNumber + " is a Prime number");
            else
                System.out.println(CheckNumber + " is not a Prime number");
       }
     
}