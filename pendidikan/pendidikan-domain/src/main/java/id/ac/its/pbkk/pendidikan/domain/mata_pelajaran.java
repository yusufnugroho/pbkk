package id.ac.its.pbkk.pendidikan.domain;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import java.util.*;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "mata_pelajaran")
public class mata_pelajaran {
	public mata_pelajaran(){
		
	}
	

	public mata_pelajaran(String id_matpel, String nama_matpel,
			DateTime create_date, sat_pen id_sat_man) {
		this.setCreate_date(create_date);
		this.setId_matpel(id_matpel);
		this.setId_sat_man(id_sat_man);
		this.setNama_matpel(nama_matpel);
	}


	@Id
	@Column(name="ID_MATPEL")
	private String id_matpel;
	
	@Column(name="NAMA_MATPEL")
	private String nama_matpel;
	
	/*Default Attribute*/

	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;
	//###
	
	//Relation
	@JoinColumn(name="ID_SAT_MAN",nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private sat_pen id_sat_man;

	//Setter and Getter
	public String getId_matpel() {
		return id_matpel;
	}

	public void setId_matpel(String id_matpel) {
		this.id_matpel = id_matpel;
	}

	public String getNama_matpel() {
		return nama_matpel;
	}

	public void setNama_matpel(String nama_matpel) {
		this.nama_matpel = nama_matpel;
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

	public sat_pen getId_sat_man() {
		return id_sat_man;
	}

	public void setId_sat_man(sat_pen id_sat_man) {
		this.id_sat_man = id_sat_man;
	}
	
	

	
	
	
	
	
	

}
