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
@Table (name="anggota_rombel")
public class anggota_rombel {
	//Constructor
	public anggota_rombel(){}
	
	public anggota_rombel(String id_anggota_rombel, rombel id_rombel, pd id_pd,
			DateTime create_date) {
		this.setCreate_date(create_date);
		this.setId_anggota_rombel(id_anggota_rombel);
		this.setId_pd(id_pd);
		this.setId_rombel(id_rombel);

	}

	@Id
	@Column(name="ID_ANGGOTA_ROMBEL")
	private String id_anggota_rombel;
	
	@JoinColumn(name="ID_ROMBEL")
	@ManyToOne(fetch = FetchType.LAZY)
	private rombel id_rombel;
	
	@JoinColumn(name="ID_PD")
	@ManyToOne(fetch = FetchType.LAZY)
	private pd id_pd;
	
	/*Default Attribute*/

	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;
	//###

	//setter and getter
	

	public String getId_anggota_rombel() {
		return id_anggota_rombel;
	}

	public void setId_anggota_rombel(String id_anggota_rombel) {
		this.id_anggota_rombel = id_anggota_rombel;
	}

	public rombel getId_rombel() {
		return id_rombel;
	}

	public void setId_rombel(rombel id_rombel) {
		this.id_rombel = id_rombel;
	}

	public pd getId_pd() {
		return id_pd;
	}

	public void setId_pd(pd id_pd) {
		this.id_pd = id_pd;
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
