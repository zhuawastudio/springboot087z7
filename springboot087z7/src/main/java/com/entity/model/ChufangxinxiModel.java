package com.entity.model;

import com.entity.ChufangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 处方信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-10 10:19:26
 */
public class ChufangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 就诊卡号
	 */
	
	private String jiuzhenkahao;
		
	/**
	 * 用户金额
	 */
	
	private Float yonghujine;
		
	/**
	 * 处方内容
	 */
	
	private String chufangneirong;
		
	/**
	 * 药品编号
	 */
	
	private String yaopinbianhao;
		
	/**
	 * 药品名称
	 */
	
	private String yaopinmingcheng;
		
	/**
	 * 药品价格
	 */
	
	private Float yaopinjiage;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 总费用
	 */
	
	private Float jine;
		
	/**
	 * 医嘱
	 */
	
	private String yizhu;
		
	/**
	 * 处方时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chufangshijian;
		
	/**
	 * 医生工号
	 */
	
	private String yishenggonghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 职位
	 */
	
	private String zhiwei;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：就诊卡号
	 */
	 
	public void setJiuzhenkahao(String jiuzhenkahao) {
		this.jiuzhenkahao = jiuzhenkahao;
	}
	
	/**
	 * 获取：就诊卡号
	 */
	public String getJiuzhenkahao() {
		return jiuzhenkahao;
	}
				
	
	/**
	 * 设置：用户金额
	 */
	 
	public void setYonghujine(Float yonghujine) {
		this.yonghujine = yonghujine;
	}
	
	/**
	 * 获取：用户金额
	 */
	public Float getYonghujine() {
		return yonghujine;
	}
				
	
	/**
	 * 设置：处方内容
	 */
	 
	public void setChufangneirong(String chufangneirong) {
		this.chufangneirong = chufangneirong;
	}
	
	/**
	 * 获取：处方内容
	 */
	public String getChufangneirong() {
		return chufangneirong;
	}
				
	
	/**
	 * 设置：药品编号
	 */
	 
	public void setYaopinbianhao(String yaopinbianhao) {
		this.yaopinbianhao = yaopinbianhao;
	}
	
	/**
	 * 获取：药品编号
	 */
	public String getYaopinbianhao() {
		return yaopinbianhao;
	}
				
	
	/**
	 * 设置：药品名称
	 */
	 
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
				
	
	/**
	 * 设置：药品价格
	 */
	 
	public void setYaopinjiage(Float yaopinjiage) {
		this.yaopinjiage = yaopinjiage;
	}
	
	/**
	 * 获取：药品价格
	 */
	public Float getYaopinjiage() {
		return yaopinjiage;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：总费用
	 */
	 
	public void setJine(Float jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：总费用
	 */
	public Float getJine() {
		return jine;
	}
				
	
	/**
	 * 设置：医嘱
	 */
	 
	public void setYizhu(String yizhu) {
		this.yizhu = yizhu;
	}
	
	/**
	 * 获取：医嘱
	 */
	public String getYizhu() {
		return yizhu;
	}
				
	
	/**
	 * 设置：处方时间
	 */
	 
	public void setChufangshijian(Date chufangshijian) {
		this.chufangshijian = chufangshijian;
	}
	
	/**
	 * 获取：处方时间
	 */
	public Date getChufangshijian() {
		return chufangshijian;
	}
				
	
	/**
	 * 设置：医生工号
	 */
	 
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	
	/**
	 * 获取：医生工号
	 */
	public String getYishenggonghao() {
		return yishenggonghao;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：职位
	 */
	 
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
			
}
