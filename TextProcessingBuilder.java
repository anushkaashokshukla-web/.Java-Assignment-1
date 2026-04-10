class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");

        System.out.println("Modified: " + sb);

        // Difference:
        // StringBuffer = thread-safe (synchronized)
        // StringBuilder = faster, not thread-safe
    }
}
