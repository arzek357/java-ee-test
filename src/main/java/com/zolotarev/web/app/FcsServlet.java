package com.zolotarev.web.app;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FcsServlet", urlPatterns = "/fcsResults.html")
public class FcsServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
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
        out.println("<tr>");
        out.println("<td>FCS</td>");
        out.println("<td>"+req.getParameter("first_name")+" "+req.getParameter("second_name")+" "+req.getParameter("middle_name")+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Date of birthday</td>");
        out.println("<td>"+req.getParameter("date_of_birthday")+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>City</td>");
        out.println("<td>"+req.getParameter("city")+"</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("<a href=\"index.jsp\">Index page</a>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
