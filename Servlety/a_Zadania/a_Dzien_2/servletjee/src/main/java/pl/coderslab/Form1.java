package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form1")
public class Form1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String[] checkBox = request.getParameterValues("checkBox");

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<center>Your choice: <br>");
        for (int i = 0; i < checkBox.length; i++) {
            printWriter.println("- " + checkBox[i] + "<br>");
        }
    }
}
