package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread loggingthread;

    public LoggingStateThread(Thread loggingthread) {
        this.loggingthread = loggingthread;
    }

    public void run() {
        State state = loggingthread.getState();
        System.out.println(state);
        while (true) {
            if (state != loggingthread.getState()) {
                state = loggingthread.getState();
                System.out.println(loggingthread.getState());
            }
            if (state == State.TERMINATED) {
                break;
            }

        }
    }
}
