package operating.system;

public class main {

    public static void main(String[] args) {
        SymbianScheduler scheduler = new SymbianScheduler();

        scheduler.addProcess(new Process("P1", 3));
        scheduler.addProcess(new Process("P2", 3));
        scheduler.addProcess(new Process("P3", 2));
        scheduler.addProcess(new Process("p4", 5));
        scheduler.addProcess(new Process("p5", 2));
 
        while (scheduler.hasProcesses()) {
            Process nextProcess = scheduler.getNextProcess();
            System.out.println("Executing process: " + nextProcess.getName());
            System.out.println("Time: " + nextProcess.getTime());

            if (nextProcess.getTime() > 0) {
                nextProcess = new Process(nextProcess.getName(), nextProcess.getTime() - 1);
                scheduler.addProcess(nextProcess);
            }
        }
    }
}
