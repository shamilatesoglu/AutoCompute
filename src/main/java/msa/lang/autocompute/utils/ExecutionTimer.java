package msa.lang.autocompute.utils;

import java.util.Date;

public abstract class ExecutionTimer {

    public abstract void execute();

    public long start() {
        long startTime = new Date().getTime();

        this.execute();

        long endTime = new Date().getTime();

        return endTime - startTime;
    }
}
