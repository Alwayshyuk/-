package loop;

public class Ex9_3 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
			path = path.concat(fullPath.substring(0, 14));
			fileName = fileName.concat(fullPath.substring(15));
		
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}
}
