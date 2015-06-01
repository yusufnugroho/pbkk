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
@Table(name = "pd")

public class pd {

	//Constructor
	public pd(){}
	
	
	public pd(String id_pd, wali_pd id_wali, String nim_pd, String nm_pd,
			String al_pd, String tmpt_pd, DateTime thllhr_pd, String jk_pd,
			String golongan_darah_peserta_didik, String agama_pd,
			DateTime create_date) {
		this.setAgama_pd(agama_pd);
		this.setAl_pd(al_pd);
		this.setCreate_date(create_date);
		this.setGolongan_darah_peserta_didik(golongan_darah_peserta_didik);
		this.setId_pd(id_pd);
		this.setId_wali(id_wali);
		this.setJk_pd(jk_pd);
		this.setNim_pd(nim_pd);
		this.setNm_pd(nm_pd);
		this.setThllhr_pd(thllhr_pd);
		this.setTmpt_pd(tmpt_pd);
	}


	@Id
	@Column(name="ID_PD")
	private String id_pd;
	
	@JoinColumn(name="ID_WALI")
	@ManyToOne(fetch = FetchType.LAZY)
	private wali_pd id_wali;
	
	@Column(name="NIM_PD")
	private String nim_pd;
	
	@Column(name="NM_PD")
	private String nm_pd;
	
	@Column(name="AL_PD")
	private String al_pd;
	
	@Column(name="TMPT_PD")
	private String tmpt_pd;
	
	@Column(name="TGLLHR_PD")
	private DateTime thllhr_pd;
	
	@Column(name="JK_PD")
	private String jk_pd;
	
	@Column(name="GOLONGAN_DARAH_PESERTA_DIDIK")
	private String golongan_darah_peserta_didik;
	
	@Column(name="AGAMA_PD")
	private String agama_pd;
	/*Default Attribute*/

	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;
	//###
	//Setter and Getter
	
	public String getId_pd() {
		return id_pd;
	}

	public void setId_pd(String id_pd) {
		this.id_pd = id_pd;
	}

	public wali_pd getId_wali() {
		return id_wali;
	}

	public void setId_wali(wali_pd id_wali) {
		this.id_wali = id_wali;
	}

	public String getNim_pd() {
		return nim_pd;
	}

	public void setNim_pd(String nim_pd) {
		this.nim_pd = nim_pd;
	}

	public String getNm_pd() {
		return nm_pd;
	}

	public void setNm_pd(String nm_pd) {
		this.nm_pd = nm_pd;
	}

	public String getAl_pd() {
		return al_pd;
	}

	public void setAl_pd(String al_pd) {
		this.al_pd = al_pd;
	}

	public String getTmpt_pd() {
		return tmpt_pd;
	}

	public void setTmpt_pd(String tmpt_pd) {
		this.tmpt_pd = tmpt_pd;
	}

	public DateTime getThllhr_pd() {
		return thllhr_pd;
	}

	public void setThllhr_pd(DateTime thllhr_pd) {
		this.thllhr_pd = thllhr_pd;
	}

	public String getJk_pd() {
		return jk_pd;
	}

	public void setJk_pd(String jk_pd) {
		this.jk_pd = jk_pd;
	}

	public String getGolongan_darah_peserta_didik() {
		return golongan_darah_peserta_didik;
	}

	public void setGolongan_darah_peserta_didik(String golongan_darah_peserta_didik) {
		this.golongan_darah_peserta_didik = golongan_darah_peserta_didik;
	}

	public String getAgama_pd() {
		return agama_pd;
	}

	public void setAgama_pd(String agama_pd) {
		this.agama_pd = agama_pd;
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
