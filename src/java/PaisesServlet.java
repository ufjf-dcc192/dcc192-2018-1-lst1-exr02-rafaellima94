/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ice
 */
@WebServlet(urlPatterns = {"/paises"})
public class PaisesServlet extends HttpServlet {

    private Map<String, String> paises = new HashMap<String, String>() {
        {
            put("Amarelo", "Brasil");
            put("Vermelho", "Alemanha");
            put("Verde", "Itália");
            put("Azul", "Espanha");
            put("Branco", "Inglaterra");
        }
    };

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PaisesServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PaisesServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListaFrutasServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Paises</h1>");

            for (Map.Entry<String, String> entry : paises.entrySet()) {
                String key = entry.getKey().toString();
                String value = entry.getValue();
                out.println("<p>" + key + " - " + value + "</p>");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
