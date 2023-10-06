
public class Program {
	public static void main(String[] args) {

		ComponentApp cA = new ComponentApp("COM");
		DataApp dA = new DataApp("DATA");
		ServiceApp sA = new ServiceApp("SRC");

		String comName = cA.getName();
		System.out.println("  COM NAME: " + comName);

		String dataName = dA.getName();
		System.out.println("  DAT NAME: " + dataName);

		String srcName = sA.getName();
		System.out.println("  SRC NAME: " + srcName);
	}
}
