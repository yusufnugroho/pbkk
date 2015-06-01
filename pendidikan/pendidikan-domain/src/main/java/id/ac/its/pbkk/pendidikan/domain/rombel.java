package id.ac.its.pbkk.pendidikan.domain;

import java.util.*;

import org.joda.time.DateTime;
import org.hibernate.annotations.Type;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="rombel")
public class rombel {
	//Constructor
	public rombel(){}
	
	
	public rombel(String id_rombel, ptk id_ptk, mata_pelajaran id_matpel,
			smt id_smt, String nm_rommbel, String jml_rommbel,
			String pertemuan_dalam_seminggu, boolean soft_delete,
			DateTime create_date) {
		this.setCreate_date(create_date);
		this.setId_matpel(id_matpel);
		this.setId_ptk(id_ptk);
		this.setId_rombel(id_rombel);
		this.setId_smt(id_smt);
		this.setJml_rommbel(jml_rommbel);
		this.setNm_rommbel(nm_rommbel);
		this.setNm_rommbel(nm_rommbel);
		this.setPertemuan_dalam_seminggu(pertemuan_dalam_seminggu);
	}


	@Id
	@Column(name = "ID_ROMBEL")
	private String id_rombel;
	
	@JoinColumn(name="ID_PTK")
	@ManyToOne(fetch = FetchType.LAZY)
	private ptk id_ptk;
	
	@JoinColumn(name="ID_MATPEL")
	@ManyToOne(fetch = FetchType.LAZY)
	private mata_pelajaran id_matpel;
	
	@JoinColumn(name="ID_SMT")
	@ManyToOne(fetch = FetchType.LAZY)
	private smt id_smt;
	
	@Column(name="NM_ROMMBEL")
	private String nm_rommbel;
	
	@Column(name="JML_ROMMBEL")
	private String jml_rommbel;
	
	@Column(name="PERTEMUAN_DALAM_SEMINGGU")
	private String pertemuan_dalam_seminggu;
	
	/*Default Attribute*/

	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;
	//###

	
	//Setter and Getter
	public String getId_rombel() {
		return id_rombel;
	}

	public void setId_rombel(String id_rombel) {
		this.id_rombel = id_rombel;
	}

	public ptk getId_ptk() {
		return id_ptk;
	}

	public void setId_ptk(ptk id_ptk) {
		this.id_ptk = id_ptk;
	}

	public mata_pelajaran getId_matpel() {
		return id_matpel;
	}

	public void setId_matpel(mata_pelajaran id_matpel) {
		this.id_matpel = id_matpel;
	}

	public smt getId_smt() {
		return id_smt;
	}

	public void setId_smt(smt id_smt) {
		this.id_smt = id_smt;
	}

	public String getNm_rommbel() {
		return nm_rommbel;
	}

	public void setNm_rommbel(String nm_rommbel) {
		this.nm_rommbel = nm_rommbel;
	}

	public String getJml_rommbel() {
		return jml_rommbel;
	}

	public void setJml_rommbel(String jml_rommbel) {
		this.jml_rommbel = jml_rommbel;
	}

	public String getPertemuan_dalam_seminggu() {
		return pertemuan_dalam_seminggu;
	}

	public void setPertemuan_dalam_seminggu(String pertemuan_dalam_seminggu) {
		this.pertemuan_dalam_seminggu = pertemuan_dalam_seminggu;
	}

	public boolean isSoft_delete() {
		return soft_delete;
	}

	public void setSoft_delete(boolean soft_delete) {
		this.soft_delete = soft_delete;
	}

	public DateTime getCreate_date() {
		return create_date;
	}

	public void setCreate_date(DateTime create_date) {
		this.create_date = create_date;
	}

	
	

}
