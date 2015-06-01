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
@Table(name = "nilai_semester")

public class nilai_semester {
	//Constructor
	public nilai_semester(){}
	
	
	public nilai_semester(String id_nilai_semester, mata_pelajaran id_matpel,
			Nilai_Akhir id_nilai_akhir, int nilai_mata_pelajaran_penge,
			int nilai_mata_pelajaran_keterampilan,
			int nilai_mata_pelajaran_sikap, DateTime create_date) 
	{
		this.setCreate_date(create_date);
		this.setId_matpel(id_matpel);
		this.setId_nilai_akhir(id_nilai_akhir);
		this.setId_nilai_semester(id_nilai_semester);
		this.setNilai_mata_pelajaran_keterampilan(nilai_mata_pelajaran_keterampilan);
		this.setNilai_mata_pelajaran_penge(nilai_mata_pelajaran_penge);
		this.setNilai_mata_pelajaran_sikap(nilai_mata_pelajaran_sikap);
	}


	@Id
	@Column(name="ID_NILAI_SEMESTER")
	private String id_nilai_semester;
	
	@JoinColumn(name="ID_MATPEL")
	@ManyToOne(fetch = FetchType.LAZY)
	private mata_pelajaran id_matpel;
	
	@JoinColumn(name="ID_NILAI_AKHIR")
	@ManyToOne(fetch = FetchType.LAZY)
	private Nilai_Akhir id_nilai_akhir;
	
	@Column(name="NILAI_MATA_PELAJARAN_PENGE")
	private int nilai_mata_pelajaran_penge;

	@Column(name="NILAI_MATA_PELAJARAN_KETERAMPILAN")
	private int nilai_mata_pelajaran_keterampilan;	
	
	@Column(name="NILAI_MATA_PELAJARAN_SIKAP")
	private int nilai_mata_pelajaran_sikap;
	
	/*Default Attribute*/

	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;
	//###

	//Setter and Getter
	public String getId_nilai_semester() {
		return id_nilai_semester;
	}

	public void setId_nilai_semester(String id_nilai_semester) {
		this.id_nilai_semester = id_nilai_semester;
	}

	public mata_pelajaran getId_matpel() {
		return id_matpel;
	}

	public void setId_matpel(mata_pelajaran id_matpel) {
		this.id_matpel = id_matpel;
	}

	public Nilai_Akhir getId_nilai_akhir() {
		return id_nilai_akhir;
	}

	public void setId_nilai_akhir(Nilai_Akhir id_nilai_akhir) {
		this.id_nilai_akhir = id_nilai_akhir;
	}

	public int getNilai_mata_pelajaran_penge() {
		return nilai_mata_pelajaran_penge;
	}

	public void setNilai_mata_pelajaran_penge(int nilai_mata_pelajaran_penge) {
		this.nilai_mata_pelajaran_penge = nilai_mata_pelajaran_penge;
	}

	public int getNilai_mata_pelajaran_keterampilan() {
		return nilai_mata_pelajaran_keterampilan;
	}

	public void setNilai_mata_pelajaran_keterampilan(
			int nilai_mata_pelajaran_keterampilan) {
		this.nilai_mata_pelajaran_keterampilan = nilai_mata_pelajaran_keterampilan;
	}

	public int getNilai_mata_pelajaran_sikap() {
		return nilai_mata_pelajaran_sikap;
	}

	public void setNilai_mata_pelajaran_sikap(int nilai_mata_pelajaran_sikap) {
		this.nilai_mata_pelajaran_sikap = nilai_mata_pelajaran_sikap;
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
