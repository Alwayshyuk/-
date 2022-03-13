package practice;

public class ThreadEx9 {

	public static void main(String[] args) {
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		
		//ThreadGroup(ThreadGroup parent, String name)
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "subGroup1");
		
		grp1.setMaxPriority(3);	//쓰레드 그룹grp1의 최대우선순위를 3으로 변경.
		
		Runnable r = new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {}
			}
		};
		//Thread(ThreadGroup tg, Runnable r, String name)
		new Thread(grp1, r, "th1").start();
		new Thread(subGrp1, r, "th2").start();
		new Thread(grp2, r, "th3").start();
		
		System.out.println(main.getName());			//main
		System.out.println(main.activeGroupCount());	//3
		System.out.println(main.activeCount());		//4
		main.list();
//		java.lang.ThreadGroup[name=main,maxpri=10]
//			    Thread[main,5,main]
//			    java.lang.ThreadGroup[name=Group1,maxpri=3]
//			        Thread[th1,3,Group1]
//			        java.lang.ThreadGroup[name=subGroup1,maxpri=3]
//			            Thread[th2,3,subGroup1]
//			    java.lang.ThreadGroup[name=Group2,maxpri=10]
//			        Thread[th3,5,Group2]
	}
}
