package com.tw.cn.cap.gtb.todo;

public class TaskFactory {
    static Task createTask(int id, String line) {
        final var fields = line.split(" ", 2);
        final var name = fields[1];
        final var isCompleted = "x".equals(fields[0]);
        return new Task(id, name, isCompleted);
    }
}