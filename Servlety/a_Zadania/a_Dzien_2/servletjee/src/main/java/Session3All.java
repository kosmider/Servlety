import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("showAllSessions")
public class Session3All extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        response.getWriter().println(printForm());
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        session.setAttribute(key, value);

    }
    private String printForm(){
        return "<form action=\"\" method=\"POST\">\n" +
                "        <label>\n" +
                "            Klucz:\n" +
                "            <input type=\"text\" name=\"key\">\n" +
                "        </label>\n" +
                "        <label>\n" +
                "            Wartość:\n" +
                "            <input type=\"text\" name=\"value\">\n" +
                "        </label>\n" +
                "        <input type=\"submit\">\n" +
                "    </form>";
    }

}
