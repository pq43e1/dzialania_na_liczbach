public class LiczbaPierwsza{

     public static void main(String []args){
         
      int zakres = 13;
      
      for(int x = 1 ; x < zakres+1; x++)
      {
        if(czyPierwsza(x)){
            if(x==zakres) System.out.print(x);
            else
            System.out.print(x+", ");
        } 
      }
    }
    
    public static boolean czyPierwsza(int x)
    {
        int zakres;
        if(x<5) zakres = x;
        else zakres = x/2;
        if(x<0) 
        {
            x = -x;
        }
        
        for(int i = 2 ; i <zakres ; i++)
        {
            //System.out.println("Iteracja("+(i-1)+") "+x+"/"+i+"="+x/i);
            if(x%i == 0)
            {
                i=x/2;
                return false;
            }
        }
        return true;
    }
}
