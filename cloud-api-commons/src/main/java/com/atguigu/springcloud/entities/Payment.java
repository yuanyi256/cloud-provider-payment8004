package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yuanyi
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2023/2/25 12:37
 * @updateDate 2023/2/25 12:37
 *
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

        private Long id;

        private String serial;
}
