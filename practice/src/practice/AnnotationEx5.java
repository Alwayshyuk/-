package practice;

import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111")		//유효하지 않은 애너테이션은 무시된다.
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd="220309", hhmmss = "191930"))

public class AnnotationEx5 {

	public static void main(String[] args) {
		//AnnotationEx5의 class 객체를 얻는다.
		Class<AnnotationEx5> cls = AnnotationEx5.class;
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
		System.out.println(anno.testedBy());				//aaa
		System.out.println(anno.testDate().yymmdd());		//220309
		System.out.println(anno.testDate().hhmmss());		//191930
		
		for(String str : anno.testTools())
			System.out.println(str);						//JUnit
		
		//AnnotationEx5에 적용된 모든 애너테이션을 가져온다.
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr)
			System.out.println(a);
		//@java.lang.Deprecated(forRemoval=false, since="")
		//@tmp.TestInfo(count=1, testType=FIRST, testTools={"JUnit"}, testedBy="aaa", testDate=@tmp.DateTime(yymmdd="220309", hhmmss="191930"))
	}
}
@Retention(RetentionPolicy.RUNTIME)		//실행 시에 사용가능하도록 지정
@interface TestInfo {
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}
@Retention (RetentionPolicy.RUNTIME)	//실행 시에 사용가능하도록 지정
@interface DateTime {
	String yymmdd();
	String hhmmss();
}
enum TestType {FIRST, FINAL}