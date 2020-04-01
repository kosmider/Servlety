package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

@WebServlet("/servlet25")
public class Servlet25 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        ArrayList random;
        random = randomNumbers();
        PrintWriter out = response.getWriter();
        out.println("Lista pseudolosowa: " + random);
        Collections.sort(random);

        PrintWriter sout = response.getWriter();
        sout.println("<h4>Lista posortowana: " + random + "</h4>");
    }

    private static ArrayList randomNumbers() {
        ArrayList list = new ArrayList<>();

        int tab[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100 + 1);
            if (!list.contains(tab[i])) {
                list.add(tab[i]);
            }
        }
        return list;
    }
}

