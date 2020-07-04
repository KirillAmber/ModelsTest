package appstart;

import appfuncs.SimpleMathFuncs;
import binaryfuncs.BinFuncProvider;
import binaryfuncs.BinaryFunc;

import java.util.ServiceLoader;

public class MyModAppDemo {
    public static void main(String[] args) {
        if (SimpleMathFuncs.isFactor(2, 10))
            System.out.println("2 - ��������� 10");
        System.out.println("Ha��e����� ����� ��������� "
                + "35 � 105 - "
                + SimpleMathFuncs.lcf(35, 105));
        System.out.println("Ha��o����� ����� ��������� "
                + "35 � 105 - "
                + SimpleMathFuncs.gcf(35, 105));

        // ����� ��������������� ���������� ����������,
        //������������� �������������
        //�������� ��������� ������ ��� �������� �������

        ServiceLoader<BinFuncProvider> loader = ServiceLoader.load(BinFuncProvider.class);
        BinaryFunc binOp = null;

        //����� ���������� ����� � �������� ��������
        // ������� �������� absPlus()

        for (BinFuncProvider binFuncProvider : loader) {
            if (binFuncProvider.get().getName().equals("absPlus")) {
                binOp = binFuncProvider.get();
                break;
            }
        }

        if (binOp != null) {
            System.out.println("��������� ���������� "
                    + "������� absPlust: "
                    + binOp.func(12, -4));
        } else
            System.out.println("������� absPlus() �� �������");
        binOp = null;

        //����� ���������� ����� � �������� ��������
        //������� ��������� absMinus()
        for (BinFuncProvider binFuncProvider : loader) {
            if (binFuncProvider.get().getName().equals("absMinus")) {
                binOp = binFuncProvider.get();
                break;
            }
        }
        if (binOp != null) {
            System.out.println("��������� ���������� "
                    + "������� absMinus: "
                    + binOp.func(12, -4));
        } else
            System.out.println("������� absMinus �� �������");
    }
}
