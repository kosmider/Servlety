package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/cored")
public class Cored extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();

        for(Cookie c : cookies) {
            if (c.getName().equals("name") || c.getName().equals("surname") || c.getName().equals("age")) {
                PrintWriter out = response.getWriter();
                out.println(c.getValue());
            }
        }
    }
}
