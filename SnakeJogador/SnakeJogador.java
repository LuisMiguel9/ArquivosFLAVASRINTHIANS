import java.awt.Point;
import java.util.*;

/**
 * Classe de exemplo para a implementação de um Jogador para o Jogo Snake.
 * Nesta implementação, utilizamos o algoritmo A* para buscar o caminho
 * até a comida e também uma estratégia para priorizar áreas mais abertas
 * quando os custos forem iguais.
 *
 * @author Horácio
 */

public class SnakeJogador {
    private Snake jogo; // Referência ao jogo Snake

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
    public char getDirecao() {
        // Pega a posição da cabeça da cobra e a posição da comida
        Point cabeca = jogo.getSegmentos().getFirst();
        Point comida = jogo.getComida();

        // Calcula o caminho até a comida usando o algoritmo A*
        LinkedList<Point> caminho = aEstrela(cabeca, comida);

        // Se o caminho existe e tem mais de um ponto, calcula o próximo movimento
        if (caminho != null && caminho.size() > 1) {
            Point proximoPasso = caminho.get(1); // O próximo passo após a cabeça
            // Retorna a direção correspondente ao movimento a ser feito
            if (proximoPasso.x == cabeca.x && proximoPasso.y < cabeca.y) return 'C'; // Cima
            if (proximoPasso.x > cabeca.x && proximoPasso.y == cabeca.y) return 'D'; // Direita
            if (proximoPasso.x == cabeca.x && proximoPasso.y > cabeca.y) return 'B'; // Baixo
            if (proximoPasso.x < cabeca.x && proximoPasso.y == cabeca.y) return 'E'; // Esquerda
        }

        return 'N'; // Caso nenhum caminho seja encontrado, não se move
    }

    /**
     * Reconstrói o caminho da cabeça até o objetivo utilizando o mapa
     * "veioDe" que guarda as transições de cada célula.
     * @param veioDe Mapa de origem dos pontos.
     * @param atual Ponto final a partir do qual o caminho será reconstruído.
     * @return LinkedList com o caminho do início ao objetivo.
     */
    private LinkedList<Point> reconstruirCaminho(Map<Point, Point> veioDe, Point atual) {
        LinkedList<Point> caminho = new LinkedList<>();
        caminho.add(atual);
        // Volta do objetivo até o ponto de início usando o mapa de origem
        while (veioDe.containsKey(atual)) {
            atual = veioDe.get(atual);
            caminho.addFirst(atual); // Adiciona cada ponto ao início da lista
        }
        return caminho;
    }

    /**
     * Calcula a distância Manhattan entre dois pontos.
     * Usada como heurística no algoritmo A*.
     * @param a Ponto inicial.
     * @param b Ponto objetivo.
     * @return Distância Manhattan (|x1 - x2| + |y1 - y2|).
     */
    private int distanciaManhattan(Point a, Point b) {
        return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
    }

    /**
     * Implementa o algoritmo A* para encontrar o caminho da cabeça da cobra até a comida.
     * Usa a distância Manhattan como heurística e também prioriza áreas com mais espaço livre.
     * @param inicio Ponto inicial (cabeça da cobra).
     * @param objetivo Ponto objetivo (comida).
     * @return LinkedList com o caminho do início ao objetivo.
     */
    private LinkedList<Point> aEstrela(Point inicio, Point objetivo) {
        // Conjuntos e mapas usados no A*
        Set<Point> aberto = new HashSet<>();
        Map<Point, Point> veioDe = new HashMap<>();
        Map<Point, Integer> gScore = new HashMap<>();
        Map<Point, Integer> fScore = new HashMap<>();

        // Inicializa o ponto de início
        aberto.add(inicio);
        gScore.put(inicio, 0); // O custo do início até ele mesmo é 0
        fScore.put(inicio, distanciaManhattan(inicio, objetivo)); // F score inicial é a heurística

        // Loop principal do A*
        while (!aberto.isEmpty()) {
            Point atual = null;
            int menorF = Integer.MAX_VALUE;
            int maiorEspaco = -1;

            // Seleciona o ponto do conjunto aberto com o menor fScore
            for (Point p : aberto) {
                int fAtual = fScore.getOrDefault(p, Integer.MAX_VALUE);
                int espaco = calculaEspacoLivre(p); // Calcula o espaço livre ao redor do ponto

                // Prioriza pontos com menor fScore ou mais espaço livre em caso de empate
                if (fAtual < menorF || (fAtual == menorF && espaco > maiorEspaco)) {
                    menorF = fAtual;
                    maiorEspaco = espaco;
                    atual = p;
                }
            }

            // Se o ponto atual for o objetivo, reconstrói o caminho
            if (atual.equals(objetivo)) {
                return reconstruirCaminho(veioDe, atual);
            }

            // Remove o ponto atual do conjunto aberto
            aberto.remove(atual);

            // Para cada vizinho do ponto atual, verifica se ele é uma melhor opção de caminho
            for (Point vizinho : getVizinhos(atual)) {
                int tentGScore = gScore.getOrDefault(atual, Integer.MAX_VALUE) + 1; // Custo de mover para o vizinho
                if (tentGScore < gScore.getOrDefault(vizinho, Integer.MAX_VALUE)) {
                    // Atualiza a rota mais eficiente para o vizinho
                    veioDe.put(vizinho, atual);
                    gScore.put(vizinho, tentGScore);
                    fScore.put(vizinho, tentGScore + distanciaManhattan(vizinho, objetivo)); // Atualiza o fScore do vizinho
                    aberto.add(vizinho); // Adiciona o vizinho ao conjunto aberto
                }
            }
        }

        return null; // Se nenhum caminho foi encontrado, retorna null
    }

    /**
     * Calcula o número de células livres ao redor de um ponto específico.
     * Usada como critério adicional de escolha no algoritmo A*.
     * @param atual Ponto para o qual será calculado o espaço livre.
     * @return Número de células livres ao redor.
     */
    private int calculaEspacoLivre(Point atual) {
        int espacoLivre = 0;
        List<Point> vizinhos = getVizinhos(atual);
        for (Point vizinho : vizinhos) {
            if (jogo.isCelulaLivre(vizinho.x, vizinho.y)) {
                espacoLivre++; // Conta quantos vizinhos estão livres
            }
        }
        return espacoLivre;
    }

    /**
     * Retorna a lista de pontos vizinhos de um ponto, desde que esses pontos
     * estejam livres (não ocupados pela cobra ou pelas bordas do campo).
     * @param atual Ponto cujos vizinhos serão retornados.
     * @return Lista de pontos vizinhos livres.
     */
    private List<Point> getVizinhos(Point atual) {
        List<Point> vizinhos = new ArrayList<>();
        // Adiciona os vizinhos (Cima, Direita, Baixo, Esquerda) que estão livres
        if (jogo.isCelulaLivre(atual.x, atual.y - 1)) vizinhos.add(new Point(atual.x, atual.y - 1)); // Cima
        if (jogo.isCelulaLivre(atual.x + 1, atual.y)) vizinhos.add(new Point(atual.x + 1, atual.y)); // Direita
        if (jogo.isCelulaLivre(atual.x, atual.y + 1)) vizinhos.add(new Point(atual.x, atual.y + 1)); // Baixo
        if (jogo.isCelulaLivre(atual.x - 1, atual.y)) vizinhos.add(new Point(atual.x - 1, atual.y)); // Esquerda
        return vizinhos;
    }
}
