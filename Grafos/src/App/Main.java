package App;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import List.AdjacencyList;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIS = new FileInputStream("Grafos/src/pequenoG.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fileIS));
        AdjacencyList adjacencyList = new AdjacencyList();
        int vertices = 0;
        int edges = 0;
        String fileLine;
        System.out.println("======================== Arquivo/Grafo ========================");
        int i = 0;
        while((fileLine = br.readLine()) != null) { // lê todas as linhas do txt
            System.out.println(fileLine);
            if (i == 0) {
                vertices = Integer.parseInt(fileLine);
                adjacencyList = new AdjacencyList(vertices);
                i++;
            } else if (i == 1) {
                edges = Integer.parseInt(fileLine);
                i++;
            } else {
                String[] values;
                values = fileLine.split(" ");
                adjacencyList.insert(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
            }
        }
        System.out.println("===============================================================");
        fileIS.close();
        System.out.print("Lista de adjacência: ");
        System.out.println(adjacencyList);
        System.out.print("Tamanho: " + edges + "\n");
        System.out.print("Ordem: " + vertices + "\n");
        System.out.print("Grau de entrada dos vértices: "); adjacencyList.vertexesEntryDegree();
        System.out.println();
        System.out.print("Vértices isolados: "); adjacencyList.isolatedVertexes();
        System.out.println();
        System.out.print("Vértices de extremidade: "); adjacencyList.endVertexes();
    }
}
