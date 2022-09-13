package List;

import java.util.LinkedList;

public class AdjacencyList {
    LinkedList[] parentList;

    public AdjacencyList(int listSize) {
        parentList = new LinkedList[listSize];
        for (int i = 0; i < parentList.length; i++) {
            parentList[i] = new LinkedList<>();
            parentList[i].add(i);
        }
    }

    public AdjacencyList() {
    }

    public void insert(int i, int value) {
        for (int ind = 0; i < parentList.length; i++) {
            if (parentList[ind].getFirst().equals(i)) {
                parentList[i].add(value);
            }
        }
    }

    public void printEndVertex() {
        for (int i = 0; i < parentList.length; i++) {
            if (parentList[i].size() == 1) {
                System.out.println(parentList[i]);
            }
        }
    }

    private void showList(LinkedList parentList) {
        for (int i = 1; i < parentList.size(); i++) {
            System.out.print(this.parentList[i].getFirst() + " -> \n");
        }
    }

    public String toString() {
        for (int i = 0; i < parentList.length; i++) {
            System.out.print(parentList[i].getFirst() + " -> ");
            showList(parentList[i]);
        }
        return "";
    }


}
