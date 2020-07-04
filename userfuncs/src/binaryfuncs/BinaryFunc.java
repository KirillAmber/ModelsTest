package binaryfuncs;

public interface BinaryFunc {
    //получить имя функции
    String getName();

    //Выполняемая функция. Она предоставляется в конкретных реализациях
    int func(int a, int b);
}
