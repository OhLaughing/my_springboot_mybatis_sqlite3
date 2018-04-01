package com.neo.web;

import com.neo.entity.UserEntity;
import com.neo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by gustaov on 2018/3/31.
 */
@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired private UserMapper userMapper;
    @RequestMapping("/index1")
    public String index1(){
        return "index1";
    }

    @RequestMapping("/index2")
    public String index2(){
        return "index2";
    }

    @RequestMapping("/admin1")
    public String admin1(Model model){
        List<UserEntity> users = userMapper.getAll();
        for(UserEntity userEntity : users) {
            System.out.println(userEntity.getUserName());
            System.out.println(userEntity.getUserSex());
        }
        model.addAttribute("users", users);
        return "admin1";
    }
    @RequestMapping("/admin2")
    public String admin2(){
        return "admin2";
    }
}
