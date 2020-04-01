package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet242")
public class Servlet242 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try {
            Cookie cookies[] = request.getCookies();


            String products[] = {
                    "Asus Transformr;2999.99",
                    "iPhone 6';3499.18",
                    "Converse Sneakers;125.00",
                    "LG OLED55B6P OLED TV;6493.91",
                    "Samsung HT-J4100;800.99",
                    "Alpine Swiss Dress Belt;99.08",
                    "60 Watt LED;1.50",
                    "Arduino Nano;3.26",
            };

            for (Cookie c : cookies) {
                if (c.getName().equals("id")) {
                    PrintWriter out = response.getWriter();
                    out.println(products[(Integer.parseInt(c.getValue()))]);
                }

            }
        } catch (IndexOutOfBoundsException e) {
            PrintWriter out = response.getWriter();
            out.println("Product not found");
        }
    }
}

