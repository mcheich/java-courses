package javacourses.Demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CourseTest {

	@Test
	void courseTestCreatesObjectWithId() {
		// Arrange
		Course underTest = new Course("1", "", "");
		// Act
		String actual = underTest.getId();
		//Assert
		assertEquals("1", actual);
	}

	@Test
	void courseTestCreatesObjectWithName() {
		// Arrange
		Course underTest = new Course("", "test", "");
		// Act
		String actual = underTest.getName();
		//Assert
		assertEquals("test", actual);
	}

	@Test
	void courseTestCreatesObjectWithDescription() {
		// Arrange
		Course underTest = new Course("", "", "test");
		// Act
		String actual = underTest.getDescription();
		//Assert
		assertEquals("test", actual);
	}

}
