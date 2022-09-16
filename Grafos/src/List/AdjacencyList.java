package List;

import java.util.LinkedList;

public class AdjacencyList {
    private LinkedList<Integer>[] adjacencyList;

    public AdjacencyList(int listSize) {
        adjacencyList = new LinkedList[listSize];
        for (int i = 0; i < adjacencyList.length; i++) {
            adjacencyList[i] = new LinkedList<>();
            adjacencyList[i].add(i);
        }
    }

    public AdjacencyList() {
    }

    public void insert(int i, int value) {
        for (int ind = 0; i < adjacencyList.length; i++) {
            if (adjacencyList[ind].getFirst().equals(i)) {
                adjacencyList[i].add(value);
            }
        }
    }

    public void insertEdges(int value, int i) {
        for (LinkedList list : adjacencyList) {
            if (list.getFirst().equals(i)) {
                list.add(value);
                adjacencyList[value].add(i);
            }
        }
    }

    public void endVertexes() {
        for (int i = 0; i < adjacencyList.length; i++) {
            if (adjacencyList[i].size() == 1) {
                System.out.print(adjacencyList[i] + " ");
            }
        }
    }

    public void isolatedVertexes() {
        for (LinkedList list : adjacencyList) {
            if ((list.size()-1) == 1) {
                System.out.print(list.getFirst()+ " ");
            }
        }
    }

    public void vertexesEntryDegree() {
        for (LinkedList list : adjacencyList) {
            System.out.println(list.getFirst() + " = " + (list.size()-1));
        }
    }

    private void showList(LinkedList parentList) {
        for (int i = 1; i < parentList.size(); i++) {
            System.out.print(this.adjacencyList[i].getFirst() + " -> \n");
        }
    }

    public String toString() {
        for (int i = 0; i < adjacencyList.length; i++) {
            System.out.print(adjacencyList[i].getFirst() + " -> ");
            showList(adjacencyList[i]);
        }
        return "";
    }


}
