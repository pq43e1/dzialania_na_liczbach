public class LiczbaNarcystyczna{

     public static void main(String []args){
         
        int x = 153, tempX = x, mnoznik = 10, suma = 0, licznikPotegi = 1;
        
        while(tempX>0)
        {
            tempX = tempX/mnoznik;
            mnoznik *= 10;
            licznikPotegi++;
        }
        mnoznik/=10;
        tempX = x;
        for(int i = 0 ; i < licznikPotegi; i++)
        {
            int reszta = tempX%10;
            tempX /= 10;
            System.out.print("Iteracja("+i+") tempX: "+tempX+ " reszta: "+reszta);
            
            suma = suma + poteguj(reszta, licznikPotegi);
            mnoznik /= 10;
            System.out.println(" Mnoznik: "+mnoznik+" licznikPotegi: "+licznikPotegi+" suma: "+suma+" x: "+x);
        }
        if(suma == x) System.out.println("Liczba "+x+" jest liczba narcystyczna.");
        else System.out.println("Liczba "+x+" nie jest liczba narcystyczna.");
       // System.out.println("tempX: "+tempX + " Mnoznik: "+mnoznik+" licznikPotegi: "+licznikPotegi+" suma: "+suma+" x: "+x);
     }
     
     public static int poteguj(int liczba, int mnoznik)
     {
         int liczbaFinal = liczba;
         for(int i = 0 ; i < mnoznik-1 ; i++)
         {
             liczbaFinal = liczbaFinal * liczba;
         }
         return liczbaFinal;
     }
}
