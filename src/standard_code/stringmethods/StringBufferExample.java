package standard_code.stringmethods;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // append()
        sb.append(" World");
        sb.append('!');
        sb.append(true);
        sb.append(123);
        sb.append(3.14);
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(5, ", ");
        sb.insert(6, 'W');
        sb.insert(7, false);
        sb.insert(8, 456);
        sb.insert(9, 2.718);
        System.out.println("After insert: " + sb);

        // replace()
        sb.replace(5, 8, "Universe");
        System.out.println("After replace: " + sb);

        // delete()
        sb.delete(5, 14);
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // capacity()
        int capacity = sb.capacity();
        System.out.println("Capacity: " + capacity);

        // ensureCapacity()
        sb.ensureCapacity(30);

        // charAt()
        char charAt = sb.charAt(0);
        System.out.println("charAt: " + charAt);

        // length()
        int length = sb.length();
        System.out.println("length: " + length);

        // substring()
        String substring1 = sb.substring(6);
        System.out.println("substring1: " + substring1);

        String substring2 = sb.substring(3, 8);
        System.out.println("substring2: " + substring2);
    }
}
