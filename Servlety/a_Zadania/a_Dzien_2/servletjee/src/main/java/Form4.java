import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form4")
public class Form4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = request.getParameter("convertionType");
        double degrees = Double.parseDouble(request.getParameter("degrees"));

        PrintWriter printWriter = response.getWriter();
        if(value.equals("FahrToCelc")) {
            degrees = (degrees - 32)/2;
            printWriter.println("<center><h1>Farenheity na Celsjusze: " + degrees + "</h1>");
        } else if(value.equals("celcToFahr")) {
            degrees = 2 * degrees + 32;
            printWriter.println("<h1>Celsjusze na Farenheity: " + degrees + "</h1>");
        }
    }
}
