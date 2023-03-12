package homework;

public class MaxElementInArray {
    /*
    Создать класс MaxElementInArray, содержащий метод, который находит максимальный элемент массива и возвращает его:

создать класс MaxElementInArray, содержащую имя массива (private int[] ints)
Создать конструктор , принимающий массив public MaxElementInArray( int[] ints ){ this.ints = ints;}
Написать метод, находящий максимальный элемент массива
В классе Main: создать массив целых чисел, cоздать обьект (экземпляр) класса MaxElementInArray для этого массива и
вывести на экран значение максимального элемента этого массива
     */

    public int[] ints;

    MaxElementInArray(int[] ints) {
        this.ints = ints;
    }

    public void result() {
        int res = 0;
        int lenght = this.ints.length;
        for (int i = 0; i < lenght; i++) {
            if (res < ints[i]) {
                res = ints[i];
            }
        }
        System.out.println("The max value of array is: "+res);
    }

}
