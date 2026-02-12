package AbstractClass;

public abstract class C_02_ITDepartment implements C_01_Employee {
	public abstract void dept();
	public abstract void salary();
	
	@Override
	public void Setup() {
		System.out.println("setup : Dell desktop setup and additional ");
	}
	@Override
	public void support() {
		System.out.println("Support : ReliSource IT, Helpdesk");
	}
	

}
