package com.example.hibernateconfig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/init")
public class InitHibernate extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");

            SessionFactory factory = HibernateUtil.getSessionFactory();

            Session session = factory.openSession();
            out.println("Hibernate Session opened.<br>");
            session.close();
            out.println("Hibernate Session closed.<br>");

            out.println("</body></html>");


        } catch (Exception ex) {
            throw ex;
        }

    }

}
