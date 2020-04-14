package com.cxh.servicebase.exception;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GuliException
 *
 * @Author: 陈晓翰
 * @CreateTime: 2020-04-11
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuliException extends RuntimeException {
    @ApiModelProperty(value = "状态码")
    private  Integer code;

    private  String msg;
}