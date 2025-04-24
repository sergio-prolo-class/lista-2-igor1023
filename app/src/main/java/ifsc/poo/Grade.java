package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade{

    public static void desenhar(Draw grade){

        for(int y = 100; y < 500; y += 40) {

            for(int x = 100; x < 500; x += 40){

                grade.square((double) x, (double) y, 20.0f);

            }

        }

    }

}