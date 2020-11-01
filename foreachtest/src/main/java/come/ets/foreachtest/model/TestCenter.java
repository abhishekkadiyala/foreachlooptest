package come.ets.foreachtest.model;

public class TestCenter {
	private int tcNumber;
	private String tcType;
	private String tcName;
	
	
	public TestCenter(int tcNumber, String tcType, String tcName){
		this.tcNumber = tcNumber;
		this.tcType = tcType;
		this.tcName = tcName;
		
	}
	
	
	
	public int getTcNumber() {
		return tcNumber;
	}
	public void setTcNumber(int tcNumber) {
		this.tcNumber = tcNumber;
	}
	public String getTcType() {
		return tcType;
	}
	public void setTcType(String tcType) {
		this.tcType = tcType;
	}
	public String getTcName() {
		return tcName;
	}
	public void setTcName(String tcName) {
		this.tcName = tcName;
	}
	@Override
	public String toString() {
		return "TestCenter [tcNumber=" + tcNumber + ", tcType=" + tcType + ", tcName=" + tcName + "]";
	}
	
	
	
	

}
