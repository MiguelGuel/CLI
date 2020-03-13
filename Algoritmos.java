import java.math.BigInteger;
public class Algoritmos{
  public static class Fibonacci {
    public static String[] getNumbers(int limit){
        String [] numeros=new String[limit];
        BigInteger  a,b,c;
        a=new BigInteger("0");
        b=new BigInteger("0");
        c=new BigInteger("1");
        for (int i=0;i<limit;i++){
            numeros[i]=String.valueOf(c.toString());
            a=b;
            b=c;
            c=a.add(b);
        }
        return numeros;
    }
  }
  public static class Padovan {
    public static String[] getNumbers(int limit){
      String[] numeros=new String[limit];
      BigInteger a,b,c,d;
      a=new BigInteger("0");
      b=new BigInteger("0");
      c=new BigInteger("1");
      d=new BigInteger("1");
      for (int i = 0; i < limit; i++) {
        numeros[i]=String.valueOf(d.toString());
        a=b;
        b=c;          
        c=d;  
        d=a.add(b);
      }
      return numeros;
    } 
  }
  public static class Pascal {
    public static String [] getNumbers(int level,int term){
      int datos=0;
      for (int i=0;i<level;i++){
        datos=datos+i+1;
      }
      datos=datos-(level-term);
      String [] numeros=new String[datos];
      //level=4
      //term=3
      int pos=0;
      BigInteger a,b;
      for (int i=1;i<=level;i++){
        if (i<level){
          for (int j=1;j<i+1;j++){
            if (j==1||j==i){
              numeros[pos]="1";
            }
            else{
              int pospadre=pos-(i-1);
              a=new BigInteger(numeros[pospadre]);
              b=new BigInteger(numeros[pospadre-1]);
              numeros[pos]=a.add(b).toString();
            }
            pos=pos+1;
          }
        }
        else{
          for (int j=1;j<=term;j++){
            if (j==1||j==i){
              numeros[pos]="1";
            }
            else{
              int pospadre=pos-(i-1);
              a=new BigInteger(numeros[pospadre]);
              b=new BigInteger(numeros[pospadre-1]);
              numeros[pos]=a.add(b).toString();
            }
            pos=pos+1;
          }
        }
      }
      return numeros;

      
    }
  }
}
