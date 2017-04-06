package com.sdajava.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Task> tasks = getTasks();
        List<String> titles = taskTitles(tasks);
        for (String title : titles) {
            System.out.println(title);
            //lub
        //titles.forEach(System.out::println);
        }
    }

    public static List<Task> getTasks() {

        /*List<Task> list = new ArrayList<>();

        list.add(new Task("1", "title1", TaskType.READING));

        return list;*/

        //lub

        Task task1 = new Task("1", "title1", TaskType.READING);
        Task task2 = new Task("2", "title2", TaskType.READING);
        Task task3 = new Task("3", "title3", TaskType.READING);

        return Stream.of(task1, task2, task3).collect(Collectors.toList());
    }

    public static List<String> taskTitles(List<Task> tasks){
        List<String> readingTitles = new ArrayList<>();
        for (Task task : tasks){
            if (task.getType() == TaskType.READING){
                readingTitles.add(task.getTitle());
            }
        }
        return readingTitles;
    }
}