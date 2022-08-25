package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    private static AtomicInteger priority = new AtomicInteger(1);

    public MyThread() {
        setPriorityDepGroup();
    }

    public MyThread(Runnable target) {
        super(target);
        setPriorityDepGroup();
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        setPriorityDepGroup();
    }

    public MyThread(String name) {
        super(name);
        setPriorityDepGroup();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        setPriorityDepGroup();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        setPriorityDepGroup();
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        setPriorityDepGroup();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        setPriorityDepGroup();
    }

    private int getNextPriority() {
        if (priority.get() == 11) priority.set(1);
        return priority.getAndIncrement();
    }

    private void setPriorityDepGroup() {
        if (this.getThreadGroup() != null) {
            int pr = getNextPriority();
            if (this.getThreadGroup().getMaxPriority() < pr) {
                pr = this.getThreadGroup().getMaxPriority();

            }
            this.setPriority(pr);
        } else {
            this.setPriority(getNextPriority());
        }
    }
}
