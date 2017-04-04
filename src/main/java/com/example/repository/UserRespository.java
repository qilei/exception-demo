package com.example.repository;

import com.example.domain.User;

/**
 * Created by qilei on 17/3/29.
 */
public interface UserRespository {

  User findOne(Integer id);
}
