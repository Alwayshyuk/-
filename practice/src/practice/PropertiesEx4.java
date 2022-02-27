package practice;
import java.util.*;
import java.io.*;
public class PropertiesEx4 {

	public static void main(String[] args) {
		Properties sysProp = System.getProperties();
		System.out.println(sysProp.getProperty("java.version"));
		System.out.println(sysProp.getProperty("user.language"));
		sysProp.list(System.out);
	}
}
/*17.0.1
ko
-- listing properties --
java.specification.version=17
sun.cpu.isalist=amd64
sun.jnu.encoding=MS949
java.class.path=C:\Users\kojie\Downloads\class\github...
java.vm.vendor=Oracle Corporation
sun.arch.data.model=64
user.variant=
java.vendor.url=https://java.oracle.com/
java.vm.specification.version=17
os.name=Windows 10
sun.java.launcher=SUN_STANDARD
user.country=KR
sun.boot.library.path=C:\Program Files\Java\jdk-17.0.1\bin
sun.java.command=practice.PropertiesEx4
jdk.debug=release
sun.cpu.endian=little
user.home=C:\Users\kojie
user.language=ko
java.specification.vendor=Oracle Corporation
java.version.date=2021-10-19
java.home=C:\Program Files\Java\jdk-17.0.1
file.separator=\
java.vm.compressedOopsMode=32-bit
line.separator=

java.vm.specification.vendor=Oracle Corporation
java.specification.name=Java Platform API Specification
user.script=
sun.management.compiler=HotSpot 64-Bit Tiered Compilers
java.runtime.version=17.0.1+12-LTS-39
user.name=kojie
path.separator=;
os.version=10.0
java.runtime.name=Java(TM) SE Runtime Environment
file.encoding=UTF-8
java.vm.name=Java HotSpot(TM) 64-Bit Server VM
java.vendor.url.bug=https://bugreport.java.com/bugreport/
java.io.tmpdir=C:\Users\kojie\AppData\Local\Temp\
java.version=17.0.1
user.dir=C:\Users\kojie\Downloads\class\github...
os.arch=amd64
java.vm.specification.name=Java Virtual Machine Specification
sun.os.patch.level=
native.encoding=MS949
java.library.path=C:\Program Files\Java\jdk-17.0.1\bin;...
java.vm.info=mixed mode, sharing
java.vendor=Oracle Corporation
java.vm.version=17.0.1+12-LTS-39
sun.io.unicode.encoding=UnicodeLittle
java.class.version=61.0
 */