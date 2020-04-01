import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/table_HTML")
public class Table_HTML extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object[][] inits = {{"", "X", "Y", "Z"}, {1, 1, 2, 3,}, {2, 4, 5, 6}, {3, 7, 8, 9}, {4, 10, 11, 12}};
        PrintWriter printWriter = response.getWriter();
        printWriter.println(array2HTML(inits));
    }

    public static String array2HTML(Object[][] array) {

        StringBuilder html = new StringBuilder("<table>");
        for (Object elem : array[0]
        ) {
            html.append("<th>" + elem.toString() + "</th>");
        }
        for (int i = 0; i < array.length; i++) {
            Object[] row = array[i];
            html.append("<tr>");
            for (Object elem : row
            ) {
                html.append("<td>" + elem.toString() + "</td>");
            }
            html.append("</tr>");
        }
        html.append("</table>");
        return html.toString();
    }
}
