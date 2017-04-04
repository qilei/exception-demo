package com.example.service;

import com.example.domain.User;
import com.example.repository.UserRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qilei on 17/3/29.
 */
@Service
public class UserServiceImpl implements UserService {

  private Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

  @Autowired
  private UserRespository userRespository;

  @Override
  public User findOne(Integer id) {
    User user = userRespository.findOne(id);
    return user;
  }
}
