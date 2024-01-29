package com.coherentsolutions.section4;

import com.google.common.base.Preconditions;

import java.util.List;

public class User {

    private UserStatus status;
    // 1 - INITIAL, 2 - ACTIVE, 3 - DELETED


    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }
}
