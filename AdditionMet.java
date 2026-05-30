package org.testleaf.SeleniumLearing_VSCode.Week2;

public class AdditionMet {

    public int add(int a, int b)
    {
      return a+b;
    }

    public static void main(String[] args) {
        AdditionMet addmet = new AdditionMet();
        addmet.add(10, 20);
        int addNum = addmet.add(10 , 20);
        System.out.println(addNum);
    }

}
