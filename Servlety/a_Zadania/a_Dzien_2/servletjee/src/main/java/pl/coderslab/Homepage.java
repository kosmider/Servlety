package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/homepage")
public class Homepage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        String accept = req.getParameter("accept");

        if (accept != null) {
            Cookie c = new Cookie("accept", accept);
            c.setMaxAge(60 * 60 * 24);
            c.setPath("/");
            resp.addCookie(c);
            req.setAttribute("accept", accept);
            getServletContext().getRequestDispatcher("/homepage.jsp").forward(req, resp);
        } else {
            getServletContext().getRequestDispatcher("/homepage.jsp").forward(req, resp);
        }
    }
}