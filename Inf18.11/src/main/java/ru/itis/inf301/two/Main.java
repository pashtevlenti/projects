package ru.itis.inf301.two;


public class Main {
    public static void main(String[] args){
        SortAlg alg = new BubbleSort();
        Node[] nodes = new Node[5];
        nodes[0] = new Node(5);
        nodes[1] = new Node(0);
        nodes[2] = new Node(-1);
        nodes[3] = new Node(2);
        nodes[4] = new Node(10);

        for(Node n: nodes){
            System.out.println(n);
        }
        System.out.println();
        alg.order(nodes);
        for(Node n: nodes){
            System.out.println(n);
        }
    }
}
