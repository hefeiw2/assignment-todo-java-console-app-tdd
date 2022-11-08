package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SectionTest {
    @Test
    void should_show_hint_message_when_no_tasks() {
        final var result = Section.format(Collections.emptyList(),Section.tbd());
        Assertions.assertEquals(List.of("# To be done","Empty"), result);
    }
}