/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Matthew
 */
public class SalaryCalc extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        double salary = 0;
        double raise = 0;
        int years = 0;
        
        //get parameters
        try {
            salary = Double.parseDouble(request.getParameter("start"));
            raise = Double.parseDouble(request.getParameter("raise"));
            years = Integer.parseInt(request.getParameter("years"));
        }catch(Exception ex) {
            out.println("<?xml version = \"1.0\" encoding = \"utf-8\" ?>");
            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\n" +
                "\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
            out.println("<html xmlns = \"http://www.w3.org/1999/xhtml\">");
            out.println("<head> <title> Salary Projection </title>\n" +
                "    </head>");
            out.println("<body>");
            out.println("<h1> Error: Bad Type or Missing Param </h1>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
        
        try {
            out.println("<?xml version = \"1.0\" encoding = \"utf-8\" ?>");
            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\n" +
                "\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
            out.println("<html xmlns = \"http://www.w3.org/1999/xhtml\">");
            out.println("<head> <title> Salary Projection </title>\n" +
                "    </head>");
            out.println("<body>");
            out.println("<h1>Salary Projection</h1>");
            out.println("<table border = 'border'>");
            out.println("<tr> <th> </th>");        
            out.println("<th> Calculated Salaries </th> </tr>");
                        
            //Calculate decimal percentage
            raise = raise / 100;
            for(int i = 1; i <= years; i++){
                out.printf("<tr> <th> Year %d </th>\n", i);
                salary = (salary * raise) + salary;
                out.printf("<td> %.2f </td> </tr>\n", salary);
            }        
         
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
