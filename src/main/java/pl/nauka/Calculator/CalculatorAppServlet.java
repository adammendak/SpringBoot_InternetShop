package pl.nauka.Calculator;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(value = "/calculator", name = "CalculatorServlet")
public class CalculatorAppServlet extends HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().write("strona kalkulatora ");

        String firstNumber = request.getParameter("firstNumber");
        String secondNumber = request.getParameter("secondNumber");

        response.getWriter().printf("Twoje liczby to %s oraz %s", firstNumber, secondNumber);
    }
}
