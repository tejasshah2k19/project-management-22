package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class ProjectEntity {

	@Id
	@GeneratedValue
	Long projectId;

	String title;
	String description;
	String technology;
	Long estimatedHours;
	Long utilizedHours;
	Date startDate;
	Date completionDate;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Long getEstimatedHours() {
		return estimatedHours;
	}

	public void setEstimatedHours(Long estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public Long getUtilizedHours() {
		return utilizedHours;
	}

	public void setUtilizedHours(Long utilizedHours) {
		this.utilizedHours = utilizedHours;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

}
