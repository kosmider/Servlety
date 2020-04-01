package pl.coderslab;

import pl.coderslab.models.Teams;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@WebServlet("/randomTeam")
public class RandomTeam extends HttpServlet {
    private final static String SESSION_NAME = "teams";
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Teams> teams = (List<Teams>) session.getAttribute(SESSION_NAME);

        try {
          request.setAttribute("teams", getRandomTeam(teams));
        } catch (NullPointerException e) {
            System.out.println("Lista zespołów jest pusta");
        }
        getServletContext().getRequestDispatcher("/randomTeams.jsp").forward(request, response);
    }

    private Teams getRandomTeam(List<Teams> teams) {
        Random random = new Random();
        return teams.get(random.nextInt(teams.size()));
    }
}
