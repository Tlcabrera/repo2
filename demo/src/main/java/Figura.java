import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import figuras.Cuadrado;

public class Figura extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String accion=req.getParameter("accion");
        System.out.println(accion);

        switch(accion){
        case "cuadrado":
          req.getRequestDispatcher("cuadrado.jsp").forward(req, resp);

        break;   
        }   
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String accion=req.getParameter("accion");
        System.out.println(accion);
        switch(accion){
        case "areacu":
            double l=Double.parseDouble(req.getParameter("lado"));
            /*double areac=l*l;
            System.out.println("El lado es "+l+" y el área es "+areac);*/
            Cuadrado cu=new Cuadrado(l);
            req.setAttribute("area", cu.calcularArea());
            req.getRequestDispatcher("resultado.jsp").forward(req, resp);
        break;
        }

    }
    
}
