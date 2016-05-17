package flowcontrol.exception.assertion;

import java.io.Closeable;

public class MultipleExceptionExample {

	static class IOManip implements Closeable{
		@Override
		public void close() {
			throw new RuntimeException("from IOManip.close");
		}
	}
	
	public static void main(String[] args) {
		try(IOManip iomManip = new IOManip()){
			throw new RuntimeException("from try!");
		}
		catch(Exception e){
			throw new RuntimeException("from catch!");
		}finally{
//			throw new RuntimeException("from finally!");
		}
	}
}
