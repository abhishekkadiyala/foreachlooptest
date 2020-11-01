package come.ets.foreachtest.model;

public class TestCenterAdmin {
	TestCenter tc;
	String admin;
	
	public TestCenterAdmin(TestCenter tc, String admin){
		this.tc = tc;
		this.admin = admin;
	}
	
	
	public TestCenter getTc() {
		return tc;
	}
	public void setTc(TestCenter tc) {
		this.tc = tc;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "TestCenterAdmin [tc=" + tc + ", admin=" + admin + "]";
	}
	
	

}
