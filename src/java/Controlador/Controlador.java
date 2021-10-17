
package Controlador;


import ModeloDAO.PersonaDAO;
import ModeloDAO.UsuarioDAO;
import Modelo.Persona;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;


public class Controlador extends HttpServlet {

    String listar = "vistas/listar.jsp";
    String add = "vistas/add.jsp";
    String edit = "vistas/edit.jsp";
    Persona p = new Persona();
    PersonaDAO dao = new PersonaDAO();
    UsuarioDAO udao = new UsuarioDAO();
    int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = "";
        String action = request.getParameter("accion");
        
        if (action.equalsIgnoreCase("listar")) {
            acceso = listar;
        } else if (action.equalsIgnoreCase("login")) {
            String pw = request.getParameter("txtPass");
            String nom = request.getParameter("txtUsuario");
            System.out.println(pw);
            boolean x = udao.login(nom, pw);
            if (x) {
                acceso = listar;
            }
        }else if (action.equalsIgnoreCase("add")) {
            acceso = add;
            } else if (action.equalsIgnoreCase("Agregar")) {
            String dni = request.getParameter("txtDni");
            String nom = request.getParameter("txtNom");
            p.setDni(dni);
            p.setNom(nom);
            dao.add(p);
            acceso = listar;
        } else if (action.equalsIgnoreCase("editar")) {
            request.setAttribute("idper", request.getParameter("id"));
            acceso = edit;
        } else if (action.equalsIgnoreCase("Actualizar")) {
            id = Integer.parseInt(request.getParameter("txtid"));
            String dni = request.getParameter("txtDni");
            String nom = request.getParameter("txtNom");
            p.setId(id);
            p.setDni(dni);
            p.setNom(nom);
            dao.edit(p);
            acceso = listar;
        } else if (action.equalsIgnoreCase("eliminar")) {
            id = Integer.parseInt(request.getParameter("id"));
            p.setId(id);
            dao.eliminar(id);
            acceso = listar;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
