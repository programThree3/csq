package com.bonree.javalearning.enumtest;

/**
 * 枚举中定义方法
 */
public class EnumTest {
    enum Color {
        RED {
            @Override
            public String getColor() {
                return "red color";
            }
        },
        GREEN {
            @Override
            public String getColor() {
                return "green color";
            }
        },
        BLUE {
            @Override
            public String getColor() {
                return "blue color";
            }
        };

        public abstract String getColor();

    }

    public static void main(String[] args) {
        for (Color value : Color.values()) {
            System.out.println(value.getColor() + ",");
        }
    }


}
