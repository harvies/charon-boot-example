package io.github.harvies.charon.example;

import io.github.harvies.charon.spring.boot.web.Constants;
import io.github.harvies.charon.spring.boot.web.result.ResultDTO;
import io.github.harvies.charon.spring.boot.web.result.Results;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {

    @RequestMapping("/success")
    public ResultDTO<String> test() {
        return Results.success(Constants.SUCCESS);
    }

    @RequestMapping("/shutdown")
    public void shutdown() {
        Runtime.getRuntime().exit(-1);
    }
}
