package chapter_5;

public class SimpleStartup {
	private int[] locationCells;
	private int numOfHits = 0;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}
	
	public String checkYourself(int guess) {
		String result ="Miss";
		for(int cell : locationCells) {
			if(guess == cell) {
				result = "Hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits == locationCells.length) {
			result = "Kill";
		}
		System.out.println(result);
		return result;
	}

}
