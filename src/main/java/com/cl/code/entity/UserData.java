package com.cl.code.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author chengliang
 * @since 2022/10/26 17:18
 */
@Data
@AllArgsConstructor
public class UserData {

    private Long id;

    private String name;

    private Integer age;

}
