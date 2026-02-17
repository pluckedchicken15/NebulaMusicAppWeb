
package com.mycompany.nebulamusicappweb.servlets;

import com.mycompany.nebulamusicappweb.repositories.UsuarioDB;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Pride Factor Black
 */
@WebServlet(name = "AutenticationServlet", urlPatterns = {"/autenticacion"})
public class AutenticationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
        
        String correo = request.getParameter("correo");
        String contrasenia = request.getParameter("contrasenia");
        
        boolean valido = UsuarioDB.autenticar(correo, contrasenia);
        
        if (valido) {
            response.sendRedirect("index.html");
        }else{
            response.sendRedirect("error.html");
        }
    }
   
}
