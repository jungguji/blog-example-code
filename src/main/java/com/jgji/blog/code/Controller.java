package com.jgji.blog.code;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RequiredArgsConstructor
@RestController
public class Controller {

    @PostMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test(@RequestBody BookRequest request) {
        log.info("request = {}", request);
        return "OK";
    }
}
