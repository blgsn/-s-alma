
import java.util.Scanner;
public class Main {

public static int pow(int base,int power){
if (power==0)//if power is 0, return value 1
return 1;
else if(base==1)//if base is 1, return value 1
return 1;
else //if base or power have value except 1 or 0, apply recursive method
return base*pow(base,power-1);

}
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("taban değerini giriniz:");
int base=input.nextInt();
System.out.println("üsdeğerini giriniz:");
int power=input.nextInt();
System.out.println("sonuc: "+pow(base, power));

}

}