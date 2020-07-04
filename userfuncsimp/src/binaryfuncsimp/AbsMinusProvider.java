package binaryfuncsimp;

import binaryfuncs.BinFuncProvider;
import binaryfuncs.BinaryFunc;

public class AbsMinusProvider implements BinFuncProvider {
    @Override
    public BinaryFunc get() {
        return new AbsMinus();
    }
}
