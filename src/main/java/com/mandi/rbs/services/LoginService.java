package com.mandi.rbs.services;

import com.mandi.rbs.dto.UserDetails;
import com.mandi.rbs.formBeans.LoginUser;

public interface LoginService {
    UserDetails getUserById(String userId);

}
