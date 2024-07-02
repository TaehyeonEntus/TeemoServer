package com.example.teemo.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
    @Size(min = 8, max = 12)
    @NotEmpty(message = "ID를 입력해주세요.")
    private String id;

    @Size(min = 8, max = 12)
    @NotEmpty(message = "비밀번호를 입력해주세요.")
    private String password;

    @Size(min = 8, max = 12)
    @NotEmpty(message = "비밀번호를 확인해주세요.")
    private String passwordCheck;
}
