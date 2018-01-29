package com.leo.scconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.leo.scconfigclient.BaseResponse;
import com.leo.scconfigclient.RestResponse;

/**
 * Created by leo on 2018/1/29.
 * Description:
 */
@RestController
public class TestController {
    @Value("${file-test}")
    String fileTest;

    @GetMapping("/test")
    public BaseResponse test() {
        return new RestResponse<>("test config center profile:" + fileTest);
    }
}
