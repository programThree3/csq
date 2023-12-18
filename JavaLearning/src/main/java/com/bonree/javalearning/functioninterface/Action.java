package com.bonree.javalearning.functioninterface;

import java.util.function.Function;

/**
 * 枚举优化
 */
public enum Action {
    openDoor(jsonStr -> "open door"),
    closeDoor(jsonStr -> "close door"),
    addUser(jsonStr -> "add user");

    private Function<String, String> function;

    Action(Function<String, String> function) {
        this.function = function;
    }

    /**
     * 核心利用Enum.valueOf找到具体的事情执行
     *
     * @param commandStr 命令
     * @param jsonStr 对应的jsonStr
     * @return
     */
    public static String execute(String commandStr, String jsonStr) {
        Action action = Action.valueOf(commandStr);
        return action.function.apply(jsonStr);
    }


    public static void main(String[] args) {
        System.out.println(Action.execute("addUser", ""));
    }
}
