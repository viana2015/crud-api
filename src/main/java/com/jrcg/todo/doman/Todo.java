package com.jrcg.todo.doman;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "todo")
@Getter
@Setter
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String descricao;
	
	@Column(name = "data_cadastro")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime dataCadastro;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime conclusao;
	
	private Boolean finalizado;
	
	@PrePersist
	public void antesDeSalvar() {
		setDataCadastro(LocalDateTime.now());
		
	}
}
