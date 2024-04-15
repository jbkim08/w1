package org.zerock.w1.calc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//localhost:8080/calc/makeResult
@WebServlet(name = "calcController", urlPatterns = "/calc/makeResult")
public class CalcController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //파라미터를 받기
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");

        System.out.println("num1:" +  num1);
        System.out.println("num2:" +  num2);
        //새로 기본페이지(/)로 요청한다.
        resp.sendRedirect("/");
    }
}
