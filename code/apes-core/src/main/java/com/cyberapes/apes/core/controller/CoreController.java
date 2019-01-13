package com.cyberapes.apes.core.controller;

import com.cyberapes.apes.core.entity.CoreVO;
import com.cyberapes.apes.core.api.ICoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("core/user")
public class CoreController {

    @Autowired
    private ICoreService userService;

    /**
     * get请求url应为：./getUserInfo/..,且userId为必须参数
     * @param userId
     * @return
     */
    @GetMapping("/getUserInfo/{id}")
    public CoreVO getUserInfo(@PathVariable("id") String userId){
        return userService.getUserInfo(userId);
    }

}