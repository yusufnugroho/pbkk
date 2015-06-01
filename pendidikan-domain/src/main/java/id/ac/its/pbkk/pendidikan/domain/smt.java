package id.ac.its.pbkk.pendidikan.domain;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
@Entity
@Table(name = "smt")
public class smt {
	public smt(){}
	
	
	public smt(String id_smt, String nm_smt, DateTime create_date,
			Thn_ajaran id_thn_ajaran) {
		this.setCreate_date(create_date);
		this.setId_smt(id_smt);
		this.setId_thn_ajaran(id_thn_ajaran);
		this.setNm_smt(nm_smt);
	}


	@Id
	@Column(name="ID_SMT")
	private String id_smt;
	
	@Column(name="NM_SMT")
	private String nm_smt;
	
	/*Default Attribute*/

	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;
	//###
	
	//Relation
	@JoinColumn(name="ID_THN_AJARAN",nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Thn_ajaran id_thn_ajaran;

	
	//Setter and Getter
	public String getId_smt() {
		return id_smt;
	}

	public void setId_smt(String id_smt) {
		this.id_smt = id_smt;
	}

	public String getNm_smt() {
		return nm_smt;
	}

	public void setNm_smt(String nm_smt) {
		this.nm_smt = nm_smt;
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

	public Thn_ajaran getId_thn_ajaran() {
		return id_thn_ajaran;
	}

	public void setId_thn_ajaran(Thn_ajaran id_thn_ajaran) {
		this.id_thn_ajaran = id_thn_ajaran;
	}
		
		


}
