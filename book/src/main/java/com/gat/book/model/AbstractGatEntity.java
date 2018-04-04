package com.gat.book.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractGatEntity.
 */
@MappedSuperclass
public abstract class AbstractGatEntity {
	
	protected Date createDate;
	
	protected Date updateDate;

    @Column(name = "CreateDate")
    @CreationTimestamp
    @JsonIgnore
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

    @Column(name = "UpdateDate")
    @UpdateTimestamp
    @JsonIgnore
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}

