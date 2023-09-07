package com.example.demoquartz;

public interface ScheduleJobService {

    /**
     * job1定时任务
     * @throws Exception
     */
    void scheduleJob1() throws Exception;

    /**
     * job2定时任务
     * @throws Exception
     */
    void scheduleJob2() throws Exception;
}
