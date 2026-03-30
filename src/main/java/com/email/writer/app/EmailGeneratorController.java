package com.email.writer.app;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")

@CrossOrigin(origins = "*")
public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;

    public EmailGeneratorController(EmailGeneratorService emailGeneratorService) {
        this.emailGeneratorService = emailGeneratorService;
    }

    @PostMapping("/generate")
    public String generateEmail(@RequestBody EmailRequest request) {
        return emailGeneratorService.generateEmailReply(request);
    }
}