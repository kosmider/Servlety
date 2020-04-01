package pl.coderslab;

import pl.coderslab.models.Quote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addquote")
public class AddQuote extends HttpServlet {
    private final static String SESSION_ATTR_NAME = "quotes";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       HttpSession session = request.getSession();
        List<Quote> quotes = (List<Quote>) session.getAttribute(SESSION_ATTR_NAME);
        if (quotes == null) {
            quotes = new ArrayList<>();
        }

        String author = request.getParameter("author");
        String content = request.getParameter("content");
        quotes.add(new Quote(author, content));

        session.setAttribute(SESSION_ATTR_NAME, quotes);
        request.setAttribute("msg", "Cytat dodany");
        getServletContext().getRequestDispatcher("/addQuote.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/addQuote.jsp").forward(request, response);
    }
}
