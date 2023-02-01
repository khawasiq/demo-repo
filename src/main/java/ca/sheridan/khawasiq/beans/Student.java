package ca.sheridan.khawasiq.beans;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component 
//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Student {
	private Long _sId;
	private String _fN;
	private String _lN;
	private String _country;
	private String _email;
	private LocalDate _date;
	
	
	
	/*public Student() {
		this(1235L, "Mike", "Tyson");
	}
	public Student(Long sId, String fN, String lN) {
		super();
		this.sId = sId;
		this.fN = fN;
		this.lN = lN;
	}
	public Long getsId() {
		return sId;
	}
	public void setsId(Long sId) {
		this.sId = sId;
	}
	public String getfN() {
		return fN;
	}
	public void setfN(String fN) {
		this.fN = fN;
	}
	public String getlN() {
		return lN;
	}
	public void setlN(String lN) {
		this.lN = lN;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", fN=" + fN + ", lN=" + lN + "]";
	}*/
	
	
	

}
