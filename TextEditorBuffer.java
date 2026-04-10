class TextEditorBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        sb.insert(5, ",");

        System.out.println("Original: " + sb);
        System.out.println("Reversed: " + sb.reverse());
    }
}
