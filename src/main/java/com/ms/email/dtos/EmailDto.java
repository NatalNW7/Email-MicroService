package com.ms.email.dtos;

import org.springframework.beans.BeanUtils;

import com.ms.email.models.EmailModel;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDto {
    @NotBlank
    private String ownerRef;
    @NotBlank
    @Email
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;

    public EmailModel convertToEmailModel(){
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(this, emailModel);

        return emailModel;
    }
}
