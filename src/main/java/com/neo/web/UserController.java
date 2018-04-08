package com.neo.web;

import com.neo.entity.TableResult;
import com.neo.entity.UserEntity;
import com.neo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUsers")
    @ResponseBody
    public List<UserEntity> getUsers() {
        List<UserEntity> users = userMapper.getAll();
        System.out.println("getUsers");
        return users;
    }

    @RequestMapping(value = "/getTable", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public TableResult getTable(int limit, int offset) {
        System.out.println("in table controller");
        System.out.println("pageNumber: " + limit + " offset: " + offset);
        List<UserEntity> rows = userMapper.getAllByLimit(1,10);
        TableResult result = new TableResult();
        result.setTotalCount(10);
        result.addRows(rows);
        return result;
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public UserEntity getUser(Long id) {
        UserEntity user = userMapper.getOne(id);
        return user;
    }

    @RequestMapping(value = "/add")
    public String save(UserEntity user, Model model) {
        userMapper.insert(user);
        List<UserEntity> users = userMapper.getAll();
        model.addAttribute("users", users);
        return "redirect:admin1";
    }

    @RequestMapping(value = "update")
    public void update(UserEntity user) {
        userMapper.update(user);
    }

    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }





}