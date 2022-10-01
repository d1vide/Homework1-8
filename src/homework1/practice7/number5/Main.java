package homework1.practice7.number5;


public class Main {

    public static void main(String[] args) {
        char[] arr = new char[] {'k', 'a', 'b', 'r'};

        MyString str1 = new MyString(arr);
        str1.print();
        StringFunc str = new MyString(arr);
        str.notEvenIndex().print();
        str.invertStr().print();
        System.out.println(str.count());

    }
}

