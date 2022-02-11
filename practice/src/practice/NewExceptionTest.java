/*
 * 자바의 정석 예제 8-21
 * 2022-02-12 02:11
 * 
 *	 error message : 설치 공간 부족
		practice.SpaceException: 설치 공간 부족
		at practice.NewExceptionTest.startInstall(NewExceptionTest.java:25)
		at practice.NewExceptionTest.main(NewExceptionTest.java:8)
	space check and retry plz 

 */





package practice;

public class NewExceptionTest {

	public static void main(String[] args) {
		
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("error message : " + e.getMessage());
			e.printStackTrace();
			System.out.println("space check and retry plz");
		}catch ( MemoryException m) {
			System.out.println("error message : " + m.getMessage());
			m.printStackTrace();
			System.gc();  // Garbage Collection을 수행하여 메모리를 늘려준다.
			System.out.println("plz retry");
			
		}

	}
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("설치 공간 부족");
		}
		if(!enoughMemory()) {
			throw new MemoryException("설치 메모리 부족");
		}
	}
	static void copyFiles() {
		//파일 복사 코드
	}
	static void deleteTempFiles(){
		//임시 파일 삭제 코드
	}
	static boolean enoughSpace() {
		return false;
	}
	static boolean enoughMemory() {
		return true;
	}
}

class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}
class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}