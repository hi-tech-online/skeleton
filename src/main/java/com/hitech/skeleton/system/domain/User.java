package com.hitech.skeleton.system.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class User implements Serializable {

    private Integer id;

    private String name;

    private String password;

    private String phone;

    private Boolean enabled;

    private String description;

    private static final long serialVersionUID = 1L;
}