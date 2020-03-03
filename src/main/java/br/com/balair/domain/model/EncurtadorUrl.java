package br.com.balair.domain.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;

import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode
@Table(name = "tb_url_encurtada")
public class EncurtadorUrl implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@NotBlank(message = "Url não pode estar em branco.")
	private String urlOriginal;
	
	@Column
	private String urlCodificada;
	
	@CreationTimestamp
	private LocalDate dtCriado;

	public EncurtadorUrl() {
	}

	public EncurtadorUrl(String urlOriginal) {
		this.urlOriginal = urlOriginal;
	}

	

	
	
}
