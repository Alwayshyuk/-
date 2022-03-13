package practice;

import java.util.*;

public class ThreadEx11{
	
	public static void main(String args[]) throws Exception{
		ThreadEx11_1 t1 = new ThreadEx11_1("Thread1");
		ThreadEx11_2 t2 = new ThreadEx11_2("Thread2");
		t1.start();
		t2.start();
		
//		[1] name : Signal Dispatcher, group: system, damone: true
//
//		[2] name : Notification Thread, group: system, damone: true
//
//		[3] name : Thread1, group: main, damone: false
//		java.base@17.0.1/java.lang.Thread.sleep(Native Method)
//		app//tmp.ThreadEx11_1.run(ThreadEx11.java:20)
//
//		[4] name : Reference Handler, group: system, damone: true
//		java.base@17.0.1/java.lang.ref.Reference.waitForReferencePendingList(Native Method)
//		java.base@17.0.1/java.lang.ref.Reference.processPendingReferences(Reference.java:253)
//		java.base@17.0.1/java.lang.ref.Reference$ReferenceHandler.run(Reference.java:215)
//
//		[5] name : Attach Listener, group: system, damone: true
//
//		[6] name : Thread2, group: main, damone: false
//		java.base@17.0.1/java.lang.Thread.dumpThreads(Native Method)
//		java.base@17.0.1/java.lang.Thread.getAllStackTraces(Thread.java:1662)
//		app//tmp.ThreadEx11_2.run(ThreadEx11.java:30)
//
//		[7] name : Finalizer, group: system, damone: true
//		java.base@17.0.1/java.lang.Object.wait(Native Method)
//		java.base@17.0.1/java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:155)
//		java.base@17.0.1/java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:176)
//		java.base@17.0.1/java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:172)
//
//		[8] name : Common-Cleaner, group: InnocuousThreadGroup, damone: true
//		java.base@17.0.1/java.lang.Object.wait(Native Method)
//		java.base@17.0.1/java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:155)
//		java.base@17.0.1/jdk.internal.ref.CleanerImpl.run(CleanerImpl.java:140)
//		java.base@17.0.1/java.lang.Thread.run(Thread.java:833)
//		java.base@17.0.1/jdk.internal.misc.InnocuousThread.run(InnocuousThread.java:162)
	}
}

class ThreadEx11_1 extends Thread	{
	ThreadEx11_1(String name){
		super(name);
	}
	public void run() {
		try {
			sleep(5*1000);	//5초 기다린다.
		} catch (InterruptedException e) {}
	}
}

class ThreadEx11_2 extends Thread	{
	ThreadEx11_2(String name){
		super(name);
	}
	public void run() {
		Map map = getAllStackTraces();
		Iterator it = map.keySet().iterator();
		
		int x = 0;
		
		while(it.hasNext()) {
			Object obj = it.next();
			Thread t = (Thread)obj;
			StackTraceElement[] ste = (StackTraceElement[])(map.get(obj));
			
			System.out.println("["+ ++x + "] name : "+ t.getName() + ", group: " + t.getThreadGroup().getName()+", damone: "+ t.isDaemon());
			
			for(int i = 0; i<ste.length; i++) {
				System.out.println(ste[i]);
			}
			System.out.println();
		}
	}
}