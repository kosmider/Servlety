package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/censored")
public class Censored extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String textArea = request.getParameter("textArea");
        String checkBox = request.getParameter("checkBox");

        String[] splitText = textArea.split("[, ]");
        String[] censoredWords = {"Kot", "Pies", "Mysz"};
        PrintWriter printWriter = response.getWriter();
        StringBuilder stringBuilder = new StringBuilder();

        if (checkBox != null) {
            printWriter.println(textArea);
        } else {
            for (String word : splitText
            ) {
                for (int i = 0; i < censoredWords.length; i++) {
                    if (word.equalsIgnoreCase(censoredWords[i])) {
                        word = word.replaceAll("[a-zA-Z]", "*");

                    }
                }
                stringBuilder.append(word).append(" ");
            }
            printWriter.println(stringBuilder);
        }
    }
}









