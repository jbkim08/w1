package org.zerock.w1.todo.dto;

import java.time.LocalDate;

//데이터 전달을 위한 dto 객체 java beans
public class TodoDTO {
    private Long tno;          //할일 번호
    private String title;      //할일 제목
    private LocalDate dueDate; //날짜
    private boolean finished;  //완료됨? 참 or 거짓

    public Long getTno() {
        return tno;
    }

    public void setTno(Long tno) {
        this.tno = tno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "TodoDTO{" +
                "tno=" + tno +
                ", title='" + title + '\'' +
                ", dueDate=" + dueDate +
                ", finished=" + finished +
                '}';
    }
}
