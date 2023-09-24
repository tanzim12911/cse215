package assignment_02.q2;

public class MyString1 {
    char[] string;

    MyString1(String s) {
        string = s.toCharArray();
    }

    MyString1(char[] string) {
        this.string = string;
    }

    public char charAt(int index) {
        return string[index];
    }
    
    public int length() {
        return string.length;
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

        if(s.length() != string.length) {
            status = false;
        }
        else {
            for(int i = 0; i < string.length; i++) {
                if (s.string[i] != string[i]) {
                    status = false;
                }
            }
        }

        return status;
    }

    public MyString1 toUpperCase() {
        char[] UpperString = new char[string.length];

        for (int i = 0; i < string.length; i++) {
            UpperString[i] = Character.toUpperCase(string[i]);
        }

        return new MyString1(UpperString);
    }




}
