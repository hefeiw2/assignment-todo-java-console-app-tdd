package com.tw.cn.cap.gtb.todo;

import java.nio.file.Path;

public class Constants {
    public static final String USER_HOME = System.getProperty("user.home");
    public static final String TODO_CONFIG_ROOT = ".todo";
    public static final String TASKS_FILENAME = "tasks";
    public static final Path TASKS_FILE_PATH = Path.of(USER_HOME, TODO_CONFIG_ROOT, TASKS_FILENAME);
}