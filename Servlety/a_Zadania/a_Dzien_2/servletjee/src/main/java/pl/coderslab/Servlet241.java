package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet241")
public class Servlet241 extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");


        int id = Integer.parseInt(request.getParameter("id"));

        Cookie cookie = new Cookie("id", id + "");
        response.addCookie(cookie);

        response.sendRedirect(request.getContextPath()+ "/servlet242");
        /*
        PrintWriter out = response.getWriter();
        out.println(id);
*/
      //  RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlet242");
       // requestDispatcher.forward(request, response);


    }
}
