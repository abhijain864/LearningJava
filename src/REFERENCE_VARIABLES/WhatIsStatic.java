package REFERENCE_VARIABLES;

import lombok.Data;

import java.util.List;

@Data
public class WhatIsStatic {

    private List<Double> dummyList;

    private static List<Integer> staticList;

    public static void staticFunc() {
        staticList.add(2);
    }

    public void addRandomNumberToDummyList(){
        dummyList.add(Math.random());
    }

    public static void main(String[] args) {
        WhatIsStatic whatIsStatic = new WhatIsStatic();

    }

}
