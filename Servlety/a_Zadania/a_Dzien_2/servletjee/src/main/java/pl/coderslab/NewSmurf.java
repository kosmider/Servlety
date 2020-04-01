package pl.coderslab;

import pl.coderslab.models.Smurf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/newSmurf")
public class NewSmurf extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String atribute = request.getParameter("atribute");
        String description = request.getParameter("description");
        Smurf smurf = new Smurf(name, atribute, description);

        String output = String.format("Name: %s\n atribute: %s\n description %s\n", name, atribute, description);

        response.getWriter().append(output);
    }
}
