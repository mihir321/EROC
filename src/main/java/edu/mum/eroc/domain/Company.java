package edu.mum.eroc.domain;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROC_COMPANY")
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "COM_ID")
	private long companyId;
	
	@Column(name="COM_REG_ID")
	private String regId;
	
	@Column(name = "COM_NAME")
	private String companyName;
	@Column(name = "COM_REG_DATE")
	private Date registationDate;

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getRegistationDate() {
		return registationDate;
	}

	public void setRegistationDate(Date registationDate) {
		this.registationDate = registationDate;
	}

}
