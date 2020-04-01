package pl.coderslab;

import pl.coderslab.models.Player;
import pl.coderslab.models.dao.PlayerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/players")
public class Players extends HttpServlet {
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("players", PlayerDao.getList());
        getServletContext().getRequestDispatcher("/players.jsp").forward(request, response);

    }
}
