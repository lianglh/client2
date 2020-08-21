package com.dandan.client2.feign.hystrix;


import com.dandan.client2.common.ResultObject;
import com.dandan.client2.entity.Admin;
import com.dandan.client2.feign.AdminFeign;

public class AdminFeignHystrix implements AdminFeign {


    @Override
    public ResultObject addAdmin(Admin admin) {
        return null;
    }

}
