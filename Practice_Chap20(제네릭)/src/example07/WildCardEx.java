package example07;

import java.util.Arrays;

public class WildCardEx {
	
	//?는 어떠한 객체도 다 받겠다는 뜻
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));		
	}
	
	//Student이거나 Student를 상속받는 클래스(하위클래스들만 들어올 수 있다.)
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));		
	}
	
	//Worker클래스이거나 상위클래스들만 들어올 수 있다.
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));		
	}

	public static void main(String[] args) {
		registerCourse(new Course<Person>("일반인 과정", 5));
		registerCourse(new Course<Student>("학생 과정", 10));
		registerCourse(new Course<Worker>("직장인 과정", 8));
		registerCourse(new Course<HighStudent>("고등학생 과정", 7));
		
		System.out.println();
		
		//registerCourseStudent(new Course<Person>("일반인 과정", 5));
		registerCourseStudent(new Course<Student>("학생 과정", 10));
		//registerCourseStudent(new Course<Worker>("직장인 과정", 8));
		registerCourseStudent(new Course<HighStudent>("고등학생 과정", 7));
		
		System.out.println();
		
		registerCourseWorker(new Course<Person>("일반인 과정", 5));
		//registerCourseWorker(new Course<Student>("학생 과정", 10));
		registerCourseWorker(new Course<Worker>("직장인 과정", 8));
		//registerCourseWorker(new Course<HighStudent>("고등학생 과정", 7));

	}

}
