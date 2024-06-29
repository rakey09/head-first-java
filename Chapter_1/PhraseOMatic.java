package test;

public class PhraseOMatic {

	public static void main(String[] args) {
		String[] wordListOne = { "agnostic", "opinionated", 
			"voice activated", "haptically driven", "extensible", 
			"reactive", "agent based", "functional", "AI enabled", 
			"strongly typed"};
		
		String[] wordListTwo = { "loosely coupled", "six sigma", 
				"asynchronous", "event driven", "pub-sub", "IoT", 
				"cloud native", "service oriented", "containerized",
				"serverless", "microservices", "distributed ledger"};
		
		String[] wordListThree = { "framework", "library", 
				"DSL", "REST API", "repository", "pipeline", 
				"service mesh", "architecture", "perspective", 
				"design", "orientation" };
		
		int oneLenght = wordListOne.length-1;
		int twoLenght = wordListTwo.length-1;
		int threeLenght = wordListThree.length-1;
		
		java.util.Random randomGenerator = new java.util.Random();
		int rand1 = randomGenerator.nextInt(oneLenght);
		int rand2 = randomGenerator.nextInt(twoLenght);
		int rand3 = randomGenerator.nextInt(threeLenght);
		
		String phase = wordListOne[rand1]+" "+ wordListOne[rand2]+" "+ wordListOne[rand3];
		
		System.out.println("What We need this "+phase);
		
		

   

	}

}
