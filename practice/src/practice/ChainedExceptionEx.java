/*
 * 자바의 정석 예제 8-23
 * 2022-02-12 02:57
 * 
*/

package practice;

public class ChainedExceptionEx {

	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	static void install() throws InstallException{
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException s) {
			InstallException ie = new InstallException("설치 중 예외발생s");
			ie.initCause(s);
			throw ie;
		}catch ( MemoryException m) {
			InstallException ie = new InstallException("설치 중 예외 발생m");
			ie.initCause(m);
			throw ie;
		}finally {
			deleteTempFiles();
		}
	}
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("공간 부족");
		if(!enoughMemory())
			throw new MemoryException("메모리 부족");
		// throw new RuntimeException(new MemoryException("메모리 부족"));
		
	}
	static void copyFiles() {
		
	}
	static void deleteTempFiles() {
		
	}
	static boolean enoughSpace() {
		return false;
	}
	static boolean enoughMemory() {
		return true;
	}
}
class InstallException extends Exception{
	InstallException (String msg){
		super(msg);
	}
}
class SpaceException extends Exception{
	SpaceException (String msg){
		super(msg);
	}
}
class MemoryException extends Exception{
	MemoryException (String msg){
		super(msg);
	}
}