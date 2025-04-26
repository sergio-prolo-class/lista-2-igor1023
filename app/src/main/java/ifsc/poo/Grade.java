package ifsc.poo;

import java.awt.Color;

import edu.princeton.cs.algs4.Draw;

public class Grade{

    private double x0, y0;

    public Grade(double x, double y){

        this.x0 = x;
        this.y0 = y;

    }

    public void desenhar(Draw grade){

        double cx, cy;

        for(int i = 0; i < 10; i++) {

            for(int j = 0; j < 10; j++){

                cy = y0 + i * 40 + 20;
                cx = x0 + j * 40 + 20;
                grade.setPenColor(Color.black); // Cor do tabuleiro é preto
                grade.square(cx, cy, 20.0f);

            }
        }

        grade.setPenColor(Color.red); // A cor dos rótulos será vermelho
        rotulo(grade);
    }

    private void rotulo(Draw grade){

        char letra = 'A';
        char numero = '0';


        for(int i = 0; i < 10; i ++){
            
            double cx = x0 + i * 40 + 20;
            grade.text(cx, this.y0 - 20, (numero++) + "", 20);

        }

        for(int i = 0; i < 10; i ++){

            double cy = this.y0 + i * 40 + 20;
            grade.text(this.x0 - 20, cy, (letra++) + "", 20);

        }

        // Subtrair 20 em ambos os for para deslocar, respectivamente,
        // As letras para esquerda e os números para baixo;
        // Isto é, deslocamento de 20 pixels para esquerda e para baixo.

    }

}