package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

public class ListCommand {
    static List<String> run() {
        final List<Task> tasks = TaskRepository.loadTasks();
        final List<String> result = new ArrayList<>();
        result.addAll(Section.format(tasks, Section.tbd()));
        result.addAll(Section.format(tasks, Section.completed()));
        return result;
    }
}