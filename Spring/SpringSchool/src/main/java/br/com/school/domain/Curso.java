package br.com.school.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcurso;
	@Column(nullable=false)
	private String titulocurso;
	@Column(nullable=false)
	private String descricao;
	@Column(nullable=false)
	private String cargahoraria;
	
	@OneToOne
	@JoinColumn(name="idarea")
	private Area idarea;
	
	@ManyToOne
	@JoinColumn(name="idunidade")
	private Unidade idunidade;

	public Curso() {
	}

	public Curso(Integer idcurso, String titulocurso, String descricao, String cargahoraria, Area area,
			Unidade unidade) {
		this.idcurso = idcurso;
		this.titulocurso = titulocurso;
		this.descricao = descricao;
		this.cargahoraria = cargahoraria;
		this.idarea = area;
		this.idunidade = unidade;
	}

	public Integer getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}

	public String getTitulocurso() {
		return titulocurso;
	}

	public void setTitulocurso(String titulocurso) {
		this.titulocurso = titulocurso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(String cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	public Area getArea() {
		return idarea;
	}

	public void setArea(Area area) {
		this.idarea = area;
	}

	public Unidade getUnidade() {
		return idunidade;
	}

	public void setUnidade(Unidade unidade) {
		this.idunidade = unidade;
	}
	
}