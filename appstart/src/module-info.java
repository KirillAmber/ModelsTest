import binaryfuncs.BinFuncProvider;

module appstart{
    requires transitive userfuncs;
    requires appfuncs;
    uses BinFuncProvider;
}