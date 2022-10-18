import java.util.Scanner;
class Main {
  public static int dobro (int a){
  return (a * 2);
  }
  public static void main (String[] args){
  Scanner entrada = new Scanner (System.in);
  System.out.println("digite um numero");
  int a = entrada.nextInt();
  System.out.println(dobro(a));
  }}