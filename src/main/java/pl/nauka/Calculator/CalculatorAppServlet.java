package pl.nauka.Calculator;

import com.sun.javafx.binding.StringFormatter;
import pl.nauka.Calculator.model.CalculatorInstance;
import pl.nauka.Calculator.model.Computable;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(value = "/calculator", name = "CalculatorServlet")
public class CalculatorAppServlet extends HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        CalculatorInstance calculator = new CalculatorInstance();

        response.getWriter().write("strona kalkulatora");

        String firstNumber = request.getParameter("firstNumber");
        String secondNumber = request.getParameter("secondNumber");
        String equation = request.getParameter("equation");
        int result;

        response.getWriter().printf("Twoje liczby to %s oraz %s : a wynik działania to :", firstNumber, secondNumber);

//        if(equation == "dodawanie") {
//            int result = calculator.adder(Integer.valueOf(firstNumber), Integer.valueOf(secondNumber));
//        };
//
        switch (equation) {
            case ("dodawanie"):
                result = calculator.adder(Integer.valueOf(firstNumber), Integer.valueOf(secondNumber));
                break;
            case ("odejmowanie"):
                result = calculator.subtractor(Integer.valueOf(firstNumber), Integer.valueOf(secondNumber));
                break;
            case ("mnozenie"):
                result = calculator.multiplier(Integer.valueOf(firstNumber), Integer.valueOf(secondNumber));
                break;
            case ("dzielenie"):
                try {
                    result = calculator.divider(Integer.valueOf(firstNumber), Integer.valueOf(secondNumber));
                } catch (NumberFormatException e) {
                    e.getMessage();
                    result = 1;
                }
                break;
            default:
                result = 0;
        }

        response.getWriter().print(result);
        response.

//        Computable adder = (a,b) -> a + b;
//        Computable subtractor = (a,b) -> a - b;
//
//        switch (equation){
//            case("dodawanie") :
//                int result = adder.compute(Integer.valueOf(firstNumber), Integer.valueOf(secondNumber));
//                response.getWriter().write(result);
////                response.getWriter().write(adder.compute(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber)));
//                break;
//
//            case("odejmowanie"):
//                response.getWriter().write(subtractor.compute(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber)));
//                break;
//
//            default:
//                break;
//
//        }
//


    }
}
