package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("answer", "Result: ---");

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first_number = request.getParameter("first");
        String second_number = request.getParameter("second");
        String submit = request.getParameter("submit");

        request.setAttribute("firstNumber", first_number);
        request.setAttribute("secondNumber", second_number);

        if (submit.equals("+") && !first_number.equals("") && !second_number.equals("")) {
            
            int sum = Integer.parseInt(first_number) + Integer.parseInt(second_number);
            request.setAttribute("answer", "Result: " + sum);
            
        } else if (submit.equals("-") && !first_number.equals("") && !second_number.equals("")) {
            
            int difference = Integer.parseInt(first_number) - Integer.parseInt(second_number);
            request.setAttribute("answer", "Result: " + difference);
            
        } else if (submit.equals("*") && !first_number.equals("") && !second_number.equals("")) {
            
            int product = Integer.parseInt(first_number) * Integer.parseInt(second_number);
            request.setAttribute("answer", "Result: " + product);
            
        } else if (submit.equals("%") && !first_number.equals("") && !second_number.equals("")) {
            
            int quotient = Integer.parseInt(first_number) / Integer.parseInt(second_number);
            request.setAttribute("answer", "Result: " + quotient);
            
        } else {
            request.setAttribute("answer", "Result: Invalid");
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }
}
