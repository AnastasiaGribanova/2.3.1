package web;

import web.dao.UserDaoImp;
import web.model.User;


public class Main {
    public static void main (String[] args) {
        UserDaoImp userDaoImp = new UserDaoImp();
        userDaoImp.saveUser(new User(1, "d", "df", "dd"));
    }

}
