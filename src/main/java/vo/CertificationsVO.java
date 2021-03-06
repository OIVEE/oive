package vo;

public class CertificationsVO extends ProfileVO {
    private String certName;
    private String certNumber;
    private String grade;
    private String aquiredDate;
    private String expDate;
    private String certtype;
    private String fileId;
    private String orgName;
    private String certComments;

	public String getCertName() {
		return certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertNumber() {
		return certNumber;
	}
	public void setCertNumber(String certNumber) {
		this.certNumber = certNumber;
	}
	
	
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getCertComments() {
		return certComments;
	}
	public void setCertComments(String certComments) {
		this.certComments = certComments;
	}
	public String getAquiredDate() {
		return aquiredDate;
	}
	public void setAquiredDate(String aquiredDate) {
		this.aquiredDate = aquiredDate;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getCerttype() {
		return certtype;
	}
	public void setCerttype(String certtype) {
		this.certtype = certtype;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getComments() {
		return certComments;
	}
	public void setComments(String comments) {
		this.certComments = comments;
	}

    
}
