package id.ac.its.pbkk.pendidikan.domain;
import java.util.*;

import org.joda.time.DateTime;
import org.hibernate.annotations.Type;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="sat_pen")
public class sat_pen {

	@Id
	@Column(name="ID_SAT_MAN",length = 36)
	private String id_sat_man;
	/*
	 * Default table*/
	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;
	//###
	
	@Column(name="NM_SAT_MAN",length=255)
	private String nm_sat_man;
	
	@Column(name="A_SAT_MAN_AKTIF")
	private int a_sat_man_aktif;
	
	@Column(name="ALAMAT_SATUAN_PENDIDIKAN")
	private String alamat_satuan_pendidikan;
	
	@Column(name="TELP_SATUAN_PENDIDIKAN")
	private String telp_satuan_pendidikan;
	
	@Column(name="JENJANG_PENDIDIKAN")
	private String jenjang_pendidikan;
	
	@Column(name="BENTUK_PENDIDIKAN")
	private String bentuk_pendidikan;
	
	@Column(name="RAYON")
	private String rayon;
	
	//Constructor
	public sat_pen(){}
	
	public sat_pen(String id_sat_man,String id_sat_pen, String nm_sat_man,int a_sat_man_aktif,String alamat_satuan_pendidikan, String telp_satuan_pendidikan, String jenjang_pendidikan, String rayon,DateTime create_date)
	{
		this.setId_sat_man(id_sat_man);
		this.setNm_sat_man(nm_sat_man);
		this.setTelp_satuan_pendidikan(telp_satuan_pendidikan);
		this.setA_sat_man_aktif(a_sat_man_aktif);
		this.setAlamat_satuan_pendidikan(alamat_satuan_pendidikan);
		this.setBentuk_pendidikan(jenjang_pendidikan);
		this.setCreate_date(create_date);
		this.setRayon(rayon);
		this.setJenjang_pendidikan(jenjang_pendidikan);

	}
	/*Setter and Getter*/

	

	public String getId_sat_man() {
		return id_sat_man;
	}

	public void setId_sat_man(String id_sat_man) {
		this.id_sat_man = id_sat_man;
	}

	public boolean isSoft_delete() {
		return soft_delete;
	}

	public void setSoft_delete(boolean soft_delete) {
		this.soft_delete = soft_delete;
	}

	public DateTime getcreate_date() {
		return create_date;
	}

	public void setCreate_date(DateTime create_date) {
		this.create_date = create_date;
	}

	public String getNm_sat_man() {
		return nm_sat_man;
	}

	public void setNm_sat_man(String nm_sat_man) {
		this.nm_sat_man = nm_sat_man;
	}

	public int getA_sat_man_aktif() {
		return a_sat_man_aktif;
	}

	public void setA_sat_man_aktif(int a_sat_man_aktif) {
		this.a_sat_man_aktif = a_sat_man_aktif;
	}

	public String getAlamat_satuan_pendidikan() {
		return alamat_satuan_pendidikan;
	}

	public void setAlamat_satuan_pendidikan(String alamat_satuan_pendidikan) {
		this.alamat_satuan_pendidikan = alamat_satuan_pendidikan;
	}

	public String getTelp_satuan_pendidikan() {
		return telp_satuan_pendidikan;
	}

	public void setTelp_satuan_pendidikan(String telp_satuan_pendidikan) {
		this.telp_satuan_pendidikan = telp_satuan_pendidikan;
	}

	public String getJenjang_pendidikan() {
		return jenjang_pendidikan;
	}

	public void setJenjang_pendidikan(String jenjang_pendidikan) {
		this.jenjang_pendidikan = jenjang_pendidikan;
	}

	public String getBentuk_pendidikan() {
		return bentuk_pendidikan;
	}

	public void setBentuk_pendidikan(String bentuk_pendidikan) {
		this.bentuk_pendidikan = bentuk_pendidikan;
	}

	public String getRayon() {
		return rayon;
	}

	public void setRayon(String rayon) {
		this.rayon = rayon;
	}
	
	
}
