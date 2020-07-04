package binaryfuncsimp;

import binaryfuncs.BinaryFunc;

public class AbsPlus implements BinaryFunc {

    @Override
    //возвратить имя данной функции
    public String getName() {
        return "absPlus";
    }

    @Override
    public int func(int a, int b) {
        return Math.abs(a) + Math.abs(b);
    }
}
