package com.lfj.springbootsecurity.contrller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user
 *
 * @author lfj
 * @date 2020/10/9 17:37
 */
@RestController
public class UserController {


    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }


}
