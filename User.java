package dev.lpf.demo.aop.user.model;


import java.util.Date;

/**
 * Table: t_user
 */
public class User {
    /**
     * Column: user_id
     * Remark: 用户id
     */
    private Long userId;

    /**
     * Column: user_name
     * Remark: 用户名
     */
    private String userName;

    /**
     * Column: password
     * Remark: 密码
     */
    private String password;

    /**
     * Column: age
     * Remark: 年龄
     */
    private Integer age;

    /**
     * Column: sex
     * Remark: 性别
     */
    private Integer sex;

    /**
     * Column: email
     * Remark: 邮箱
     */
    private String email;

    /**
     * Column: createTime
     */
    private Date createtime;

    /**
     * Column: updateTime
     */
    private Date updatetime;

    /**
     * Column: memo
     * Remark: 备注
     */
    private String memo;

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", userName='" + userName + '\'' + ", password='" + password + '\'' +
                ", age=" + age + ", sex=" + sex + ", email='" + email + '\'' + ", createtime=" + createtime + ", " +
                "updatetime=" + updatetime + ", memo='" + memo + '\'' + '}';
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
