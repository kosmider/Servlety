package pl.coderslab;

import pl.coderslab.models.Quote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@WebServlet("/randomquote")
public class RandomQuote extends HttpServlet {
    private final static String SESSION_ATTR_NAME = "quotes";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Quote> quotes = (List<Quote>) session.getAttribute(SESSION_ATTR_NAME);
        try {
            request.setAttribute("quote", getRandomQuote(quotes));
        } catch (NullPointerException e) {
            System.out.println("Lista cytatow jest pusta");
        }
        getServletContext().getRequestDispatcher("/randomQuote.jsp").forward(request, response);

    }

    private Quote getRandomQuote(List<Quote> quotes) {
        Random random = new Random();
        return quotes.get(random.nextInt(quotes.size()));
    }
}