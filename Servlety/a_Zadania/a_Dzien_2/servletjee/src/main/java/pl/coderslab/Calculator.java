package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/calculator")
public class Calculator extends HttpServlet {
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          calculator(request);
          response.sendRedirect(request.getContextPath() + "/square");
    }

    private void calculator(HttpServletRequest request) {
        int i = Integer.parseInt(request.getParameter("A"));
        int j = Integer.parseInt(request.getParameter("B"));
        int m = Integer.parseInt(request.getParameter("C"));
        int n = Integer.parseInt(request.getParameter("D"));

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        int k = i + j + m + n;

        HttpSession session = request.getSession();
        session.setAttribute("k", k);
        session.setAttribute("name", name);
        session.setAttribute("surname", surname);
    }
}
// int z = m * n;
// String output = String.format("Suma: %d\nMnozenie: %d", k, z);
// response.getWriter().println(output);

// String out = String.format("Name: %s\nSurname: %s", name, surname);
// response.getWriter().println(out);