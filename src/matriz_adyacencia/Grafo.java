package matriz_adyacencia;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Grafo {
    private int vertices =  7;
    private int[][] matriz = new int[vertices][vertices];
    private String[] nombre = {"Nodo A", "Nodo B", "Nodo C", "Nodo D", "Nodo E", "Nodo F", "Nodo G"};


    public void agarco(int i, int j){
        matriz[i][j] = 1;
        matriz[j][i] = 1;
    }

    public void bfs(int inicio) {
        boolean[] visit = new boolean[vertices];
        Queue<Integer> cola = new LinkedList<>();
        visit[inicio] = true;
        cola.add(inicio);

        while (!cola.isEmpty()){
            int actual = cola.poll();
            System.out.println(nombre[actual] + " ");

            for (int i = 0; i < vertices; i++) {
                if (matriz[actual][i] == 1 && !visit[i]){
                    visit[i] = true;
                    cola.add(i);
                }
            }
        }
        System.out.println();
    }
    public void dfs (int inicio){
        boolean [] visitados = new boolean[vertices];
        Stack<Integer> pila = new Stack<>();
        pila.push(inicio);

        while (!pila.isEmpty()){
            int actual = pila.pop();
            for (int i = 0; i < vertices; i++) {
                if (!visitados[actual]){
                    visitados[actual] = true;
                    System.out.println(nombre[actual] + " ");
                }
            }
            for (int i = vertices - 1; i >= 0 ; i--) {
                if (matriz[actual][i] == 1 && !visitados[i]){
                    pila.push(i);
                }
            }
        }
        System.out.println();
    }
}
