package com.hitech.skeleton.system.service;

import com.hitech.skeleton.system.domain.User;

import java.util.List;

/**
 * @author Steven
 */
public interface UserService {

    List<User> selectAll();

    User selectByPrimaryKey(Long id);

    int insert(User user);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKey(User user);
}
