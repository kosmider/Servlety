import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/get3")
public class Get3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] numbers = request.getParameterValues("number");
        String id = request.getParameter("id");

        String output = String.format("%s", id);
        response.getWriter().println(output);

        for (int i = 0; i <= numbers.length; i++) {
            response.getWriter().println(numbers[i]);
        }
    }
}
