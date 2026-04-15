package lista_adyacencia;

import java.util.*;

public class Grafo {
    private int num_vertices;
    private LinkedList<arista> vertices[];

    public Grafo(int num_vertices) {
        this.num_vertices = num_vertices;
        vertices =  new LinkedList[num_vertices];
        for (int i = 0; i < num_vertices; i++) {
            vertices[i]= new LinkedList<>();
        }
     }
    public void agregar(char origen, char destino, int peso){
        int indice = origen - 'A';


        if (indice >= 0 && indice < num_vertices) {
            arista nuevaar = new arista(destino, peso);
            vertices[indice].add(nuevaar);
        } else {
            System.out.println("Error: El vértice " + origen + " está fuera de rango.");
        }
    }
     public void imprimir(){
         for (int i = 0; i < num_vertices; i++) {
             char nombre = (char)(i+'A');
             System.out.println("Vertice "+ nombre +" tiene arcos hacia: ");
             for (arista ar : vertices[i]){
                 System.out.println(ar.getDest() + ", El peso es: "+ar.getPeso());
             }
             System.out.println();

     }
     }
     public void bfs(char inicio){
        boolean [] vist = new boolean[num_vertices];

        Queue<Character> cola = new LinkedList<>();
        int indice = inicio - 'A';
        vist[indice] = true;
        cola.add(inicio);

         System.out.println("Nodo inicial "+ indice);

         while (!cola.isEmpty()){
             char actual = cola.poll();
             System.out.println("Nodo actual "+ actual);
             int act = actual - 'A';
             for (arista ar : vertices[act]){
                 char destino = ar.getDest();
                 int indicedestino = destino - 'A';


                 if (!vist[indicedestino]) {
                     vist[indicedestino] = true;
                     cola.add(destino);
                 }
             }
         }
         System.out.println();
     }

     public void dfs(char inicio){
         boolean [] visit = new boolean[num_vertices];

         Stack<Character> pila = new Stack<>();
         pila.push(inicio);

         System.out.println("Nodo inicial "+ inicio);

         while (!pila.isEmpty()){
             char actual = pila.pop();
             int act = actual - 'A';

             if (!visit[act]){
                 visit[act] = true;
                 System.out.println(actual + " ");
             }
             for (arista ar : vertices[act]){
                 char destino = ar.getDest();
                 int indicedestino = destino - 'A';


                 if (!visit[indicedestino]) {
                    pila.push(destino);
                 }
             }
         }
         System.out.println();
     }


}