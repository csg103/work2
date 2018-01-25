package com.xxx.request.user;

import com.xxx.BaseVO;

/**
 * 用户请求信息
 *
 * @author csg
 * @create 2018-01-20:14
 */

public class User_userMes  {
    private String username;
    private String usernickname;
    private String usermail;
    private String tel;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsernickname() {
        return usernickname;
    }

    public void setUsernickname(String usernickname) {
        this.usernickname = usernickname;
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }



}
