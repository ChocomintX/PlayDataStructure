package chapter03.Queue;

import chapter03.Array.Array;

import java.util.Random;

public class Main {
    private static double testQueue(Queue<Integer> q, int opCount) {
        long statTime=System.nanoTime();

        Random random=new Random();
        for (int i=0;i<opCount;i++)
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        for (int i=0;i<opCount;i++)
            q.dequeue();

        long endTime=System.nanoTime();

        return (endTime-statTime)/1000000000.0;
    }

    public static void main(String[] args) {
        int opCount=10000;

        ArrayQueue<Integer> arrayQueue=new ArrayQueue<>();
        double time1=testQueue(arrayQueue,opCount);
        System.out.println("ArrayQueue, time: " + time1 + " s");

        LoopQueue<Integer> loopQueue=new LoopQueue<>();
        double time2=testQueue(loopQueue,opCount);
        System.out.println("LoopQueue, time: " + time2 + " s");
    }
}
