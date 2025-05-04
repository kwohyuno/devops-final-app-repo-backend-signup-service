package com.example.SpringDemo.Controller;

import com.example.SpringDemo.Model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.SpringDemo.Model.Member;
import com.example.SpringDemo.Services.MemberService;

@RestController
@CrossOrigin
@RequestMapping("/api2/health")
public class HealthController {
    private final MemberService memberService;

    @Autowired
    public HealthController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public Map<String, String> healthCheck() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "OK");

        memberService.getAllMembers();

        return response;
    }

}

