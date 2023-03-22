package com.embraer.backend.serviceBulletin.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.embraer.backend.chassis.entity.Chassis;
import com.embraer.backend.permission.entity.Permission;
import com.embraer.backend.user.entity.User;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="SERVICE_BULLETIN")
public class ServiceBulletin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SB_ID")
	private Long serviceBulletinId;
	
	@Column(name="SB_NAME")
	@NotNull
	private String serviceBulletinName;
	
	@Column(name="SB_DTREGISTER")
	@UpdateTimestamp
	private Timestamp serviceBulletinDtRegister;
	
	@Column(name="SB_STATUSSERVICE")
	@NotNull
	private String serviceBulletinStatus;
	
	@Column(name="SB_PARSERVICE")
	private String serviceBulletinPart;
	
	@JoinColumn(name="CHASSI_ID")
	@ManyToOne(fetch = FetchType.LAZY)
	private Chassis chassiId;
	
	@JoinColumn(name="USER_ID_REGISTER")
	@ManyToOne(fetch = FetchType.LAZY)
	private User userRegister;

	@JoinColumn(name="USER_ID_CHANGE")
	@ManyToOne(fetch = FetchType.LAZY)
	private User userChange;
	
	
}
