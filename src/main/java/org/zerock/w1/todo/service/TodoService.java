package org.zerock.w1.todo.service;

import org.zerock.w1.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// CRUD 할일 목록 조회,할일 하나 조회, 할일 등록
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

    //할일 한개 가져오기
    public TodoDTO get(Long tno){
        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("샘플 할일");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);

        return dto;
    }

}
