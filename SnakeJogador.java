import java.awt.Point;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;


/**
 * Classe de exemplo para a implementação de um Jogador para o Jogo Snake.
 * Nesta implementação, a próxima direção da cobra é escolhida aleatoriamente
 * entre as direções possíveis (que não geram colisões).
 * <p>
 * Use esta classe como base inicial para a sua solução do jogo. Basicamente
 * você precisará reimplementar o método {@code getDirecao}.
 * 
 * @author Horácio
 */

public class SnakeJogador {
    private Snake jogo;
    
    /**
     * Cria um novo jogador para o jogo passado como parâmetro.
     * @param jogo jogo snake.
     */
    public SnakeJogador(Snake jogo) {
        this.jogo = jogo;
    }

    /**
     * Executado pelo método {@link Snake#inicia()} a cada 'tick' do jogo para
     * perguntar qual a próxima direção da cobra ('C'ima, 'D'ireita, 'B'aixo,
     * 'E'squerda ou 'N'enhum).
     * 
     * @return a próxima direção da cobra.
     */
    class Node {// define o tipo NÓ para busca em largura
        Point pos;
        List<Character> path; //lista de char que vai conter o caminho para a comida

        public Node(Point pos, List<Character> path) {
            this.pos = pos;
            this.path = new ArrayList<>(path); // deve utilizar novante path para evitar loops infinitos
        }
    }

    public List<Character> calcularRota(Point cabeca, Point comida) { // define uma rota completa da posição atual da cabeça até a comida
        Queue<Node> queue = new LinkedList<>(); // fila de nós
        Set<Point> visitados = new HashSet<>(); //contém os pontos que já foram visitados e evita que eles sejam visitados novamente até a cabeca encontrar a comida

        queue.add(new Node(cabeca, new ArrayList<>()));// cria um nó para a fila contendo a posição da cabeça e a informações de caminho coletadas
        visitados.add(cabeca); // adiciona a posição atual da cabeca aos visitados

        int[] dx = {1, -1, 0, 0}; // define o eixo X
        int[] dy = {0, 0, 1, -1}; // define o eixo Y
        char[] direcoes = {'D', 'E', 'B', 'C'}; 

        while (!queue.isEmpty()) { // continua enquanto a fila não for vazia
            Node atual = queue.poll(); // pega o primeiro elemento da fila como nó atual

            if (atual.pos.equals(comida)) { // verifica se a comida foi coletada
                return atual.path;
            }

            
            for (int i = 0; i < 4; i++) { // atualiza o eixo X e Y e define o Point da nova posição da cabeca
                int novoX = atual.pos.x + dx[i];
                int novoY = atual.pos.y + dy[i];
                Point novaPos = new Point(novoX, novoY);

                
                if (jogo.isCelulaLivre(novoX, novoY) && !visitados.contains(novaPos)) {
                    List<Character> novaRota = new ArrayList<>(atual.path); // define a nova rota usando oq já se tem da atual.path
                    novaRota.add(direcoes[i]); // nova rota recebe a informação de qual direção deve se mover
                    queue.add(new Node(novaPos, novaRota)); // novo nó criado
                    visitados.add(novaPos); // novo posição da cabeca adicionado aos visitados
                }
            }
        }

        
        return null;
    }

 // funçao para quando não seja possivel definir uma rota até a comida. Então a cobra 'ganha tempo' até achar um caminho
    public char movimentoSeguro(Point cabeca) { 
        int[] dx = {1, -1, 0, 0}; 
        int[] dy = {0, 0, 1, -1}; 
        char[] direcoes = {'D', 'E', 'B', 'C'}; 

        for (int i = 0; i < 4; i++) {
            int novoX = cabeca.x + dx[i];
            int novoY = cabeca.y + dy[i];

            if (jogo.isCelulaLivre(novoX, novoY)) { // verifica se a cedula é livre e devolve a informação
                return direcoes[i]; 
            }
        }

        
        return 'N'; // caso não haja celulas livres. aceita a derrota.
    }

    
    public char getDirecao() {
        Point cabeca = jogo.getSegmentos().getFirst();
        Point comida = jogo.getComida();

   
        List<Character> rota = calcularRota(cabeca, comida); // cria a rota

   
        if (rota != null && !rota.isEmpty()) { // devolve a rota enquanto ela existir
            return rota.get(0);
        }

       
        return movimentoSeguro(cabeca); // tenta ganhar tempo até uma nova rota ser traçada
    }
    
}
