package com.jfrao.web;

import com.jfrao.service.FlushService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FlushServlet")
public class FlushServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        FlushService flushService = new FlushService();
        flushService.flush();
        req.getRequestDispatcher("/index.jsp").forward(req,resp);

    }
}
