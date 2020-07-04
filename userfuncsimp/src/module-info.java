import binaryfuncs.BinFuncProvider;
import binaryfuncsimp.AbsMinusProvider;
import binaryfuncsimp.AbsPlusProvider;

module userfuncsimp {
    requires userfuncs;

    provides BinFuncProvider with AbsPlusProvider, AbsMinusProvider;
}