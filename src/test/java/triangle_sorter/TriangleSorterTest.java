package triangle_sorter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Before;
import org.junit.Test;

public class TriangleSorterTest {

	private TriangleSorter underTest;

	@Before
	public void setup() {
		underTest = new TriangleSorter();
	}

	@Test
	public void threeEqualSidesIsAnEquilateralTriangle() {
		String triangleType = underTest.analyze(3, 3, 3);
		assertThat(triangleType, is("Equilateral"));
	}
	@Test
	public void equilateralTriangle() {
		String triangleType = underTest.analyze(2, 2, 2);
		assertThat(triangleType, is("Equilateral"));
	}

	@Test
	public void testingIsosceles() {
		String triangleType = underTest.analyze(3, 3, 2);
		assertThat(triangleType, is("Isosceles"));
	}
	@Test
	public void testingIsoscelesTake2() {
		String triangleType = underTest.analyze(3, 2, 3);
		assertThat(triangleType, is("Isosceles"));	
	}

	@Test
	public void testingRight() {
		String triangleType = underTest.analyze(3, 4, 5);
		assertThat(triangleType, is("Right"));
	}
	
	@Test
	public void testingNotATriangle() {
		String triangleType = underTest.analyze(3,  5,  9);
		assertThat(triangleType, is("Not A Triangle"));
	}
	
	@Test
	public void otherTriangle () {
		String triangleType = underTest.analyze(2,3, 4);
		assertThat(triangleType, is("Other Triangle"));
	}
	
	@Test 
	public void otherTriangleTakeTwo () {
		String triangleType = underTest.analyze(4, 6, 8);
		assertThat(triangleType, is("Other Triangle"));
	}
}
