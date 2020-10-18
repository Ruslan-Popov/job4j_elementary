package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int position = word.length - 1;
        for (int i = post.length - 1; i >= 0; i--) {
            if (word[position] != post[i]) {
                result = false;
                break;
            }
            position--;
        }
        return result;
    }
}
