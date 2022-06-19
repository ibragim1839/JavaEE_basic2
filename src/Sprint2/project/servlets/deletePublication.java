package Sprint2.project.servlets;

import Sprint2.project.managing.Manager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deletePublication")

public class deletePublication extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Long id = Long.parseLong(req.getParameter("id"));

        if(id != null) {
            Manager.deletePublication(id);
        }


        resp.sendRedirect("/admin?req=publications");
    }
}
