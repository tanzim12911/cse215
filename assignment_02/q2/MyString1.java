package assignment_02.q2;

public class MyString1 {
    char[] string;
    int stringLength;

    MyString1() {

    }

    MyString1(char[] string) {
        this.string = string;
        this.stringLength = string.length;
    }

    public char charAt(int index) {
        return string[index];
    }
    
    public int length() {
        return stringLength;
    }

    public MyString1 subString(int begin, int end) {
        int subStringLn = end - begin;
        char[] subString = new char[subStringLn];

        int x = 0;
        
        for(int i = begin; i < end; i++) {
            subString[x] = string[i];
            x++;
        }

        return new MyString1(subString);
    }

    public boolean equals(MyString1 s) {
        boolean status = true;

        if(s.stringLength != stringLength) {
            status = false;
        }
        else {
            for(int i = 0; i < stringLength; i++) {
                if (s.string[i] != string[i]) {
                    status = false;
                }
            }
        }

        return status;
    }

    public MyString1 toUpperCase() {
        char[] UpperString = new char[stringLength];

        for (int i = 0; i < stringLength; i++) {
            UpperString[i] = Character.toUpperCase(string[i]);
        }

        return new MyString1(UpperString);
    }




}
