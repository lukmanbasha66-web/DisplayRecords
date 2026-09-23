package org.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {












    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Student Records</title>");
        out.println("</head>");

        out.println("<body>");

        out.println("<h1>Student Records</h1>");

        out.println("<table border='1' cellpadding='10'>");

        out.println("<tr>");
        out.println("<th>ID</th>");
        out.println("<th>Name</th>");
        out.println("<th>Course</th>");
        out.println("<th>Marks</th>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>101</td>");
        out.println("<td>Rahul</td>");
        out.println("<td>CSE</td>");
        out.println("<td>85</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>102</td>");
        out.println("<td>Anil</td>");
        out.println("<td>ECE</td>");
        out.println("<td>78</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>103</td>");
        out.println("<td>Priya</td>");
        out.println("<td>CSE</td>");
        out.println("<td>92</td>");
        out.println("</tr>");

        out.println("</table>");

        out.println("</body>");
        out.println("</html>");
    }
}