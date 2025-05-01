package ifsc.poo;

import java.awt.Color;

import edu.princeton.cs.algs4.Draw;

public class Navio {
    
    /*  
        Lista de navios do jogo Batalha Naval

        Navio            | Tamanho (casas) | Símbolo | Nº do navio para criar no código (App)
        Porta-aviões     |      5          |    P    |               1
        Encouraçado      |      4          |    E    |               2
        Cruzador         |      3          |    C    |               3
        Submarino        |      3          |    S    |               4
        Contratorpedeiro |      2          |    N    |               5
    */

    // Constantes
    private final double PIXEL = 40.0;
    private final String[] navios = {"P", "E", "C", "S", "N"};
    private final String[] nomesNavios = {"Porta-aviões", "Encouraçado", "Cruzador",
                                          "Submarino", "Contratorpedeiro"};
    
    // Atributos do Objeto
    private String simbolo;
    private String nomeNavio;
    private int tamanho;
    private boolean orientacao; // true = vertical e false = horizontal
    private double [] posicao;

    // Atributos da classe
    // Fiz pensando caso fosse obrigatório validar o tabuleiro e posição dos navios
    private boolean[] navioDesenhado = new boolean[5];
    private boolean temNavioNaHorizontal = false;
    private boolean temNavioNaVertical = false;
    private byte quantidadeNavioDesenhado = 0;

    public Navio(int numeroSimbolo, boolean orientacao, double [] pos){

        if(validaEntrada(numeroSimbolo)){
            this.simbolo = navios[numeroSimbolo - 1];
            this.nomeNavio = nomesNavios[numeroSimbolo - 1];
            this.tamanho = setTamanho(simbolo);
            this.orientacao = orientacao;

            if(validaPosicao(pos))
                this.posicao = pos;
            
            this.navioDesenhado[numeroSimbolo - 1] = true;

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

        for(int i = 0; i < this.tamanho; i++){

            double cx, cy;

            if(this.orientacao){ // true é vertical

                if(this.posicao[1] + this.tamanho > 10){
                    avisoLimiteDeBorda();
                    return;
                }

                cx = x0 + this.posicao[0] * PIXEL + (PIXEL / 2.0);
                cy = y0 + (this.posicao[1] + i) * PIXEL + (PIXEL / 2.0);
                this.temNavioNaVertical = true;                

            }
            
            else { // false é horizontal

                if(this.posicao[0] + this.tamanho > 10){
                    avisoLimiteDeBorda();
                    return;
                }

                cx = x0 + (this.posicao[0] + i) * PIXEL + (PIXEL / 2.0);
                cy = y0 + this.posicao[1] * PIXEL + (PIXEL / 2.0);
                this.temNavioNaHorizontal = true;

            }

            tab.setPenColor(Color.red);
            tab.filledSquare(cx, cy, PIXEL / 2.0);

            tab.setPenColor(Color.black);
            tab.square(cx, cy, PIXEL / 2.0) ;
            
            this.quantidadeNavioDesenhado++;
            
            /* 
             * Testei duas possibilidades de a cor vermelho não sobrepor as linhas:
             * 
             * 1) Em tab.filledSquare(cx, cy, (PIXEL / 2.0) - 0.5), no último argumento,
             * referente ao tamanho, não coloquei metade do PIXEL (metade de 40) para
             * que o preenchimento do quadrado não sobreponha as linhas da grade.
             * Coloquei a metade do PIXEL e subtraí um pequeno valor. 
             * 
             * 2) Em tab.filledSquare(cx, cy, PIXEL / 2.0), será preenchido todo o quadrado,
             * inclusive as linhas, porém depois eu altero a cor do Draw tab para black e, por 
             * fim, desenho um quadrado sem cor de fundo na mesma coordenada que acabou de ser 
             * preenchida.
            */
        }

    }

    private void avisoLimiteDeBorda(){

        System.out.println("Navio " + this.nomeNavio + " passou da borda");

    }
}