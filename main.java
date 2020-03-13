import java.util.Scanner;
import java.util.regex.Pattern;
class Main {
  public static boolean verifyinput(String input){
    try{
      int num=Integer.parseInt(input);
      if (num<1){
        return false;
      }
      else{
        return true;
      }
    }catch(Exception e){
      return false;

    }
  }
  public static void cli(){
    Scanner input=new Scanner(System.in);
    int term;
    int level;
    String [] resultado;
    String command;
    boolean clienabled=true;
    while (clienabled){
      
      System.out.println("Introduzca el número de opción a realizar \n 1. Fibonacci \n 2.Padovan \n 3.Triangulo Pascal \n 4.Salir");
      command=input.nextLine();
      switch (command){
        
        case "1":
          System.out.println("Introduzca termino límite de impresion de secuencia de Fibonacci");
          command=input.nextLine();
          while (!verifyinput(command)){
            System.out.println("Entrada invalida, por favor envie solo números enteros positivos");
            command=input.nextLine();
          }
          term=Integer.parseInt(command);
          resultado=Algoritmos.Fibonacci.getNumbers(term);
          for (int i=0;i<resultado.length;i++){
            System.out.print(resultado[i]+" ");
          }
          System.out.println();
          break;
        case "2":
          System.out.println("Introduzca termino límite de impresion de secuencia de Padovan");
          term=Integer.parseInt(input.nextLine());
          resultado=Algoritmos.Padovan.getNumbers(term);
          for (int i=0;i<resultado.length;i++){
            System.out.print(resultado[i]+" ");
          }
          System.out.println();
          break;
        case "3":
          
          System.out.println("Introduzca nivel limite de piramide de Pascal.");
          command=input.nextLine();
          while (!verifyinput(command)){
            System.out.println("Por favor introduzca un numero entero positivo");
            command=input.nextLine();
          }
          level=Integer.parseInt(command);
          System.out.println("Introduzca el termino límite del nivel de la pirámide.");
          command=input.nextLine();
          while (!verifyinput(command)){
            System.out.println("Por favor introduzca un numero entero positivo menor a que no exceda al nivel proporcionado ("+level+")");
            command=input.nextLine();
          }
          term=Integer.parseInt(command);
          resultado=Algoritmos.Pascal.getNumbers(level, term);
          int i=0;
          int i2=1;
          int cambio=2;
          int temp;
          while (i<resultado.length){
              for(int j=i;j<i2&&j<resultado.length;j++){
                System.out.print(resultado[j]+" ");
              }
              System.out.println();
              temp=i2;
              i2=i2+(cambio);
              cambio=cambio+1;
              i=temp;
            
          }
          
          break;
        case "4":
          clienabled=false;
          System.out.println("---------ADIOS----------");
      }
    }
  }
  
  public static void main(String[] args) {
    cli();
  }
}
