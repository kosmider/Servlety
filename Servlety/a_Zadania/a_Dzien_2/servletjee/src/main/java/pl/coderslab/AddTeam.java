package pl.coderslab;

import pl.coderslab.models.Teams;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addTeam")
public class AddTeam extends HttpServlet {
    private final static String SESSION_ATTRIBUTE_NAME = "teams";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      HttpSession session = request.getSession();
      List<Teams> teams = (List<Teams>) session.getAttribute(SESSION_ATTRIBUTE_NAME);

      if(teams == null) {
          teams = new ArrayList<>();
      }
    try {
        String name = request.getParameter("name");
        int champions = Integer.parseInt(request.getParameter("champions"));
        String adress = request.getParameter("adress");
        teams.add(new Teams(name, champions, adress));
    } catch (Exception e) {
        PrintWriter out = response.getWriter();
        out.println("Nieprawidłowe dane");
    }




      session.setAttribute(SESSION_ATTRIBUTE_NAME, teams);
      request.setAttribute("msg", "Zespół dodany");

      getServletContext().getRequestDispatcher("/addTeam.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/addTeam.jsp").forward(request, response);
    }
}
