package com.example.demoquartz;

import io.swagger.annotations.*;
import org.quartz.JobDataMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Api(value = "quartz增删改查相关API")
@RequestMapping(value = "/quartz")
public class QuartzController {

    @Autowired
    QuartzService quartzService;

    @ApiOperation(value = "使用quartz添加job")
    @RequestMapping(value = "/addJob/{jobUUID}", method = RequestMethod.POST)
    public void addQuartzJob(
            @ApiParam(name = "jobUUID") @PathVariable("jobUUID") String jobUUID,
            @ApiParam(name = "JobXXXBean") @RequestBody JobXXXBean jobXXXBean) {

        if (jobXXXBean.getOpenBean() != null) {
            JobDataMap jobDataMap = new JobDataMap();
            jobDataMap.put("key01", jobXXXBean.getKey01());
            jobDataMap.put("key02", jobXXXBean.getKey02());
            jobDataMap.put("key03", jobXXXBean.getKey03());
            jobDataMap.put("jobTimeCron", jobXXXBean.getJobTimeCron());
            jobDataMap.put("key04", jobXXXBean.getKey04());

            quartzService.addJob(Job1.class,
                    jobUUID,
                    jobUUID,
                    jobXXXBean.getJobTimeCron(),
                    jobDataMap);

        } else {
            throw new RuntimeException("参数错误");
        }
    }


    @ApiOperation(value = "使用quartz查询所有job")
    @RequestMapping(value = "/queryAllJob", method = RequestMethod.GET)
    public List<Map<String, Object>> queryAllQuartzJob() {

        List<Map<String, Object>> list = null;

        list = quartzService.queryAllJob();

        return list;
    }


    @ApiOperation(value = "使用quartz查询所有运行job")
    @RequestMapping(value = "/queryRunJob", method = RequestMethod.GET)
    public List<Map<String, Object>> queryRunQuartzJob() {

        List<Map<String, Object>> list = null;

        list = quartzService.queryRunJob();

        return list;
    }

    @ApiOperation(value = "使用quartz删除job")
    @RequestMapping(value = "/deleteJob/{jobUUID}", method = RequestMethod.DELETE)
    public void deleteJob(
            @ApiParam(name = "jobUUID") @PathVariable("jobUUID") String jobUUID) {

        quartzService.deleteJob(jobUUID, jobUUID);

    }


    @ApiOperation(value = "使用quartz修改job的cron时间")
    @RequestMapping(value = "/updateJob/{jobUUID}", method = RequestMethod.PUT)
    public void deleteJob(
            @ApiParam(name = "jobUUID") @PathVariable("jobUUID") String jobUUID,
            @ApiParam(name = "jobCronTime") @RequestBody UpdateJobBean updateJobBean) {


        quartzService.updateJob(jobUUID, jobUUID, updateJobBean.getJobCronTime());


    }
}


