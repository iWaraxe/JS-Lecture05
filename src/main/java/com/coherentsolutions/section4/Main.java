package com.coherentsolutions.section4;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        user.setStatus(UserStatus.ACTIVE);

        user.setStatus(UserStatus.INITIAL);
        //UserStatus userStatus = new UserStatus(42);
        UserStatus userStatus = UserStatus.DELETED;
    }
}
