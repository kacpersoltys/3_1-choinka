import java.util.Scanner;

class Main {
public static void main(String[]args) {
  Scanner skaner = new Scanner(System.in);
System.out.print("Podaj wartość dla wysokości choinki: ");
  int wysokosc = skaner.nextInt();

  for(int i=0; i<wysokosc; i++) {
    for(int j=0; j<wysokosc-i-1; j++) {
      System.out.print(" ");
    }
for (int k=0; k<=i; k++) {
  System.out.print("*");
}    
    System.out.println();
  }
  for(int i=0; i<wysokosc; i++) {
    for(int j=0; j>wysokosc+i; j++) {
      System.out.print(" ");
    }
for (int k=0; k<=i; k++) {
  System.out.print("*");
}    
    System.out.println();
  }
}
}
