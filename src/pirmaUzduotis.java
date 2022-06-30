import java.util.Scanner;

public class pirmaUzduotis {
    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
       // System.out.println("Irasikite skaiciu");
        //int a = skaitytuvas.nextInt();
        //System.out.println(arPirminisSkaicius(a));
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(pirmujuKiekisMasyve(array));
    }
    public  static boolean arPirminisSkaicius(int skaicius){
        boolean pirminis = true;
        for (int i = 2; i <= skaicius / 2; ++i) {
            if (skaicius % i == 0) {
                pirminis = false;
            }
        }
        return pirminis;
    }

    public static int pirmujuKiekisMasyve(int[] array){
        int skaicius = 0;
        for (int i = 0; i < array.length; ++i) {
            if (!arPirminisSkaicius(i)){
                skaicius++;
            }
        }
        return skaicius;
    }
}
