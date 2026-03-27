class TextEditorBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        // Append text
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert text at specific position
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Reverse string
        sb.reverse();
        System.out.println("Reversed string: " + sb);
    }
}