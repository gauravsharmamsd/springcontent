package property;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private  String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Value("${oracleUser}")
	private  String username;
	@Value("${oraclePassword}")
	private  String password;
	@Value("${oracleDriver}")
	private  String driverClassName;
	public void A(){
		System.out.println();
		System.out.println(username);
		System.out.println(password);
		System.out.println(driverClassName);
	}
}
