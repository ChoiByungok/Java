package ch09.userinfo.web;

import ch09.domain.userinfo.UserInfo;
import ch09.domain.userinfo.dao.UserInfoDao;
import ch09.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch09.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo user = new UserInfo("quddhr9523","13245","최병옥");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        }else {
            System.out.println("db not connected");
            return;
        }

        userInfoDao.insertUserInfo(user);
        userInfoDao.updateUserInfo(user);
        userInfoDao.deleteUserInfo(user);


    }
}
