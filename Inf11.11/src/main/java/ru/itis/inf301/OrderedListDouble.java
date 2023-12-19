package ru.itis.inf301;

import java.util.Scanner;

public class OrderedListDouble {
    NodeX head;


    public static void main(String[] args) {
        OrderedListDouble ol = new OrderedListDouble();
        ol.input();
        ol.sort();
        ol.output();
    }
    public void swap(NodeX e1, NodeX e2) {
        // Ищем элемент перед e1
        if (e1 != head) {
            NodeX current = head;
            while (current.next != e1) {
                current = current.next;
            }
            current.next = e2;
        } else {
            head = e2;
        }
        e2.prev = e1.prev;
        e1.next = e2.next;
        if (e1.next != null) e1.next.prev = e1;
        e1.prev = e2;
        e2.next = e1;
    }
    public void add(NodeX n){
        if (head == null){
            head = n;
        }
        else{
            NodeX current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = n;
            current.next.prev = current;
        }
    }
    public void input() {
        Scanner in = new Scanner(System.in);
        while(true) {
            NodeX n = new NodeX();
            if (in.hasNextInt()) {
                n.value = in.nextInt();
            } else {
                return;
            }
            add(n);
        }
    }
    public void output() {
        NodeX current = head;
        while (current != null) {
            if (current.prev == null) System.out.println("Первый элемент(текущий): "+current.value+" Следующий: "+current.next.value);
            else if (current.next == null) System.out.println("Предыдущий: "+current.prev.value+" Последний элемент(текущий): "+current.value);
            else System.out.println("Предыдущий: "+current.prev.value+" Текущий: "+current.value+" Следующий: "+current.next.value);
            current = current.next;
        }
    }
    public void sort(){
        NodeX current = head;
        while(current.next != null){
            if (compare(current, current.next)>0){
                swap(current, current.next);
                current = head;
            } else {
                current = current.next;
            }
        }
    }

    public int compare(NodeX e1, NodeX e2) {
        return e1.value - e2.value;
    }
}
