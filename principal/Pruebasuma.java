package principal;

import java.util.Scanner;

public class Pruebasuma {

    public void suma() {
        try (Scanner entradaEscaner = new Scanner(System.in)) {
            int num1 = 0;
            int num2 = 0;
            int rta;
            System.out.println("escriba numero 1");

            num1 = Integer.parseInt(entradaEscaner.nextLine());
            System.out.println("escriba numero 2");
            num2 = Integer.parseInt(entradaEscaner.nextLine());
            String msg = "el resultado es:";

            rta = num1 + num2;
            System.out.println(msg + rta);
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
        }

    }

}
