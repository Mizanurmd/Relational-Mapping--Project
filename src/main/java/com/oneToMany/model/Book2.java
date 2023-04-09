package com.oneToMany.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="bktab")
public class Book2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bid;
	private String bname;

}
