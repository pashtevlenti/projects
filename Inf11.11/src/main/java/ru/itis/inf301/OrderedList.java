package ru.itis.inf301;

import java.util.Scanner;

/**
 * 1. Фиксируем "голову" списка
 * 2. Ввод данных
 * 3. Сортировка пузырьком
 *      3.1 Сравнение элементов
 *      3.2 Перестановка соседних элементов
 *
 * 4. Вывод отсортированных элементов (значений)
 */
public class OrderedList {
    NodeX head;

    public static void main(String[] args) {
        OrderedList ol = new OrderedList();
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
        e1.next = e2.next;
        e2.next = e1;
    }
    public void add(NodeX n) {
        if (head == null) {
            head = n;
        } else {
            NodeX current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
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
            System.out.println(current.value);
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
