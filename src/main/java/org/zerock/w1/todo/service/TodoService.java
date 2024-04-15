package org.zerock.w1.todo.service;

import org.zerock.w1.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
    //싱글턴 패턴으로 하나의 객체만을 만듬
    INSTANCE;

    public void register(TodoDTO todoDTO){
        System.out.println("DEBUG......" + todoDTO);
    }

    public List<TodoDTO> getList() {
        //테스트 할일 10개 만들기
        List<TodoDTO> todoDTOS = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            TodoDTO dto = new TodoDTO();
            dto.setTno((long)i);
            dto.setTitle("Todo.." + i);
            dto.setDueDate(LocalDate.now());

            todoDTOS.add(dto);
        }

        return todoDTOS;
    }
}
