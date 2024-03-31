package lr3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class CollectionTime {
    public static void main(String[] args) {
        int collectionSize = 3000000; // Количество элементов в коллекции
        long indexAccessCount = 3000000000L; // Количество элементов для вычисления скорости получения по индексу

        // Создание коллекций
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Измерение времени выполнения операций добавления
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            arrayDeque.addFirst(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время добавления в начало ArrayDeque: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            linkedHashSet.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время добавления в LinkedHashSet: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            arrayList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время добавления в ArrayList: " + (endTime - startTime) + " мс");

        // Измерение времени выполнения операций добавления в середину
        startTime = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            arrayDeque.add(arrayDeque.size() / 2);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время добавления в середину ArrayDeque: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        int halfSize = linkedHashSet.size() / 2;
        for (int i = 0; i < collectionSize; i++) {
            linkedHashSet.add(halfSize + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время добавления в середину LinkedHashSet: " + (endTime - startTime) + " мс");
// Выполняется очень долго!!!!!
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < collectionSize; i++) {
//            arrayList.add(arrayList.size() / 2, i);
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("Время добавления в середину ArrayList: " + (endTime - startTime) + " мс");

        // Измерение времени выполнения операций добавления в конец
        startTime = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            arrayDeque.addLast(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время добавления в конец ArrayDeque: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            linkedHashSet.add(i + collectionSize);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время добавления в конец LinkedHashSet: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < collectionSize; i++) {
            arrayList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время добавления в конец ArrayList: " + (endTime - startTime) + " мс");

        // Измерение времени выполнения операций удаления
        startTime = System.currentTimeMillis();
        if (!arrayDeque.isEmpty()) {
            arrayDeque.removeFirst();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время удаления из начала ArrayDeque: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        if (!linkedHashSet.isEmpty()) {
            linkedHashSet.remove(linkedHashSet.iterator().next());
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время удаления из LinkedHashSet: " + (endTime - startTime) + " мс");

//        // Удаление из начала ArrayList ОЧЕНЬ ДОЛГО
//        startTime = System.currentTimeMillis();
//        while (!arrayList.isEmpty()) {
//            arrayList.removeFirst();
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("Время удаления из начала ArrayList: " + (endTime - startTime) + " мс");

        // Измерение времени выполнения операций удаления из середины
        startTime = System.currentTimeMillis();
        if (!arrayDeque.isEmpty()) {
            arrayDeque.remove(arrayDeque.size() / 2);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время удаления из середины ArrayDeque: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        halfSize = linkedHashSet.size() / 2;
        if (halfSize > 0) {
            linkedHashSet.remove(halfSize);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время удаления из середины LinkedHashSet: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() / 2);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время удаления из середины ArrayList: " + (endTime - startTime) + " мс");

        // Измерение времени выполнения операций удаления из конца
        startTime = System.currentTimeMillis();
        if (!arrayDeque.isEmpty()) {
            arrayDeque.removeLast();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время удаления из конца ArrayDeque: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        if (!linkedHashSet.isEmpty()) {
            linkedHashSet.remove(linkedHashSet.size() - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время удаления из конца LinkedHashSet: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время удаления из конца ArrayList: " + (endTime - startTime) + " мс");

        // Измерение времени выполнения операций получения элемента по индексу
        startTime = System.currentTimeMillis();
        for (long i = 0; i < indexAccessCount; i++) {
            if (!arrayDeque.isEmpty()) {
                arrayDeque.getFirst(); // Получаем первый элемент
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время получения элемента по индексу из ArrayDeque: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        for (long i = 0; i < indexAccessCount; i++) {
            Object[] linkedHashSetArray = linkedHashSet.toArray();
            if (linkedHashSetArray.length > 0) {
                Object o = linkedHashSetArray[0];// Получаем элемент из LinkedHashSet
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время получения элемента по индексу из LinkedHashSet: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        for (long i = 0; i < indexAccessCount; i++) {
            if (!arrayList.isEmpty()) {
                arrayList.get((int) (i % collectionSize)); // Получаем элемент по индексу
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время получения элемента по индексу из ArrayList: " + (endTime - startTime) + " мс");
    }
}