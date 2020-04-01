package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/get5")
public class Get5 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        setContent(response);

        Map<String, String[]> map = request.getParameterMap();

        getMap(response, map);
    }

    private void setContent(HttpServletResponse response) {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
    }

    private void getMap(HttpServletResponse response, Map<String, String[]> map) throws IOException {
        for (Map.Entry<String, String[]> entry : map.entrySet()) {
            String key = entry.getKey();
            String[] value = entry.getValue();

            PrintWriter printWriter = response.getWriter();
            printWriter.println(key + ": <br>");
            for(int i = 0; i < value.length; i++) {
                printWriter.println("<pre>  " + "-" + value[i] + "<br></pre>");
            }
        }
    }
}
