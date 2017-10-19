package com.ph.shopping.facade.pay.vo;

import java.io.Serializable;

public class CertificatesAuthVo implements Serializable{

	/**  
	* @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
	*/  
	private static final long serialVersionUID = 1L;

	/**
	 * 证件号码
	 */
	private String certificatesCode;
	/**
	 * 证件类型
	 */
	private Byte certificatesType;
	/**
	 * 名称
	 */
	private String certificatesName;
	/**
	 * 认证状态
	 */
	private Byte status;
	/**
	 * 操作人ID
	 */
	private String userId;
	
	public String getCertificatesCode() {
		return certificatesCode;
	}
	public void setCertificatesCode(String certificatesCode) {
		this.certificatesCode = certificatesCode;
	}
	public Byte getCertificatesType() {
		return certificatesType;
	}
	public void setCertificatesType(Byte certificatesType) {
		this.certificatesType = certificatesType;
	}
	public String getCertificatesName() {
		return certificatesName;
	}
	public void setCertificatesName(String certificatesName) {
		this.certificatesName = certificatesName;
	}
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
