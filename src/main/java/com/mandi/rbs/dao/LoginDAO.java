package com.mandi.rbs.dao;

import com.mandi.rbs.dto.UserDetails;

public interface LoginDAO {
    UserDetails getUserById(String userId);

}
