import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet31")
public class Servlet31 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cash = request.getParameter("cash");
        double amount = Double.parseDouble(request.getParameter("amount"));


        if (cash.equals("eurusd")) {
            amount = amount / 1.11;
            response.getWriter().println(String.format("%s %.2f %s", "<h3>* EUR -> USD: ", amount, "USD</h3>"));

        }
        if (cash.equals("usdeur")) {
            amount = amount * 1.11;
            response.getWriter().println(String.format("%s %.2f %s", "<h3>* USD -> EUR: ", amount, "EUR</h3>"));
        }
        if (cash.equals("plneur")) {
            amount = amount / 4.27;
            response.getWriter().println(String.format("%s %.2f %s", "<h3>* PLN -> EUR: ", amount, "EUR</h3>"));
        }
        if (cash.equals("eurpln")) {
            amount = amount * 4.27;
            response.getWriter().println(String.format("%s %.2f %s", "<h3>* EUR -> PLN: ", amount, "PLN</h3>"));
        }
        if (cash.equals("plnusd")) {
            amount = amount / 3.86;
            response.getWriter().println(String.format("%s %.2f %s", "<h3>* PLN -> USD: ", amount, "USD</h3>"));
        }
        if (cash.equals("usdpln")) {
            amount = amount * 3.86;
            response.getWriter().println(String.format("%s %.2f %s", "<h3>* USD -> PLN: ", amount, "PLN</h3>"));
        }
    }
}
