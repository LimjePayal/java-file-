class TextProcessingBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Welcome");

        // Append additional text
        sb.append(" to Java Programming");

        // Display modified string
        System.out.println("Modified String: " + sb);
    }
}

/*
Difference between StringBuilder and StringBuffer:

1. StringBuffer is thread-safe (synchronized).
2. StringBuilder is not thread-safe.
3. StringBuilder is faster than StringBuffer.
4. Use StringBuffer in multi-threaded environment.
5. Use StringBuilder in single-threaded environment.
*/