package com.hitech.skeleton.system.rest;

import com.hitech.skeleton.system.domain.User;
import com.hitech.skeleton.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public List<User> selectAll() {
        return userService.selectAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public User selectByPrimaryKey(@PathVariable Long id) {
        return userService.selectByPrimaryKey(id);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public int insert(User user) {
        return userService.insert(user);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public int deleteByPrimaryKey(@PathVariable Long id) {
        return userService.deleteByPrimaryKey(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public int updateByPrimaryKey(User user) {
        return userService.updateByPrimaryKey(user);
    }

}