package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Square", urlPatterns = {"/square"})

public class Square extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        int k = (int)session.getAttribute("k");
        String name = (String)session.getAttribute("name");
        String surname = (String)session.getAttribute("surname");

        //int k = Integer.parseInt(request.getParameter("k"));
        k = k * k;

        PrintWriter out = response.getWriter();
        out.println("Result: " + k + "\n" +
                "Name: " + name + "\n" + "Surname: " + surname);
    }
}
