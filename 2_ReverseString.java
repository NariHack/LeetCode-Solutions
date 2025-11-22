class Solution {
    public void reverseString(char[] s) {
        swap(s, 0, s.length - 1);
    }

    private void swap(char[] s, int left, int right){
        if (left >= right) return;
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        swap(s, left + 1, right - 1);
    }
}

/*
Obviously using a pointer solution will be faster than recursion, however when doing this question I wanted 
to strengthen my recursion skills. I used recursion the same way one might use pointers.
*/
