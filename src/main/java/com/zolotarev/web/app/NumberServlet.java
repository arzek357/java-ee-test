package com.zolotarev.web.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NumberServlet", urlPatterns = "/numberResult.html")
public class NumberServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(NumberServlet.class);

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        int number = Integer.parseInt(req.getParameter("number"));
        resp.setContentType("text/html");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table>");
        out.println("<style>");
        out.println("table { ");
        out.println("border-collapse:collapse;");
        out.println("border: 1px");
        out.println("}");
        out.println("table td { ");
        out.println("border:1px solid #000;");
        out.println("}");
        out.println("</style>");
        for (int i =1;i<=number;i++){
            out.println("<tr>");
            for (int j=1;j<=number;j++){
                out.println("<td>"+i+"-"+j+"</td>");
            }
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("<a href=\"index.jsp\">Index page</a>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
