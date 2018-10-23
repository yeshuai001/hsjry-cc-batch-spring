package com.batch.dao.mapper;

import com.batch.dao.model.MyModel;
import com.batch.dao.model.MyModelExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_cc_sms_sign
     *
     * @mbg.generated Mon Aug 27 08:51:14 CST 2018
     */
    long countByExample(MyModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_cc_sms_sign
     *
     * @mbg.generated Mon Aug 27 08:51:14 CST 2018
     */
    int deleteByExample(MyModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_cc_sms_sign
     *
     * @mbg.generated Mon Aug 27 08:51:14 CST 2018
     */
    int deleteByPrimaryKey(Integer signId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_cc_sms_sign
     *
     * @mbg.generated Mon Aug 27 08:51:14 CST 2018
     */
    int insert(MyModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_cc_sms_sign
     *
     * @mbg.generated Mon Aug 27 08:51:14 CST 2018
     */
    int insertSelective(MyModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_cc_sms_sign
     *
     * @mbg.generated Mon Aug 27 08:51:14 CST 2018
     */
    List<MyModel> selectByExample(MyModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_cc_sms_sign
     *
     * @mbg.generated Mon Aug 27 08:51:14 CST 2018
     */
    MyModel selectByPrimaryKey(Integer signId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_cc_sms_sign
     *
     * @mbg.generated Mon Aug 27 08:51:14 CST 2018
     */
    int updateByExampleSelective(@Param("record") MyModel record, @Param("example") MyModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_cc_sms_sign
     *
     * @mbg.generated Mon Aug 27 08:51:14 CST 2018
     */
    int updateByExample(@Param("record") MyModel record, @Param("example") MyModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_cc_sms_sign
     *
     * @mbg.generated Mon Aug 27 08:51:14 CST 2018
     */
    int updateByPrimaryKeySelective(MyModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_cc_sms_sign
     *
     * @mbg.generated Mon Aug 27 08:51:14 CST 2018
     */
    int updateByPrimaryKey(MyModel record);
}