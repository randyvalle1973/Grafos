package matriz_adyacencia;

public class main {
    public static void main(String[] args) {
        Grafo g = new Grafo();

        g.agarco(0, 1);
        g.agarco(0, 2);
        g.agarco(0, 3);
        g.agarco(1, 2);
        g.agarco(1, 4);
        g.agarco(1, 6);
        g.agarco(2, 3);
        g.agarco(2, 5);
        g.agarco(3, 6);
        g.agarco(4, 5);
        g.agarco(4, 6);
        g.agarco(5, 6);

        g.bfs(0);
        g.dfs(0);
    }
}
