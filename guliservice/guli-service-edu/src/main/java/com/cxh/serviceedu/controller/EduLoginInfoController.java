package com.cxh.serviceedu.controller;

import com.cxh.commonutils.R;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * EduLoginInfoController
 *
 * @Author: 陈晓翰
 * @CreateTime: 2020-04-13
 * @Description:
 */
@Api(description = "登录")
@RestController  //jackson
@RequestMapping("/eduservice/login")
@CrossOrigin
public class EduLoginInfoController {
    //1 模拟登录，后面改成权限管理
    @PostMapping("user/login")
    public R login() {
        //{"code":20000,"data":{"token":"admin"}}
        return R.ok().data("token", "admin");
    }

    //2 info
    @GetMapping("user/info")
    public R info() {
        //{"code":20000,"data":{"roles":["admin"],"name":"admin","avatar":"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif"}}
        return R.ok().data("roles", "[admin]").data("name", "admin").data("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
}