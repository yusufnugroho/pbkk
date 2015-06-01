package id.ac.its.pbkk.pendidikan.domain;

import java.util.Date;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ptk")
public class ptk {
	@Id
	@Column(name="ID_PTK")
	private int id_ptk;
	
	@Column(name="NIP_PTK")
	private String nip_ptk;
	
	@Column(name="NM_PTK")
	private String nm_ptk;
	
	/*Default Attribute*/

	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;
	//###

	public int getId_ptk() {
		return id_ptk;
	}

	public void setId_ptk(int id_ptk) {
		this.id_ptk = id_ptk;
	}

	public String getNip_ptk() {
		return nip_ptk;
	}

	public void setNip_ptk(String nip_ptk) {
		this.nip_ptk = nip_ptk;
	}

	public String getNm_ptk() {
		return nm_ptk;
	}

	public void setNm_ptk(String nm_ptk) {
		this.nm_ptk = nm_ptk;
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
	public ptk(){}
	public ptk(int id_ptk, String nip_ptk, String nm_ptk, DateTime create_date) {
		
		this.setCreate_date(create_date);
		this.setId_ptk(id_ptk);
		this.setNip_ptk(nip_ptk);

	}
	
	
}
