package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/get4")
public class Get4 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int width = Integer.parseInt(request.getParameter("width"));
        int height = Integer.parseInt(request.getParameter("height"));

        if (width == 0 && height == 0) {
            width = 4;
            height = 5;
        }
        int result;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                result = i * j;

                PrintWriter writer = response.getWriter();
                writer.print(i + "*" + j + "=" + result + "\t");
                if(j == width) {
                    writer.println();
                }
            }
        }
    }
}
