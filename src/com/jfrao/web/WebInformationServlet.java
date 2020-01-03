package com.jfrao.web;

import com.jfrao.domain.PageList;
import com.jfrao.domain.WebInformation;
import com.jfrao.service.WebInformationService;
import com.sun.xml.bind.v2.model.core.ID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/WebInformationServlet")
public class WebInformationServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id = Integer.parseInt(req.getParameter("id"));
        Integer page;
        String Page = req.getParameter("page");
        WebInformationService webInformationService = new WebInformationService();
        if (Page == null){
            page = 1;
        }else{
            page = Integer.parseInt(Page);
        }
        PageList pageLists = webInformationService.GetPageList(page, id);
        Long sum = webInformationService.getSum(id);
        req.setAttribute("type", webInformationService.GetType(id));
        req.setAttribute("information", pageLists);
        req.setAttribute("sum", sum);
        req.setAttribute("id", id);
        req.getRequestDispatcher("/title.jsp").forward(req,resp);

    }
}
