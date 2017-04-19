package by.epam.info.interpreter;

import java.util.ArrayDeque;

public class Context {

    private ArrayDeque<Double> contextValue = new ArrayDeque<>();

    public Double popValue() {
        return contextValue.pop();
    }

    public void pushValue(Double value) {
        contextValue.push(value);
    }
}
