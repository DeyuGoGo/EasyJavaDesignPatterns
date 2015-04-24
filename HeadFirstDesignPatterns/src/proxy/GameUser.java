package proxy;



public class GameUser implements User{
	
	private String Name , Password;
	
	public GameUser(String name , String Password){
		this.Name = name;
		this.Password = Password;
	}
	@Override
	public void setName(String name) {
		this.Name = name;
	}
	@Override
	public String getName() {
		return Name;
	}
	@Override
	public void setPassword(String password) {
		this.Password = password;
	}
	@Override
	public String getPassword() {
		return Password;
	}
	
}
