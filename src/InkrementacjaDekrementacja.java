public class InkrementacjaDekrementacja {
    public static void main(String[] args) {

        //Inkrementacja zwiększenia wartości o jeden
        int a =0;
        System.out.println("Wartość a: " + a);
        int b = a++; // postinkrementacja = najpierw zostaje zczytana wartość zmiennej a potem jest dodanie wartości
        System.out.println("Wartość b: " + b);
        System.out.println("Wartość a: " + a);
        int c = ++a; // preinkrementacja = najpierw zwiększana jest wartość a potem przypisana do zmiennej
        System.out.println("Wartość c: " + c);
        System.out.println("Wartość a: " + a);


        //Dekrementacja zmiejszenie wartości o jeden
        int d = 0;
        System.out.println("Wartość d: " + d);
        int e = d--;
        System.out.println("Wartość e: " + e);
        System.out.println("Wartość d: " + d);
        int f = --d;
        System.out.println("Wartość f:" + f);
        System.out.println("Wartość d: " + d);
    }
}
