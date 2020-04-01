import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/formularz2")
public class Formularz2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String text = request.getParameter("someText");

        String[] textToCheck = text.split(" ");
        String[] censored = {"Pies", "Kot", "Mysz"};

        for (int i = 0; i < textToCheck.length; i++) {
            for (int j = 0; j < censored.length; j++) {
                if (textToCheck[i].equalsIgnoreCase(censored[j])) {
                    char[] word = textToCheck[i].toCharArray();
                    word[i] += '*';
                }
            }
        }

        PrintWriter printWriter = response.getWriter();
        printWriter.println(Arrays.toString(textToCheck));
    }
}
