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
@Table(name = "registrasi_pd")
public class registrasi_pd {
	//Constructor
	public registrasi_pd(){}
	
	
	public registrasi_pd(String id_registrasi, sat_pen id_sat_man, pd id_pd,
			DateTime tanggal_masuk, DateTime tanggal_keluar,
			DateTime create_date) {
		this.setCreate_date(create_date);
		this.setId_pd(id_pd);
		this.setId_registrasi(id_registrasi);
		this.setId_sat_man(id_sat_man);
		this.setTanggal_keluar(tanggal_keluar);
		this.setTanggal_masuk(tanggal_masuk);
	}


	@Id 
	@Column(name="ID_REGISTRASI")
	private String id_registrasi;
	
	@JoinColumn(name="ID_SAT_MAN")
	@ManyToOne(fetch = FetchType.LAZY)
	private sat_pen id_sat_man;
	
	@JoinColumn(name="ID_PD")
	@ManyToOne(fetch = FetchType.LAZY)
	private pd id_pd;
	
	@Column(name="TANGGAL_MASUK")
	private DateTime tanggal_masuk;
	
	@Column(name="TANGGAL_KELUAR")
	private DateTime tanggal_keluar;
	
	/*
	 * Default table*/
	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;

	
	//Setter and Getter
	
	
	public String getId_registrasi() {
		return id_registrasi;
	}

	public void setId_registrasi(String id_registrasi) {
		this.id_registrasi = id_registrasi;
	}

	public sat_pen getId_sat_man() {
		return id_sat_man;
	}

	public void setId_sat_man(sat_pen id_sat_man) {
		this.id_sat_man = id_sat_man;
	}

	public pd getId_pd() {
		return id_pd;
	}

	public void setId_pd(pd id_pd) {
		this.id_pd = id_pd;
	}

	public DateTime getTanggal_masuk() {
		return tanggal_masuk;
	}

	public void setTanggal_masuk(DateTime tanggal_masuk) {
		this.tanggal_masuk = tanggal_masuk;
	}

	public DateTime getTanggal_keluar() {
		return tanggal_keluar;
	}

	public void setTanggal_keluar(DateTime tanggal_keluar) {
		this.tanggal_keluar = tanggal_keluar;
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
