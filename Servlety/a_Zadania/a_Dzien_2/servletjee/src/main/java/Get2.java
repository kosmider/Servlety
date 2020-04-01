import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@WebServlet("/get2")
public class Get2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       Map<String, String[]> parMap = request.getParameterMap();

       for(Map.Entry<String, String[]> entry: parMap.entrySet()){
           String key = entry.getKey();
           String[] value = entry.getValue();

           String output = Arrays.toString(value);
           response.getWriter().println(key + ": ");
           response.getWriter().println(output + "\n");
       }
    }
}

