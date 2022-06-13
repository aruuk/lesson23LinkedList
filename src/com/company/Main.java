package com.company;

import Lesson.Cat;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
        //Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын. Башында 0дор жана аягында 1лер.

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(0,2));
        }
        Collections.sort(arrayList, sortingByAccendingOrder);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(0, 2));
        }
        Collections.sort(list, sortingByAccendingOrder);


        System.out.println("array list");
        arrayList.forEach(System.out::println);

        System.out.println("linked list");
        list.forEach(System.out::println);
    }

    public static Comparator<Integer> sortingByAccendingOrder = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    };




        //У ВСЕХ ОБЪЕКТОВ ДОЛЖЕН БЫТЬ ВОЗРАСТ.
        //Положите в LinkedList 50 кошек и собак.
        //Удалите каждую 5-кошку.
        //Через каждую 3-собаку добавьте
        //мышку.
        //Всех кошек которые находятся рядом с
        //мышами переместите в другой LinkedList
        //и удалите.
        //Переместите все объекты с LinkedListов в
        //новый ArrayList.
        //Найдите сумму возрастов всех
        //объектов.

        /*List<Animal> animalList = new LinkedList<>();

        List<Cat1> cat1List = new LinkedList<>();


        for (int i = 0; i <= 50; i++) {
            animalList.add(new Cat1(i));
            animalList.add(new Dog1(i));
        }

        int catCounter = 0;
        int dogCounter = 0;
        int mouseAge = 1;

        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i) instanceof Cat1){
                catCounter++;
            }
            if (catCounter == 5){
                animalList.remove(animalList.get(i));
                catCounter = 0;
            }
            if (animalList.get(i) instanceof Dog1){
                dogCounter++;
            }
            if (dogCounter == 3){
                animalList.add(i + 1, new Mouse1(mouseAge));
                dogCounter = 0;
            }
        }

        for (int i = 0; i < animalList.size(); i++) {
        if (animalList.get(i) instanceof Mouse1){
            if (animalList.get(i + 1) instanceof Cat1){
                cat1List.add((Cat1)animalList.get(i + 1));
                animalList.remove(animalList.get(i + 1));
            }
        }
        }
        animalList.forEach(System.out::println); */

        /*LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("lola0");
        linkedList.add("lola1");
        linkedList.add("lola2");
        linkedList.add(0,"lola4");
        linkedList.addFirst("lola3");
        linkedList.addLast("lola5");
        linkedList.add("lola6");
        linkedList.add("lola7");*/

        /*Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        } */

        /*for (String linkedLists : linkedList) {
            if (linkedLists.equals("lola2")) {
                System.out.println(linkedList);
            }
        }*/

}
