package konsolowo;

public class Ulamek {

    public static double[] pomnoz(double a1, double b1, double a2, double b2){
        return new double[]{a1*a2, b1*b2};
    }

    public static double[] poteguj(double a, double b, int potega){
        return new double[]{Math.pow(a, potega), Math.pow(b, potega)};
    }

    public static double[] pierwiastkuj(double a, double b){
        return new double[]{Math.sqrt(a), Math.sqrt(b)};
    }

    public static double[] dodaj(double a1, double a2, double b2){              //jezeli liczba calkowita + ulamek
        return dodaj(a1, 1.0, a2, b2);
    }

    public static double[] dodaj(double a1, double b1, double a2, double b2){   //jeżeli dwa ułamki
        if(b1 == b2){
            if((a1+a2)>b2)
            {
                return wyciagnijLiczbeCalkowita(a1+a2, b2);
            }
            else return new double[]{a1+a2, b1};
        }else{
            double tempB1B2 = b1 * b2;
            double tempA1A2 = (a1 * b2)+(a2*b1);
            if(tempA1A2 > tempB1B2) {
                return wyciagnijLiczbeCalkowita(tempA1A2, tempB1B2);
                }
            return skroc(tempA1A2, tempB1B2);
            }
        }

    public static double[] wyciagnijLiczbeCalkowita(double a, double b){
        double liczbaCalkowita = 0;
        while ((a) > b) {
            liczbaCalkowita++;
            a -= b;
        }
        if(a == b){
            return new double[]{liczbaCalkowita+1};
        }
        double[] temp = skroc(a, b);
        return new double[]{liczbaCalkowita,temp[0], temp[1]};
    }

    public static double[] skroc(double a, double b){
            for(double i = a ; i > 0 ; i--){
                if(a!= 1 && a%i == 0 && b%1 ==0){
                    a /= i;
                    b /= i;
                    return skroc(a, b);
                }
            }
        return new double[]{a, b};
    }
}
