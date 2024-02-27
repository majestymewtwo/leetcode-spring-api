package com.example.leetcodespringapi.controller;

import com.example.leetcodespringapi.dto.response.Response;
import com.example.leetcodespringapi.service.LeetcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class LeetcodeController {
    private final LeetcodeService service;
    @Autowired
    public LeetcodeController(LeetcodeService service) {
        this.service = service;
    }
    @GetMapping("/profile/{profileName}")
    public Response viewProfileStats(@PathVariable String profileName) throws IOException {
        return service.sendRequest(profileName);
    }
}
