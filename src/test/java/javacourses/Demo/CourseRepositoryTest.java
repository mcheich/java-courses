package javacourses.Demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.Set;

import org.junit.jupiter.api.Test;

class CourseRepositoryTest {

	@Test
	void getCourseMapReturns1CourseFromMap() {
		// Arrange
		CourseRepository underTest = new CourseRepository();
		// Act
		underTest.addCourses();
		Course actual = underTest.getCourse("spring");
		// Assert
		assertTrue(actual instanceof Course);
	}

	@Test
	void getCourseMapReturnsCourseWithIdSpring() {
		// Arrange
		CourseRepository underTest = new CourseRepository();
		// Act
		underTest.addCourses();
		String actual = underTest.getCourse("spring").getId();
		// Assert
		assertEquals("spring", actual);
	}

	@Test
	void getCourseCollectionReturnsCollectionOfSize3() {
		// Arrange
		CourseRepository underTest = new CourseRepository();
		// Act
		underTest.addCourses();
		int actual = underTest.getCourseCollection().size();
		// Assert
		assertEquals(3, actual);
	}

}
