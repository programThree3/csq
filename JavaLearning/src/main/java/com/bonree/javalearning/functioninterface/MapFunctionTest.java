package com.bonree.javalearning.functioninterface;

public class MapFunctionTest {
    static {
        IAction.functionMap.put("openDoor", jsonObject -> "open door");
        IAction.functionMap.put("closeDoor", jsonObject -> "close door");
        IAction.functionMap.put("addUser", jsonObject -> "add user");
    }

    public static void main(String[] args) {
        System.out.println(IAction.execute("addUser"));
    }
}
