import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import figuras.Cuadrado;

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("Entre al servlet");
       String control=req.getParameter("control");
       System.out.println("el control es "+control);
       switch (control){
           case "cuadrado":
           req.getRequestDispatcher("cuadrado.jsp").forward(req, resp);
           break;
           case "triangulo":
           req.getRequestDispatcher("triangulo.jsp").forward(req, resp);
           break;
       }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entre al doPost");
       String control=req.getParameter("control");
       System.out.println("el control es "+control);
       switch (control){
           case "areacu":
           //req.getRequestDispatcher("cuadrado.jsp").forward(req, resp);
           double lado=Double.parseDouble(req.getParameter("lado"));
           //double area=lado*lado;
           Cuadrado cu=new Cuadrado(lado);
           
           req.setAttribute("area", cu.calcularArea());
           System.out.println("El área es "+cu.calcularArea());
           req.getRequestDispatcher("resultado.jsp").forward(req, resp);
           break;
          
       }
    }
    
}
