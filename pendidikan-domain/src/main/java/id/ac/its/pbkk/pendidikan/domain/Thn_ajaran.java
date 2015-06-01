package id.ac.its.pbkk.pendidikan.domain;

import java.util.Date;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "thn_ajaran")
public class Thn_ajaran {
	@Id
	@Column(name = "ID_THN_AJARAN", nullable = false)
	private String ID_THN_AJARAN;
	@Column(name = "THN_THN_AJARAN", nullable = false)
	private int THN_THN_AJARAN;
	/*Default Attribute*/

	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;
	//###
	
	public Thn_ajaran(){}
	
	
	public Thn_ajaran(String ID_THN_AJARAN, int THN_THN_AJARAN, Date CREATE_DATE, int SOFT_DELETE){
		this.setID_THN_AJARAN(ID_THN_AJARAN);
		this.setTHN_THN_AJARAN(THN_THN_AJARAN);
		this.setCreate_date(create_date);
		this.setSoft_delete(soft_delete);
	}

	public String getID_THN_AJARAN() {
		return ID_THN_AJARAN;
	}
	public void setID_THN_AJARAN(String ID_THN_AJARAN) {
		this.ID_THN_AJARAN = ID_THN_AJARAN;
	}
	public int getTHN_THN_AJARAN() {
		return THN_THN_AJARAN;
	}
	public void setTHN_THN_AJARAN(int THN_THN_AJARAN) {
		this.THN_THN_AJARAN = THN_THN_AJARAN;
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
