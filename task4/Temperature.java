
public class Temperature{
    public static void main(String[] args) {
        int temps[]= new int[11];

        temps[0] = 1;  
        temps[1] = 20;    
        temps[2] = 40;    
        temps[3] = 60;
        temps[4] = 80;
        temps[5] = 100;
        temps[6] = 120;
        temps[7] = 140;
        temps[8] = 160;
        temps[9] = 180;
        temps[10] = 200;


        for(int i = 0; i <= temps.length; i++) {

          int celsius  = (( 5 * (temps[i] - 32) ) / 9);

            System.out.println(temps[i] + "\t" + celsius + " C");
         
        /*int array [] ={1,20,40,60,80,100,120,140,160,180,200,220,240,260,280,300};
        
        for (int fahrenheit: array) {
            
            int celsius  = (( 5 * (fahrenheit - 32) ) / 9);

            System.out.println(fahrenheit + "\t" + celsius );*/
         
        }
        
    }
}
