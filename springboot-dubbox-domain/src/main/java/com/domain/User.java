package com.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 用户信息
 * Created by wangyong on 2017/7/2.
 */

@Data
public class User {

    /**
     * 用户编号,用户名，密码，邮箱
     */

    private String userId, userName, password, email;


}
