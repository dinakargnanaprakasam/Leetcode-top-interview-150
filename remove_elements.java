

class remove_elements {
    public int removeElement(int[] a, int val) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != val) {
                a[count] = a[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}