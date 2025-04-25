package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade{

    public static void desenhar(Draw grade){

        rotulo(grade);

        for(int y = 100; y < 500; y += 40) {

            for(int x = 100; x < 500; x += 40){

                grade.square((double) x, (double) y, 20.0f);

            }
        }
    }

    private static void rotulo(Draw grade){

        char letra = 'A';
        char numero = '0';

        for(int i = 100; i < 500; i += 40)
            grade.text(i, 50, (numero++) + "", 20);

        for(int i = 100; i < 500; i += 40)
            grade.text(50, i, (letra++) + "", 20);

    }

}