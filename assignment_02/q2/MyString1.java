package assignment_02.q2;

public class MyString1 {
    char[] chars;

    MyString1(char[] array) {
        chars = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            chars[i] = array[i];
        }
    }

    MyString1(String s) {
        this(s.toCharArray());
    }

    public char charAt(int index) {
        return chars[index];
    }
    
    public int length() {
        return chars.length;
    }

    public MyString1 subString(int begin, int end) {
        char[] subString = new char[end - begin];

        int x = 0;
        
        for(int i = begin; i < end; i++) {
            subString[x] = chars[i];
            x++;
        }

        return new MyString1(subString);
    }

    public boolean equals(MyString1 s) {
        boolean status = true;

        if(s.length() != chars.length) {
            status = false;
        }
        else {
            for(int i = 0; i < chars.length; i++) {
                if (s.chars[i] != chars[i]) {
                    status = false;
                }
            }
        }

        return status;
    }

    public MyString1 toUpperCase() {
        char[] UpperString = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            UpperString[i] = Character.toUpperCase(chars[i]);
        }

        return new MyString1(UpperString);
    }




}
