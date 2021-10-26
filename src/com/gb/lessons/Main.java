package com.gb.lessons;

import fruits.Apple;
import fruits.Box;
import fruits.Orange;
import students.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // ----------------- 1-Я ЗАДАЧА -------------------------
	    /*String[] arrayString = {"Alex", "Sam", "Jerry" , "Tom", "Kate"};
        System.out.println(Arrays.toString(arrayString));
        System.out.println(Arrays.toString(swapElements(0, 2, arrayString)));

        //SwapElemsInArray swapElemsInArray = new SwapElemsInArray();
        //System.out.println(Arrays.toString(swapElemsInArray.swapElements(0, 2, arrayString)));

        Student[] arrayStudents = {
                new Student("Kate", 2),
                new Student("Nik", 1),
                new Student("Julia", 3),
        };

        System.out.println(Arrays.toString(arrayStudents));
        System.out.println(Arrays.toString(swapElements(0, 1, arrayStudents)));*/

        // ----------------- 2-Я ЗАДАЧА -------------------------

        /*String[] arrayString = {"Alex", "Sam", "Jerry" , "Tom", "Kate"};
        List<String> stringList = arrayToList(arrayString);
        System.out.println(stringList);

        Student[] arrayStudents = {
                new Student("Kate", 2),
                new Student("Nik", 1),
                new Student("Julia", 3),
        };

        List<Student> studentList = arrayToList(arrayStudents);
        System.out.println(studentList);*/

        // ----------------- 3-Я ЗАДАЧА -------------------------

        Apple apple1 = new Apple(1.0f, 5);
        Apple apple2 = new Apple(2.0f, 3);
        Orange orange1 = new Orange(1.5f, 5);
        Orange orange2 = new Orange(1.3f, 7);

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));

        Box<Apple> appleBox2 = new Box<>();
        appleBox.replaceFruitsToAnotherBox(appleBox2);

        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());
    }

    public static <T> T[] swapElements(int indexFstElem, int indexSecElems, T[] arr) {
        T temp = arr[indexFstElem];
        arr[indexFstElem] = arr[indexSecElems];
        arr[indexSecElems] = temp;

        return arr;
    }

    public static <T> List<T> arrayToList(T[] arr) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        return list;
    }
}
