package com.example.demoquartz;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

//@Configuration
//@Service
//public class QuartzConfig {
//
//    @Bean
//    public JobDetail scheduleJobDetail() {
//        System.out.println("**************************************** scheduler job begin");
//        JobDetail jobDetail = JobBuilder.newJob(SchedulerJob.class)
//                .withIdentity("schedulerJob")
//                .storeDurably()
//                .build();
//        System.out.println("**************************************** scheduler job end");
//        return jobDetail;
//    }
//
//    @Bean
//    public Trigger scheduleJobDetailTrigger() {
//        Trigger trigger = TriggerBuilder
//                .newTrigger()
//                .forJob(scheduleJobDetail())
//                .withIdentity("schedulerJob")
//                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withRepeatCount(0))
//                .startNow()
//                .build();
//        System.out.println("schedulerJob trigger end");
//        return trigger;
//    }
//}