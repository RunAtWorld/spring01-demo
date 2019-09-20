package dev.lpf.demo.aop.user;


public interface UserMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(User record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(User record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    User selectByPrimaryKey(Long userId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeyWithBLOBs(User record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(User record);
}