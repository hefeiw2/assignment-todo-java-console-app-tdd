package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    static List<Task> loadTasks() {
        final List<String> lines = readTaskLines();
        final List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            final var id = i + 1;
            final var line = lines.get(i);
            final Task task = TaskFactory.createTask(id, line);
            tasks.add(task);
        }
        return tasks;
    }

    static List<String> readTaskLines() {
        try {
            final List<String> lines;
            lines = Files.readAllLines(Constants.TASKS_FILE_PATH);
            return lines;
        } catch (IOException e) {
            throw new TodoCannotReadFileException();
        }
    }
}