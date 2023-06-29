import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int say=input.nextInt();
         int toplam=0;
         int baslangıc=0;
         double ort;

        for(int i=0;i<=say;i++)
        {
            if (i % 3==0 && i % 4==0)
            {
                toplam +=i;
                baslangıc++;

            }

        }
        ort=toplam/baslangıc;
        System.out.println("ortalamamız:"+ort);
    }
}