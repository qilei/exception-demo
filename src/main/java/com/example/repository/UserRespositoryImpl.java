package com.example.repository;

import com.example.exception.AppError;
import com.example.exception.AppException;
import com.example.domain.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * Created by qilei on 17/3/29.
 */
@Repository
public class UserRespositoryImpl implements UserRespository {

  @Override
  public User findOne(Integer id) {
    User user = getUser(id);
    if (user == null) {
      throw new AppException("用户未找到，id:" + id, AppError.USER_NOT_FOUND);
    }
    return user;
  }

  private User getUser(Integer id) {
    List<User> users = new ArrayList<>();
    users.add(new User(1, "张三"));
    users.add(new User(2, "李四"));
    return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
  }
}
