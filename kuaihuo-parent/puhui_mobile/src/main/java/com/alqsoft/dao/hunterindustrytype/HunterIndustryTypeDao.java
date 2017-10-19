package com.alqsoft.dao.hunterindustrytype;

import java.util.List;
import java.util.Map;

import org.alqframework.orm.mybatis.MyBatisRepository;
import org.springframework.data.repository.query.Param;

@MyBatisRepository
public interface HunterIndustryTypeDao {
	/**
     * 根据分类获取批发商信息
     */
	public List<Map<String, Object>> findHunterByiIndustryId(Map<String, Object> map);
	/**
     * 获取一级分类下的所有批发商信息
     */
	public List<Map<String, Object>> findAllHunterByiIndustryId(Map<String, Object> map);
	/**
     * 根据批发商id获取二级分类标签
     */
	public List<Map<String, Object>> findhHunterLabel(@Param("hunterId")Long hunterId);
	public List<Map<String, Object>> findAllHunter(Map<String, Object> map);

}
