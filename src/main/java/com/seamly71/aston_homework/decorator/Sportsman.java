package com.seamly71.aston_homework.decorator;

import java.util.List;

public abstract class Sportsman {

    public abstract List<String> inventory();

    public abstract List<String> tricks();

    public String toString() {
        StringBuilder ans = new StringBuilder();
        inventory().forEach(str -> ans.append(str).append("\n"));
        tricks().forEach(str -> ans.append(str).append("\n"));
        return ans.toString();
    }
}
