public class garbagecollector {

    static class MyClass {
        // Just a simple class
    }

    public static void main(String[] args) {
        // Create objects
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        // Release references
        obj1 = null;
        obj2 = null;

        // Manually invoke garbage collection
        System.gc();

        // Just to show that the program is still running
        System.out.println("Garbage collection invoked. Program continues to run...");

        // Add a delay to observe output
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
