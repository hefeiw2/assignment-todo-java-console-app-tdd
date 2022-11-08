package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

public record Section(String title, boolean flag) {
    static List<String> format(List<Task> tasks, Section section) {
        final List<String> result = new ArrayList<>();
        result.add(section.title());
        tasks.stream()
                .filter(task -> section.flag() == task.isCompleted())
                .map(Task::format)
                .forEach(result::add);
        if (result.size()==1){
            result.add("Empty");
        }
        return result;
    }

    static Section completed() {
        return new Section("# Completed", true);
    }

    static Section tbd() {
        return new Section("# To be done", false);
    }
}