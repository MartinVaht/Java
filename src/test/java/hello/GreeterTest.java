package hello;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


public class GreeterTest {

	@Mock
	private Counter testcount ;


	@InjectMocks
	private Greeter greeter ;


	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		}


	@Test
	public void normaalneTere() {

		when(testcount.CountLugeja("Peeter")).thenReturn(6);

		String tulemus = greeter.ytleTere("Peeter");

		assertEquals("Hello world!", tulemus);
	}




}



