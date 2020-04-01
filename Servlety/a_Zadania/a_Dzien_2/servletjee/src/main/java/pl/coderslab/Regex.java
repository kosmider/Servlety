package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/regex")
public class Regex extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        String file = req.getParameter("file");
        final String PATTERN = "[a-z]+\\.((gif)|(jpg)|(png))";

        if (file.matches(PATTERN)){
            resp.getWriter().println("<a href='https://www.google.pl/#q=" + file + "'>Przejdź do pliku</a>");
        } else {
            resp.getWriter().println("Niepoprawna nazwa");
        }
    }
}