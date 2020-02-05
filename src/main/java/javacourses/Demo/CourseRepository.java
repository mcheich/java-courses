package javacourses.Demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CourseRepository {

	private Map<String, Course> courseRepo = new HashMap<String, Course>();
	/*
	 * :MIKEQ: I tried adding something to the map here, but couldn't do it. Not
	 * sure exactly why that is.
	 */
	private Course spring = new Course("spring", "Spring Framework", "Spring Framework Description");
	private Course java = new Course("java", "Core Java", "Core Java Description");
	private Course javascript = new Course("javascript", "Intro to Javascript", "Javascript Description");

	public void addCourses() {
		courseRepo.put("spring", this.spring);
		courseRepo.put("java", this.java);
		courseRepo.put("javascript", this.javascript);
	}

	public Course getCourse(String key) {

		Course course = courseRepo.get(key);
		return course;
	}

	public Collection<Course> getCourseCollection() {
		
		return this.courseRepo.values();
	}

}
