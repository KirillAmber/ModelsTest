package appstart;

import appfuncs.SimpleMathFuncs;
import binaryfuncs.BinFuncProvider;
import binaryfuncs.BinaryFunc;

import java.util.ServiceLoader;

public class MyModAppDemo {
    public static void main(String[] args) {
        if (SimpleMathFuncs.isFactor(2, 10))
            System.out.println("2 - множитель 10");
        System.out.println("Haимeньший общий множитель "
                + "35 и 105 - "
                + SimpleMathFuncs.lcf(35, 105));
        System.out.println("Haибoльший общий множитель "
                + "35 и 105 - "
                + SimpleMathFuncs.gcf(35, 105));

        // Затем воспользоваться служебными операциями,
        //определяемыми пользователем
        //Получить загрузчик службы для двоичных функций

        ServiceLoader<BinFuncProvider> loader = ServiceLoader.load(BinFuncProvider.class);
        BinaryFunc binOp = null;

        //Найти поставщика услуг и получить двоичную
        // функцию сложения absPlus()

        for (BinFuncProvider binFuncProvider : loader) {
            if (binFuncProvider.get().getName().equals("absPlus")) {
                binOp = binFuncProvider.get();
                break;
            }
        }

        if (binOp != null) {
            System.out.println("Результат выполняния "
                    + "Функция absPlust: "
                    + binOp.func(12, -4));
        } else
            System.out.println("Функция absPlus() не найдена");
        binOp = null;

        //Найти поставщика услуг и получить двоичную
        //функцию вычитания absMinus()
        for (BinFuncProvider binFuncProvider : loader) {
            if (binFuncProvider.get().getName().equals("absMinus")) {
                binOp = binFuncProvider.get();
                break;
            }
        }
        if (binOp != null) {
            System.out.println("Результат выполнения "
                    + "Функции absMinus: "
                    + binOp.func(12, -4));
        } else
            System.out.println("Функция absMinus не найдена");
    }
}
