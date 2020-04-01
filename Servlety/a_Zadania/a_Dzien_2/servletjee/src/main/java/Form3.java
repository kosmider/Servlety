import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form3")
public class Form3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number = Integer.parseInt(request.getParameter("page"));
        PrintWriter printWriter = response.getWriter();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                printWriter.println(i);
            }
        }
    }
}
