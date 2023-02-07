import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Dizinin boyutu n :");
        int boyut = girdi.nextInt();
        int[] dizi = new int[boyut];
        System.out.println("Dizinin elemanlarını giriniz:");
        for(int i=0;i<boyut;i++){
            System.out.print((i+1)+". Elemanı :");
            dizi[i]=girdi.nextInt();
        }
        Arrays.sort(dizi);
        System.out.print(Arrays.toString(dizi));
    }
}
