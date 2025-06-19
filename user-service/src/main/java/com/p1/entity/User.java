package com.p1.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Column(name="fastName")
	private String fastName;
	@NotBlank
	@Column(name="lastName")
	private String lastName;
	@NotBlank
	@Email
	@Column(name="email")
	private String email;
	@NotBlank
	@Column(name="password")
	private String password;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime createDate;
	@UpdateTimestamp
	private LocalDateTime updateDate;
	
	
	public User(@NotBlank String fastName, @NotBlank String lastName, @NotBlank @Email String email,
			@NotBlank String password) {
		super();
		this.fastName = fastName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	
	public User(Long id, @NotBlank String fastName, @NotBlank String lastName, @NotBlank @Email String email,
			@NotBlank String password) {
		super();
		this.id = id;
		this.fastName = fastName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	
	public User(@NotBlank @Email String email, @NotBlank String password) {
		super();
		this.email = email;
		this.password = password;
	}	
	



}
