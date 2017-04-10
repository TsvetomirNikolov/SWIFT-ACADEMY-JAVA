package pkg06.oop.principles.and.debbugind.Task1_CalculatorClient;

import java.io.PrintStream;
import java.util.Scanner;

public class Calculator {

    private double _a;
    private double _b;
    private String _operation;

    Calculator(double a, double b, String operation) {
        this._a = a;
        this._b = b;
        this._operation = operation;
    }

    public String operationsWithDigits(double a, double b) {
        double result = 0.0;
        if (this._operation.equals("SUM")) {
            result = this._a + this._b;
        } else if (this._operation.equals("MUL")) {
            result = this._a * this._b;
        } else if (this._operation.equals("PER")) {
            result = this._b % this._a;
        } else if (this._operation.equals("SUB")) {
            result = this._b - this._a;
        } else {
            result = this._a / this._b;
        }
        return String.format("%.3f", result);
    }

    public double getA() {
        return _a;
    }

    public double getB() {
        return _b;
    }

    public String getOperation() {
        return _operation;
    }

}
