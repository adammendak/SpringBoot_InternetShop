package pl.nauka.Calculator.model;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

public class CalculatorInstance {
    private List<Integer> history;

    public CalculatorInstance() {
        this.history =  new ArrayList<>();
    }

    public List<Integer> getHistory() {
        return history;
    }

    public void setHistory(List<Integer> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "CalculatorInstance{" +
                "history=" + history +
                '}';
    }

    public int adder (int a, int b) {
        return a + b;
    }

    public int subtractor (int a, int b) {
        return a - b;
    }

    public int multiplier (int a, int b) {
        return a * b;
    }

    public int divider (int a, int b) {
        return a/b;
    }

//    Computable adder = (a, b) -> a + b;
//    Computable subtractor = (a,b) -> a - b;
//    Computable multiplier = (a,b) -> a * b;
//    Computable divider = (a,b) -> a / b;



}
