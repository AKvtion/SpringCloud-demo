package cn.fauchard.feign.pojo;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String address;
}