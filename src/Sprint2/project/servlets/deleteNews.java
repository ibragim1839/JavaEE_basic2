package Sprint2.project.servlets;

import Sprint2.project.managing.Manager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteNews")

public class deleteNews extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Manager.deleteNews(Long.parseLong(req.getParameter("id")));
        resp.sendRedirect("/admin?req=news");
    }
}
