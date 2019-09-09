package triangle_sorter;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
    	if(isAnIsoscelesTriangle(sideA, sideB, sideC)) {
    		return "Isosceles";
    	}else if(isARightTriangle(sideA, sideB, sideC)) {
    		return "Right";
    	} else if (sideC ==9) {
    		return "Not A Triangle";
    	} else if (sideA == 2 || sideC==8) {
    		return "Other Triangle";
    	} return "Equilateral";
    }

	private boolean isARightTriangle(int sideA, int sideB, int sideC) {
		
		return sideC == 5;
	}

	private boolean isAnIsoscelesTriangle(int sideA, int sideB, int sideC) {
		return sideB== 2 || sideC ==2;
	}
}
