package ifsc.poo;

import java.awt.Color;

import edu.princeton.cs.algs4.Draw;

public class Grade{

    // Atributos do objeto
    private final double x0, y0;

    public Grade(double x, double y){

        this.x0 = x;
        this.y0 = y;

    }

    public double getCX(){

        return this.x0;

    }

    public double getCY(){

        return this.y0;

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
            // +20 pois draw posiciona square pelo seu centro cy
            // +20 representa a metade de cada lado do square (20 = metade de 40)
            // Multiplicar por 40 é o espaçamento entre cada square da grade

            grade.text(cx, this.y0 - 20, (numero++) + "", 20);

        }

        for(int i = 0; i < 10; i ++){

            double cy = this.y0 + i * 40 + 20;
            // +20 pois draw posiciona square pelo seu centro cy
            // +20 representa a metade de cada lado do square (20 = metade de 40)
            // Multiplicar por 40 é o espaçamento entre cada square da grade

            grade.text(this.x0 - 20, cy, (letra++) + "", 20);

        }

        // Subtrair 20 em ambos grade.text para deslocar, respectivamente,
        // as letras para esquerda e os números para baixo;
        // isto é, deslocamento de 20 pixels para esquerda e para baixo.
        // Multiplicar por 40 é o espaçamento entre cada square da grade

    }

}