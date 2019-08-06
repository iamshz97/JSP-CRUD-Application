package data;

public class SingletonDB {

private static final database instance = new database();
    
    private SingletonDB() {
    }
    
    public static database getInstance(){
        return instance;
    }
	
}
