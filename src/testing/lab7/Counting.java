package testing.lab7;

class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class Counting {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        int totalCount = Counter.getCount();
        System.out.println("Total number of objects created: " + totalCount);
    }
}

