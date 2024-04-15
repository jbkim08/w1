package org.zerock.w1.calc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//localhost:8080/calc/input
@WebServlet(name = "inputController", urlPatterns = "/calc/input")
public class InputController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("InputController Do get 메소드");
        //JSP 로 화면을 표시한다.

        RequestDispatcher dispatcher =
                req.getRequestDispatcher("/WEB-INF/calc/input.jsp");

        //forward는 리퀘스트 객체를 전달하면서 jsp 페이지 이동
        dispatcher.forward(req,resp);

    }
}
