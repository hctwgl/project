package com.ph.shopping.facade.member.vo;

import com.ph.shopping.facade.member.dto.StoreManagerDTO;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wudi on 2017/9/26.
 */
public class StoreMangerImageVO extends StoreManagerDTO implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = -318645219409461501L;



    /** 图片地址 */
    private String url;

    /** 序列 */
    private Integer sort;

    /** 图片类型 1 营业执照图片 2 身份证图片 3 门店照片 */
    private Integer type;

    /** 代理商id 关联代理商表主键id */
    private Long agentId;

    /** 修改时间 */
    private Date updateTime;

    /** 创建时间 */
    private Date createTime;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
