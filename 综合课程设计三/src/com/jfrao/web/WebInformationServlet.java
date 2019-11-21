package com.jfrao.web;

import com.jfrao.domain.WebInformation;
import com.jfrao.service.WebInformationService;
import com.sun.xml.bind.v2.model.core.ID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/WebInformationServlet")
public class WebInformationServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id = Integer.parseInt(req.getParameter("id"));
        WebInformationService webInformationService = new WebInformationService();
        List<WebInformation> information = webInformationService.findInformation(id);
        System.out.println(information);

        req.setAttribute("information",information);
        req.getRequestDispatcher("/title.jsp").forward(req,resp);

    }
}
