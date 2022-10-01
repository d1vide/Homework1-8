package homework1.practice7.number5;

public class MyString implements StringFunc{
    private char[] str;

    public MyString(char[] str) {
        this.str = str;
    }

    public void print() {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
        System.out.println();
    }

    @Override
    public int count() {
        return str.length;
    }
    @Override
    public MyString notEvenIndex() {
        char[] buf = new char[str.length/2];
        int k = 0;
        for (int i = 1; i < str.length; i+=2) {
            buf[k]  = str[i];
            k++;
        }
        MyString obj = new MyString(buf);
        return obj;
    }
    @Override
    public MyString invertStr() {
        char[] buf = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            buf[i]  = str[str.length - i - 1];
        }
        MyString obj = new MyString(buf);
        return obj;
    }



}
