package com.bdqn.pagedemo.util;

import java.util.*;

public class Page<T> {
	private Integer pageNo;
	private Integer pageSize;
	private Integer totalCount;
	private Integer pageCount;
	private List<T> infoList;
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
		this.pageCount = this.totalCount%this.pageSize==0?this.totalCount/this.pageSize
				:this.totalCount/this.pageSize+1;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public List<T> getInfoList() {
		return infoList;
	}
	public void setInfoList(List<T> infoList) {
		this.infoList = infoList;
	}
}
