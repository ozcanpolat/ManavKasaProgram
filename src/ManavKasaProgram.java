import java.util.Scanner;

public class ManavKasaProgram {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican;
        double tutar;

        Scanner input= new Scanner(System.in);
        System.out.print("Armut kac kilo ? : ");
        armut=input.nextDouble();
        System.out.print("Elma kac kilo ? : ");
        elma=input.nextDouble();
        System.out.print("Domates kac kilo ? : ");
        domates=input.nextDouble();
        System.out.print("Muz kac kilo ? : ");
        muz=input.nextDouble();
        System.out.print("Patlican kac kilo ? : ");
        patlican=input.nextDouble();

        tutar= armut*2.14 + elma*3.67 + domates*1.11+ muz*0.95 + patlican*5;
        System.out.println("Toplam Tutar ="+tutar);

    }
}
