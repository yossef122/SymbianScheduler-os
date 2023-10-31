package operating.system;

import java.util.PriorityQueue;

 public class SymbianScheduler {

        private PriorityQueue<Process> readyQueue;

        public SymbianScheduler() {
            readyQueue = new PriorityQueue<>();
        }

        public void addProcess(Process process) {
            readyQueue.add(process);
        }

        public Process getNextProcess() {
            return readyQueue.poll();
        }
        
        public boolean hasProcesses() {
            return !readyQueue.isEmpty();
        }
 }

 class Process implements Comparable<Process> {

        private final String name;
        private final int time;

        public Process(String name, int time) {
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public int getTime() {
            return time;
        }

        @Override
        public int compareTo(Process other) {
            return Integer.compare(this.getTime(), other.getTime());
        }
    }