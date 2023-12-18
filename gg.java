import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class tttttttest {
	public tttest obj;
	
	
	public void init() {
		obj = new tttest();
		
	}
	
	public void tc01() {
		assertEquals(4,obj.countLetterA(1,3));
	}
	
	public void tc02() {
		assertEquals(2,obj.countLetterA(0,2));
	}
    
	public void tc03() {
		asserEquals(7,obj. checkTwoLetter(3,4));
	}
	
	public void ts04() {
		asserEquals(3,obj. checkTwoLetter(0,3));
	}
}
