package com.example.inquiry.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name="inquiry")
public class Inquiry {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String contents;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	public Inquiry(){};

	public Inquiry(Long id, String name, String email, String contents, Date created) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contents = contents;
		this.created = created;
	}
}
