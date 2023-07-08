public class GarbageCollect {
    public void finalize() {
        System.out.println("Object is collected for Garbage");
    }

    public static void main(String args[]) {
        GarbageCollect s1 = new GarbageCollect();
        GarbageCollect s2 = new GarbageCollect();

        s1 = null; // Finalize function is automatically called for Garbage
        // collection
        s2 = null;
        System.gc();
    }

}

// OUTPUT::
// Object is collected for Garbage
// Object is collected for Garbage