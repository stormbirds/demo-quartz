package com.example.demoquartz;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "更新job cron时间参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateJobBean {
    @ApiModelProperty(value = "jobTime的cron表达式", example = "0 0 1 * * ?")
    String jobCronTime;

    public String getJobCronTime() {
        return jobCronTime;
    }

    public void setJobCronTime(String jobCronTime) {
        this.jobCronTime = jobCronTime;
    }
}