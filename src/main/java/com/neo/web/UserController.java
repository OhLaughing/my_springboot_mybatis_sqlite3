package com.neo.web;

import com.neo.entity.TableResult;
import com.neo.entity.UserEntity;
import com.neo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

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

    @RequestMapping(value = "/getTable", method = POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public TableResult getTable(int limit, int offset) {
        System.out.println("in table controller");
        System.out.println("pageNumber: " + limit + " offset: " + offset);
        List<UserEntity> rows = userMapper.getAllByLimit(limit * (offset - 1), limit);
        int total = userMapper.getAll().size();
        TableResult result = new TableResult();
        result.setTotal(total);
        result.setPage(offset);
        result.addRows(rows);
        System.out.println(result);
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

    @RequestMapping(value = "/delete", method = POST)
    @ResponseBody
    public void delete(String id) {
        System.out.println(id);
        String[] ids = id.split(",");

        for (String s : ids) {
            userMapper.delete(Long.valueOf(s));
        }
    }

    @RequestMapping("123")
    @ResponseBody
    public void test() {
        System.out.println("in test");
    }

}
