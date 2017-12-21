import java.util.Scanner;

public class Nochevieja {

  public static void main(String[] args) {
    int casos = 0;
    int dia = 0;
    int mes = 0;
    int restan = 0;
    Scanner sc = new Scanner(System.in);
    casos = sc.nextInt();
    for(int i = 0;i < casos;i++) {
      dia = sc.nextInt();
      mes = sc.nextInt();
      if(mes == 1) {
        restan = 365 - dia;
        System.out.println(restan);
      } else if(mes == 2) {
          restan = 365 - (31 + dia);
          System.out.println(restan);
      } else if(mes == 3) {
          restan = 365 - ((31 + 28) + dia);
          System.out.println(restan);
      } else if(mes == 4) {
          restan = 365 - ((31 + 28 + 31) + dia);
          System.out.println(restan);
      } else if(mes == 5) {
          restan = 365 - ((31 + 28 + 31 + 30) + dia);
          System.out.println(restan);
      } else if(mes == 6) {
          restan = 365 - ((31 + 28 + 31 + 30 + 31) + dia);
          System.out.println(restan);
      } else if(mes == 7) {
          restan = 365 - ((31 + 28 + 31 + 30 + 31 + 30) + dia);
          System.out.println(restan);
      } else if(mes == 8) {
          restan = 365 - ((31 + 28 + 31 + 30 + 31 + 30 + 31) + dia);
          System.out.println(restan);
      } else if(mes == 9) {
          restan = 365 - ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31) + dia);
          System.out.println(restan);
      } else if(mes == 10) {
          restan = 365 - ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30) + dia);
          System.out.println(restan);
      } else if(mes == 11) {
          restan = 365 - ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31) + dia);
          System.out.println(restan);
      } else {
          restan = 365 - ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30) + dia);
          System.out.println(restan);
      }
    }
  }
}
