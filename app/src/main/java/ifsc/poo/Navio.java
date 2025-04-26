package ifsc.poo;

import java.awt.Color;

import edu.princeton.cs.algs4.Draw;

public class Navio {
    
    /*  Lista de navios do jogo Batalha Naval
        Navio           Tamanho (casas)     Símbolo
        Porta-aviões        5                   P
        Encouraçado         4                   E
        Cruzador            3                   C
        Submarino           3                   S
        Contratorpedeiro    2                   N
    */

    // Constantes
    private final String[] navios = {"P", "E", "C", "S", "N"};
    
    // Atributos
    private String simbolo;
    private int tamanho;
    private boolean orientacao; // true - vertical e false horizontal
    private double [] posicao;
    
    public Navio(int numeroSimbolo, boolean orientacao, double [] pos){

        if(validaEntrada(numeroSimbolo)){
            this.simbolo = navios[numeroSimbolo - 1];
            this.tamanho = setTamanho(simbolo);
            this.orientacao = orientacao;

            if(validaPosicao(pos))
                this.posicao = pos;

        } else System.out.println("Entradas inválidas");
    }

    private static boolean validaEntrada(int num){

        return num >= 1 && num <= 5;

    }

    private static int setTamanho(String simbolo){

        return switch(simbolo){

            case "P" -> 5;
            case "E" -> 4;
            case "C" -> 3;
            case "S" -> 3;
            case "N" -> 2;
            default  -> 0; 

        };

    }

    private static boolean validaPosicao(double[] pos){

        return ((pos[0] >= 0.0 && pos[0] <= 9.0) && (pos[1] >= 0.0 && pos[1] <= 9.0));

    }

    public void desenhar(Draw tab, Grade grade){

        double x0 = grade.getCX();
        double y0 = grade.getCY();

        if(this.posicao[0] + this.tamanho > 9 || this.posicao[1] + this.tamanho > 9){
            System.out.println("Passou da borda");
            return;
        }


        for(int i = 0; i < this.tamanho; i++){

            double cx, cy;

            if(this.orientacao){ // true é vertical

                cx = x0 + this.posicao[0] * 40.0 + 20.0;
                cy = y0 + (this.posicao[1] + i) * 40.0 + 20.0;

            }
            
            else { // false é horizontal

                cx = x0 + (this.posicao[0] + i) * 40.0 + 20.0;
                cy = y0 + this.posicao[1] * 40.0 + 20.0;

            }

            tab.setPenColor(Color.red);
            tab.filledSquare(cx, cy, 19.125);
        }

    }
}