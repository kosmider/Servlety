package pl.coderslab;

import pl.coderslab.models.dao.SmurfDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/smurfs")
public class Smurfs extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("smurfs", SmurfDao.getList());
        getServletContext().getRequestDispatcher("/smurfs.jsp").forward(request, response);

    }
}
