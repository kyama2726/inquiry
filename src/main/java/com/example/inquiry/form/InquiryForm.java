package com.example.inquiry.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class InquiryForm {

    public InquiryForm(String name, String email, String contents) {
        super();
        this.name = name;
        this.email = email;
        this.contents = contents;
    }

    @Size(min = 1, max = 20, message = "Please input 20 characters or less")
    private String name;

    @NotNull
    @Email(message = "Invalid E-mail Format")
    private String email;

    @NotNull
    private String contents;
}

