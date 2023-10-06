

public class Singleton {
    int count = 0;
    
    public static class SingletonHolder {
		public static final Singleton HOLDER_INSTANCE = new Singleton();
	}
		
	public static Singleton getInstance() {
		return SingletonHolder.HOLDER_INSTANCE;
	}

    public int get_count() {
        return this.count;
    }

    public int add_to_count(int number) {
        this.count += number;

        return this.count;
    }
}
