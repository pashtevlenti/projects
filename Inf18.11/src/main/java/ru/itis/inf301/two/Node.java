package ru.itis.inf301.two;

public class Node implements Comparable{
    public int value;
    @Override
    public int compareTo(Comparable c){
        return this.value - ((Node) c).value;
    }

    public Node(int value) {
        this.value = value;
    }
    public String toString(){
        return String.valueOf(value);
    }
}
