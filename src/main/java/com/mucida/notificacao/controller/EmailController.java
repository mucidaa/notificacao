package com.mucida.notificacao.controller;

import com.mucida.notificacao.business.EmailService;
import com.mucida.notificacao.business.dto.TarefaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> sendEmail(@RequestBody TarefaDTO tarefaDTO) {
        emailService.sendEmail(tarefaDTO);
        return ResponseEntity.ok().build();
    }

}
