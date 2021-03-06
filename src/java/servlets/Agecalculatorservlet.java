

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Agecalculatorservlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
       return;
       
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String userAge = request.getParameter("age");
        
        request.setAttribute("userAge", userAge);
             
        if(userAge.equals(""))
        {
            request.setAttribute("ageMessage", "You must give your current age.");
        }
        else
        {
            int age = Integer.parseInt(userAge);
            int nextAge = age + 1;
            
            request.setAttribute("ageMessage", "Your age next birthday will be " + nextAge + ".");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }
}