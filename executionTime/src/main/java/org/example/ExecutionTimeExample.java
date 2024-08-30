package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExecutionTimeExample {

    public static void main(String[] args) {
        // Tamanho da lista para testes
        int listSize = 100000;

        // Testes com LinkedList
        List<String> linkedList = new LinkedList<>();
        System.out.println("LinkedList Operations:");
        measureExecutionTime("Insert at Beginning", () -> insertAtBeginning(linkedList, listSize));
        measureExecutionTime("Insert at Middle", () -> insertAtMiddle(linkedList, listSize));
        measureExecutionTime("Insert at End", () -> insertAtEnd(linkedList, listSize));
        measureExecutionTime("Access Elements", () -> accessElements(linkedList));

        System.out.println("\n-----------------------------------------------------\n");

        // Testes com ArrayList
        List<String> arrayList = new ArrayList<>();
        System.out.println("ArrayList Operations:");
        measureExecutionTime("Insert at Beginning", () -> insertAtBeginning(arrayList, listSize));
        measureExecutionTime("Insert at Middle", () -> insertAtMiddle(arrayList, listSize));
        measureExecutionTime("Insert at End", () -> insertAtEnd(arrayList, listSize));
        measureExecutionTime("Access Elements", () -> accessElements(arrayList));
    }

    // Método para medir o tempo de execução de um método como Runnable
    private static void measureExecutionTime(String operation, Runnable method) {
        long startTime = System.nanoTime();

        method.run();

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime; // Calcula o tempo de execução em nanossegundos

        System.out.println(operation + ": " + timeElapsed / 1_000_000 + " ms");
    }

    // Inserir elementos no início da lista
    private static void insertAtBeginning(List<String> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(0, "Element " + i); // Inserir no início
        }
    }

    // Inserir elementos no meio da lista
    private static void insertAtMiddle(List<String> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(list.size() / 2, "Element " + i); // Inserir no meio
        }
    }

    // Inserir elementos no final da lista
    private static void insertAtEnd(List<String> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add("Element " + i); // Inserir no final
        }
    }

    // Acessar todos os elementos da lista
    private static void accessElements(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i); // Acessar o elemento
        }
    }
}
