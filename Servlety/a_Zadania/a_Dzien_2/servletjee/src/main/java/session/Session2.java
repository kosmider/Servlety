package session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/session2")
public class Session2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println(printForm());

        HttpSession session = request.getSession();
        List<Integer> listaOcen = (List<Integer>) session.getAttribute("listaOcen");
        Integer ocena = Integer.parseInt(request.getParameter("ocena"));

        if (listaOcen == null) {
            listaOcen = new ArrayList<>();
        }

        listaOcen.add(ocena);
        session.setAttribute("listaOcena", listaOcen);
        response.getWriter().println(listaOcen + "\n");
        response.getWriter().println(calculateAverage(listaOcen));
    }

    private String printForm() {
        return "<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\">" +
                "<title>Oceny</title></head><body><form action=\"/session2\" method=\"get\">" +
                "<input type=\"text\" name=\"ocena\"><input type=\"submit\" name=\"wyslij\">" +
                "</form></body></html>";

    }

    private String calculateAverage(List<Integer> listaOcen) {
        double sum = 0;
        for (Integer integer : listaOcen) {
            sum += integer;
        }
        return listaOcen.size() == 0 ? "Brak danych" : "AVG = " + sum / listaOcen.size();
    }
}