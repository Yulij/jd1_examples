package lecture18.synchro;

/**
 * Created by yslabko on 018 18.05.16.
 */
class MyThread /*implements Runnable*/ {
   /* Data obj;

    MyThread(Data d) {
        obj = d;
        new Thread(this).start();
    }

    void Add() {
        try {
            Thread.sleep(10);
            int n = obj.count;
            n++;
            Thread.sleep(10);
            obj.count = n;
        } catch (InterruptedException ex) {
        }
    }

    static void AddStatic() {
        try {
            Thread.sleep(10);
            int n = Data.countSt;
            n++;
            Thread.sleep(10);
            Data.countSt = n;
        } catch (InterruptedException ex) {
        }
    }

    public void run() {
        for (int i = 0; i < 10; i++)
            Add();
        for (int i = 0; i < 10; i++)
            AddStatic();
    }

    public static void main(String[] args) throws Exception {
        Data d = new Data();
        new MyThread(d);
        new MyThread(d);
        Thread.sleep(2000);
        System.out.println(d.count);
        System.out.println(Data.countSt);
    }*/

}
