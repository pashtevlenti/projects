package ru.itis.inf301.Pizza;

public class NextNumbers implements Numbers{
    private Node current;

    public NextNumbers() {
        Node root = new Node(1);
        this.current = root;

        for (int i = 2; i <= 10; ++i){
            current.next = new Node(i);
            current = current.next;
        }
        current.next = root;
    }

    @Override
    public int next() {
        current = current.next;
        int result = current.value;
        return result;
    }


}
