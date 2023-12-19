package ru.itis.inf301.two;

public class BubbleSort implements SortAlg{
    public void order(Comparable[] array){
        for (int i = 0; i<array.length; ++i){
            for (int j = 0; j<array.length - i - 1; ++j){
                if (array[j].compareTo(array[j+1])>0){
                    Comparable tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }

    }
}
