package by.epam.preTraining.task4.model;

/**
 * Created by karina on 13-02-2018.
 */
public class HanoiTower {
    private static String resultRecursive = "";
    private static String result = "";

    public static String calculateHanoiRecursive(int rings, String from, String to, String middle) {
        if (rings == 1) {
            resultRecursive += "\n" + from + "->" + to;
        } else {
            calculateHanoiRecursive(rings - 1, from, middle, to);
            resultRecursive += "\n" + from + "->" + to;
            calculateHanoiRecursive(rings - 1, middle, to, from);
        }
        return resultRecursive;
    }

    public static String calculateHanoi(int rings, String from, String to, String middle) {
        if (rings % 2 == 0) {
            for (int i = 1; i < (1 << rings); i++) {
                result += "\n" + getTowerName((i & i - 1) % 3, from, to, middle) + "->" +
                        getTowerName(((i | i - 1) + 1) % 3, from, to, middle);
            }
        } else {
            for (int i = 1; i < (1 << rings); i++) {
                result += "\n" + getTowerName((i & i - 1) % 3, from, middle, to) + "->" +
                        getTowerName(((i | i - 1) + 1) % 3, from, middle, to);
            }

        }

        return result;
    }

    private static String getTowerName(int number, String from, String to, String middle) {
        String name = "";
        switch (number) {
            case 0:
                name = from;
                break;
            case 1:
                name = to;
                break;
            case 2:
                name = middle;
                break;
        }
        return name;
    }

}