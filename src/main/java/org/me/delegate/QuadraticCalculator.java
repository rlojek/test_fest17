package org.me.delegate;

import java.util.List;
import java.util.Scanner;

public class QuadraticCalculator {

    private QuadraticSolver solver;
    private double a;
    private double b;
    private double c;

    public QuadraticCalculator(QuadraticSolver solver) {
        this.solver = solver;
        readKnownNumbers();
    }

    void readKnownNumbers() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a");
        a = reader.nextDouble();

        System.out.println("Enter b");
        b = reader.nextDouble();

        System.out.println("Enter c");
        c = reader.nextDouble();

    }

    public String getFormattedSolution() {
        List<Double> solutions = solver.calculateSolution(a, b, c);
        return formatSolutions(solutions);
    }

    private String formatSolutions(List<Double> solutions) {
        switch (solutions.size()) {
            case 0:
                return "No solutions";
            case 1:
                return "One solution: " + solutions.get(0);
            case 2:
                return "Two solutions: " + solutions.get(0) + " and: " + solutions.get(1);
            default:
                throw new RuntimeException("Strange thins calculates here");
        }
    }


    public static void main(String[] args) {
        QuadraticSolver solver = new QuadraticSolver();
        QuadraticCalculator calculator = new QuadraticCalculator(solver);
        System.out.println(calculator.getFormattedSolution());
    }
}
