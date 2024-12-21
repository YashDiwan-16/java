public class pr5 {

    static class MyClass {
        // Just a dummy class
    }

 public static void main(String[] args) {
       
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        
        obj2 = null;


        System.gc();

     
        System.out.println("Garbage collection invoked.");

        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}