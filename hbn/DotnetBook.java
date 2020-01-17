package hbn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
	

	@Entity
	@DiscriminatorValue(value="Dotnet")
	public class DotnetBook extends Book {
	private int cd;

	public int getCd() {
	return cd;
	}

	public void setCd(int cd) {
	this.cd = cd;
	}
}
