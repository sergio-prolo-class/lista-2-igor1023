[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/KKrNRA9P)

# Aluno: Igor da Silva
# Engenharia de Telecomunicações - turma: 129003

# Lista 2 - POO
- Este repositório possui os exercícios propostos da lista de exercícios 2 da disciplina de Poo

- Para executar o programa (Classe App.java), digite "gradle run" ou "./gradlew run" (sem aspas duplas) dentro da pasta raíz do projeto.

- Link para acesso da algs4: https://github.com/emersonmello/algs4/releases

## Observações
- Cada etapa da lista 2 já possui um método que a testa. Estes métodos estão definidos na classe App. Para ativá-los, basta descomentar o "chamamento" do método no método main da classe App. Sugestão: testar uma etapa por vez.
- Há implementações que poderiam ser feitas com tipo INT, entretanto, como se trata de coordenadas, o aluno pensou em números reais, preferindo uso do tipo DOUBLE.

## Etapa 1 - procedimentos de uso
- Representada pelo método testarEtapa1 da classe App. Basta descomentá-lo no método main da classe App para testar a etapa 1.
- Não há o que alterar neste método, basta descomentá-lo para visualizar o resultado.

## Etapa 2 - procedimentos de uso
- Representada pelo método testarEtapa2 da classe App. Basta descomentá-lo no método main da classe App para testar a etapa 2.
- Para definir a dimensão x0 e y0 da grade, alterar os respectivos valores na criação do objeto draw da classe Draw: Grade 
grade = new Grade(100, 100);
- inicialização: Draw nomeObjetoDraw = new Grade(double x, double y);
- Por exemplo, Grade grade = new Grade(50, 75) cria uma grade de 50 x 75 pixels;
- Obs.: o padrão é 100 x 100. 

## Etapa 3 - procedimentos de uso
- Representada pelo método testarEtapa3 da classe App. Basta descomentá-lo no método main da classe App para testar a etapa 3.
- Para definir a dimensão x0 e y0 da grade, alterar os respectivos valores na criação do objeto draw da classe Draw: Grade grade = new Grade(100, 100);
- inicialização: Draw nomeObjetoDraw = new Grade(double x, double y);
- Por exemplo, Grade grade = new Grade(50, 75) cria uma grade de 50 x 75 pixels;

- Há um array "pos" que armazena dois double, tal que pos[0] guarda a coordenada X e pos[1] a coordenada Y;
- Por exemplo, double[] pos = {3.0, 2.0} posicionará o primeiro símbolo do navio na posição (3.0; 2.0);
- Obs.: o padrão está pos {3.0, 2.0};

- Ao inicializar um objeto da classe Navio, utiliza-se o método construtor para definir as seguintes caracterísitcas do navio: símbolo, orientação (horizontal ou vertical) e a posição;
- Para definir o tipo, utiliza-se números de 1 a 5 conforme a tabela abaixo:

|       Navio      | Tamanho (casas) | Símbolos | Nº do navio para utilizar nos argumentos (App) |
| ---              | ---             | ---      | ---                                            |
|Porta-aviões      | 5               | P        | 1                                              |
|Encouraçado       | 4               | E        | 2                                              |
|Cruzador          | 3               | C        | 3                                              |
|Submarino         | 3               | S        | 4                                              |
|Contratorpedeiro  | 2               | N        | 5                                              |

- Para definir a orientação, utiliza-se um boolean:
\\ true = vertical;
\\ horizontal = false;
Obs.: poderia ser um STRING ou CHAR para representar a orientação, mas preferi utilizar o BOOLEAN neste formato, pois com o FALSE, pode-se pensar em 0, e TRUE em 1, como se fosse um gráfico de um clock: 1 (TRUE) faz o clock subir. Além disso, pensei que se fosse utilizar STRING ou CHAR, seria necessário realizar validações, bem como o usuário poderia passar parâmetros incorretos intencionalmente.

- Para definir a posição, basta alterar os valores do array "pos" (já explicado anteriormente).

## Etapa 4 - procedimentos de uso
- Representada pelo método testarEtapa4 da classe App. Basta descomentá-lo no método main da classe App para testar a etapa 4.
- - Para definir a dimensão x0 e y0 da grade, alterar os respectivos valores na criação do objeto draw da classe Draw: Grade grade = new Grade(100, 100);
- inicialização: Draw nomeObjetoDraw = new Grade(double x, double y);
- Por exemplo, Grade grade = new Grade(50, 75) cria uma grade de 50 x 75 pixels;

- Há um array "pos" que armazena dois double, tal que pos[0] guarda a coordenada X e pos[1] a coordenada Y;
- Por exemplo, double[] pos = {3.0, 2.0} posicionará o primeiro símbolo do navio na posição (3.0; 2.0);
- Obs.: o padrão está pos {3.0, 2.0};

- Ao inicializar um objeto da classe Navio, utiliza-se o método construtor para definir as seguintes caracterísitcas do navio: símbolo, orientação (horizontal ou vertical) e a posição;
- Para definir o tipo, utiliza-se números de 1 a 5 conforme a tabela abaixo:

|       Navio      | Tamanho (casas) | Símbolos | Nº do navio para utilizar nos argumentos (App) |
|------------------------------------------------------------------------------------------------|
|Porta-aviões      |        5        |    P     |                    1                           |
|Encouraçado       |        4        |    E     |                    2                           |
|Cruzador          |        3        |    C     |                    3                           |
|Submarino         |        3        |    S     |                    4                           |
|Contratorpedeiro  |        2        |    N     |                    5                           |

- Para definir a orientação, utiliza-se um boolean:
\\ true = vertical;
\\ horizontal = false;
Obs.: poderia ser um STRING ou CHAR para representar a orientação, mas preferi utilizar o BOOLEAN neste formato, pois com o FALSE, pode-se pensar em 0, e TRUE em 1, como se fosse um gráfico de um clock: 1 (TRUE) faz o clock subir. Além disso, pensei que se fosse utilizar STRING ou CHAR, seria necessário realizar validações, bem como o usuário poderia passar parâmetros incorretos intencionalmente.

- Para definir a posição, basta alterar os valores do array "pos" (já explicado anteriormente).
- Neste método, já existe cinco navios criados, basta o usuário alterar os parâmetros do método construtor de cada navio para visualizar outros resultados, pois por padrão, ao executar o método que testa a etapa 4, será impresso na tela o que a Etapa 4 solicita.