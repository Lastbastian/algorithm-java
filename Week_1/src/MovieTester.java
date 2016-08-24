
public class MovieTester {
	public static void main(String[] args) {

		Movie [] someMovies = new Movie[4];
		
		someMovies[0] = new Movie("Terminator", 1982);
		someMovies[1] = new Movie("Dune", 1984);
		someMovies[2] = new Documentary("Why?", 2016, "The answers to everything.");
		someMovies[3] = new Documentary("What?", 2000);
		
		for (Object movie : someMovies) {
		    System.out.println(movie);
		}
	}
}
