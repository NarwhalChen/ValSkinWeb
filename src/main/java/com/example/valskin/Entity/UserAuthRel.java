package com.example.valskin.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "user_auth_rel")
public class UserAuthRel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authId;

    private Integer token;

    @Column(name = "auth_type", length = 255)
    private String authType;
}
