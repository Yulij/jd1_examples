package lecture04.system;

/**
 * Class SystemClassDemo
 *
 * Created by yslabko on 05/14/2018.
 */
public class SystemClassDemo {
    public static void main(String[] args) {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkAccess(Thread.currentThread());
        }
        System.out.println(System.getenv());
        System.out.println(System.nanoTime());
        long start = System.nanoTime();
        long end = System.nanoTime() - start;

        System.out.println("Difference in nanos:" + end);

        Runtime runtime = Runtime.getRuntime();
        System.out.println("runtime.totalMemory():\t" + runtime.totalMemory());
        System.out.println("runtime.freeMemory():\t" + runtime.freeMemory());
        System.out.println("runtime.maxMemory():\t" + runtime.maxMemory());

        try {
            System.out.println("Creating Process");

            ProcessBuilder builder = new ProcessBuilder("notepad.exe");
            Process process = builder.start();
//            System.out.println("Wait for: " + process.waitFor());

            System.out.println("Waiting");
            Thread.sleep(5000);

            process.destroy();
            System.out.println("Process destroyed with code [" + process.exitValue() + "]");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
