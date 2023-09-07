package com.example.demoquartz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ScheduleJobServiceImpl implements ScheduleJobService{
    @Override
    public void scheduleJob1() throws Exception {
        log.info("任务 scheduleJob1 start");
        log.info("任务 scheduleJob1 done");
    }

    @Override
    public void scheduleJob2() throws Exception {
        log.info("任务 scheduleJob2 start");
        log.info("任务 scheduleJob2 done");
    }
}
