public class Movie {
	private String title;
	private int releaseYear;
	private final static int DEFAULT_YEAR = 2015;
	
	public Movie(String title, int releaseYear) {
		this.title = title;
		this.releaseYear = releaseYear;
	}

	public Movie(String title) {
		this.title = title;
		this.releaseYear = DEFAULT_YEAR; 
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setReleaseYear(int releaseYear) {
		if (releaseYear > 0) {
			this.releaseYear = releaseYear;
		}
	}
	
	public int getReleaseYear() {
		return releaseYear;
	}
	
	@Override
	public String toString() {
		return "Title: " + title + " Release Year: " + releaseYear;
	}
	
	@Override
	public boolean equals(Object otherMovie) {
		if (otherMovie instanceof Movie) {
			Movie myMovie = (Movie) otherMovie;
			return this.title == myMovie.title && this.releaseYear == myMovie.releaseYear;
		} else {
			return false;
		}
	}
	
//	@Override
//	public boolean equals(Object other)
//	{	
//		if (other instanceof Student) {
//			Student myStudent = (Student) other;
//			return this.studentID == myStudent.studentID;
//		} else {
//			return false;
//		}	
//	}
}

