package com.bonree.javalearning.functioninterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * IAction
 */
public interface IAction {
    Map<String, Function<String, String>> functionMap = new HashMap<>();

    static String execute(String commandStr) {
        Function<String, String> function = functionMap.get(commandStr);
        return function.apply(commandStr);
    }
}
