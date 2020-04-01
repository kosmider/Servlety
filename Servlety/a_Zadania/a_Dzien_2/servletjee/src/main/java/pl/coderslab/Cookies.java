package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookies")
public class Cookies extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            int age = Integer.parseInt(request.getParameter("age"));

            Cookie cookie = new Cookie("name", name);
            Cookie cookie1 = new Cookie("surname", surname);
            Cookie cookie2 = new Cookie("age", age + "");

            response.addCookie(cookie);
            response.addCookie(cookie1);
            response.addCookie(cookie2);

            response.sendRedirect(request.getContextPath() + "/cored");
    }
}
