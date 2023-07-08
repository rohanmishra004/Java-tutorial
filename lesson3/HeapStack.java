public class HeapStack {

    private int heapVar;

    public void StackMem() {
        int stackVar = 5;
        long startTime = System.nanoTime();
        int res = stackVar * 2;
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("res " + res);
        System.out.println("execution Time of Stack:" + executionTime);
    }

    public void HeapMem() {
        heapVar = 10;
        long startTime = System.nanoTime();
        int res = heapVar * 2;
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("res " + res);
        System.out.println("execution Time of Heap:" + executionTime);
    }

    public static void main(String args[]) {
        HeapStack ex1 = new HeapStack();
        ex1.StackMem();
        ex1.HeapMem();
    }
}
