
package temperaturapromedio;

/**
 *
 * @author DAVID ALEJANDRO
 */
public class TemperaturaPromedio {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                //variable tem
        int sum=0,i;
        double prom=0;
       int[] temp = new int[6];
       //arreglo
       temp[0] = 35;
       temp[1] = 40;
       temp[2] = 40;
       temp[3] = 40;
       temp[4] = 40;
       temp[5] = 40;
                                         ///tamaño del arreglo tem.lengt
              for(i=0;i<temp.length;i++){
        sum = sum + temp[i];   
    }
         prom = sum / temp.length; 
                  System.out.println("promedio es " +prom);
// TODO code application logic here
    }
    }
