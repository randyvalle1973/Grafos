package lista_adyacencia;

public class main {
    public static void main(String[] args) {
        int cantidadver = 6;
        Grafo g = new Grafo(cantidadver);
        g.agregar('A', 'B', 20);
        g.agregar('A', 'D', 50);
        g.agregar('B', 'C', 10);
        g.agregar('C', 'A', 25);
        g.agregar('C', 'F', 45);
        g.agregar('F', 'A', 30);
        g.agregar('F', 'D', 25);
        g.agregar('D', 'C', 30);
        g.agregar('D', 'E', 10);
        g.agregar('E', 'F', 5);
//        g.bfs('A');
        g.dfs('A');
    }
}
