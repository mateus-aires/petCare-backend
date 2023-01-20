package com.petcare.backend.dto.user;

import com.google.gson.annotations.SerializedName;
import com.petcare.backend.util.Validator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
public class UpdateUserDTO {

    private String name;
    @Email
    @SerializedName("email")
    public String email;

    public UpdateUserDTO(String name, String email) {
        Validator.validateEmail(email);
        this.name = name;
        this.email = email;
    }
}
