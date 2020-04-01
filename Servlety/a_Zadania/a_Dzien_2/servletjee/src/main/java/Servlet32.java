import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

@WebServlet("/servlet32")
public class Servlet32 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String number = request.getParameter("number");
        int sum = 0;

        if (!Pattern.matches("[0-1]+", number)) {
            response.getWriter().println("<h3>Incorrect number!<h3>");
        } else {
            char[] chars = number.toCharArray();

            for (int i = chars.length - 1; i >= 0; i--) {
                sum += Character.getNumericValue(chars[i]) * Math.pow(2, chars.length - 1 - i);
            }
            response.getWriter().println("<h3>After conversion to decimal: " + sum + "</h3>");
        }

    }
}


