package com.example.teemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @Size(max = 12)
    @Column(name = "id", nullable = false, length = 12, unique = true)
    private String id;

    @Size(max = 12)
    @NotNull
    @Column(name = "password", nullable = false, length = 12)
    private String password;

}