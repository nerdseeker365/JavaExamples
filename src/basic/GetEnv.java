package basic;

public class GetEnv {
	public static void main(String[] argv) {
		System.out.println("System.getenv(\"PATH\") = " + System.getenv("PATH"));
	}
}

/*
output
==================
System.getenv("PATH") = C:/Program Files/Java/jre1.8.0_77/bin/server;C:/Program Files/Java/jre1.8.0_77/bin;C:/Program Files/Java/jre1.8.0_77/lib/amd64;C:\ProgramData\Oracle\Java\javapath;C:\windows\system32;C:\windows;C:\windows\System32\Wbem;C:\windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Git\cmd;C:\Program Files\nodejs\;D:\MongoDB\bin;D:\apache-maven-3.3.9\bin;C:\Program Files\Java\jdk1.8.0_101\bin;;D:\Softwares\eclipse;


*/
