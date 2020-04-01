import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/showAllCookies")
public class Cookie4Show extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append(printAllCookies(request.getCookies())).close();
    }

    private String printAllCookies(Cookie[] cookies) {
        StringBuilder sb = new StringBuilder("<table style=\"width:600px\" border=\"1\" color=\"red\">");

        for (Cookie cookie : cookies) {
            sb.append(String.format("<tr><td>%s</td><td>%s</td>" +
                            "<td><a href=\"/servletjee_war_exploded/removeCookie?cookieName=%s\">Usun</a></td>",
                    cookie.getName(), cookie.getValue(), cookie.getName()));
        }
        return sb.append("</table>").toString();
    }
}
