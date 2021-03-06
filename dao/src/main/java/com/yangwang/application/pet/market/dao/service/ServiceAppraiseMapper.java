package com.yangwang.application.pet.market.dao.service;

import com.yangwang.application.pet.market.model.service.ServiceAppraise;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *
 * </p>
 *
 * @return
 * @author LiuXiangLin
 * @date 15:41 2020/7/10
 **/
@Mapper
public interface ServiceAppraiseMapper {

    /**
     * <p>
     * 保存一条数据
     * </p>
     *
     * @param serviceAppraise 服务评价对象
     * @return int
     * @author LiuXiangLin
     * @date 9:26 2020/3/24
     **/
    int save(ServiceAppraise serviceAppraise);

    /**
     * <p>
     * 通过评价住家删除数据
     * </p>
     *
     * @param serviceAppraiseNo 服务评价
     * @return int
     * @author LiuXiangLin
     * @date 9:26 2020/3/24
     **/
    int delete(int serviceAppraiseNo);

    /**
     * <p>
     * 通过评价对象查询评价
     * </p>
     *
     * @param serviceAppraise 评价对象
     * @return com.yangwang.application.pet.market.model.service.ServiceAppraise
     * @author LiuXiangLin
     * @date 9:42 2020/3/24
     **/
    ServiceAppraise getByAppraise(ServiceAppraise serviceAppraise);

    /**
     * <p>
     * 通过评价主键查询评价
     * </p>
     *
     * @param serviceAppraiseNo 评价主键
     * @return com.yangwang.application.pet.market.model.service.ServiceAppraise
     * @author LiuXiangLin
     * @date 9:48 2020/3/24
     **/
    ServiceAppraise get(int serviceAppraiseNo);

    /**
     * <p>
     * 通过商品编号查询评价总数
     * </p>
     *
     * @param itemNo 商品编号
     * @return int
     * @author LiuXiangLin
     * @date 10:26 2020/3/24
     **/
    int countByServiceId(int serviceId);

    /**
     * <p>
     * 通过商品编号以及星级查询评价数量
     * </p>
     *
     * @param serviceID    服务编号
     * @param praiseDegree 评价星级
     * @return int
     * @author LiuXiangLin
     * @date 10:32 2020/3/24
     **/
    int countByServiceNoAndUpPraiseDegree(int serviceId, int praiseDegree);
}
