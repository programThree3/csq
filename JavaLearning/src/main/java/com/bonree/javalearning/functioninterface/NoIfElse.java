package com.bonree.javalearning.functioninterface;

/**
 * if else太多
 */
public class NoIfElse {
    public static String execute(String command, String jsonStr) {
        if ("openDoor" .equals(command)) {
            // 具体业务代码会比较多，这里只是做一个简单的代码框架例子。
            return "开门";
        } else if ("closeDoor" .equals(command)) {
            // 业务逻辑代码省略...
            return "关门";
        } else if ("addUser" .equals(command)) {
            // 业务逻辑代码省略...
            return "添加用户";
        } else if ("removeUser" .equals(command)) {
            // 业务逻辑代码省略...
            return "删除用户";
        } else if ("addFace" .equals(command)) {
            // 业务逻辑代码省略...
            return "添加人脸";
        }
        return "未找到命令";
    }

}
