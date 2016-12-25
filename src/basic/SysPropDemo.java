package basic;

import java.io.IOException;
public class SysPropDemo {
	public static void main(String[] argv) throws IOException {
		if (argv.length == 0)
			// BEGIN sysprops
			System.getProperties().list(System.out);
			// END sysprops
		else {
			for (String s : argv) {
				System.out.println(s + " = " + 
					System.getProperty(s));
			}
		}
	}
}

/*
output
==================
-- listing properties --
java.runtime.name=Java(TM) SE Runtime Environment
sun.boot.library.path=C:\Program Files\Java\jdk1.8.0_101\jr...
java.vm.version=25.101-b13
java.vm.vendor=Oracle Corporation
java.vendor.url=http://java.oracle.com/
path.separator=;
java.vm.name=Java HotSpot(TM) 64-Bit Server VM
file.encoding.pkg=sun.io
user.script=
user.country=US
sun.java.launcher=SUN_STANDARD
sun.os.patch.level=
java.vm.specification.name=Java Virtual Machine Specification
user.dir=D:\SmlCodes\workspace\JavaExamples
java.runtime.version=1.8.0_101-b13
java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment
java.endorsed.dirs=C:\Program Files\Java\jdk1.8.0_101\jr...

*/

