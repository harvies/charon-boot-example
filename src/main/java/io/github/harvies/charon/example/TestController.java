package io.github.harvies.charon.example;

import io.github.harvies.charon.spring.boot.web.Constants;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {

    private String status = Constants.SUCCESS;

    @RequestMapping("/status")
    public String status() {
        return status;
    }

    @RequestMapping("/success")
    public void success() {
        status = Constants.SUCCESS;
    }

    @RequestMapping("/fail")
    public void fail() {
        status = Constants.FAIL;
    }

    @RequestMapping("/shutdown")
    public void shutdown() {
        Runtime.getRuntime().exit(-1);
    }
}
