package com.yyxiazai.service;

import com.yyxiazai.domain.User;

public class UserService extends BaseService<User> {

  public User queryByName (String name) {
    User user = new User();
    user.setUsername(name);

    return this.queryOne(user);
  }
}
