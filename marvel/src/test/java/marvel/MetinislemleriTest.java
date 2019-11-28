package marvel;

import  org.junit.*;


public class MetinislemleriTest {

	@Test
	public void testBuyukHarf() {
		String sonuc = Metinislemleri
				.buyukHarf("chat");
		Assert.assertEquals("CHAT",sonuc);
	}

}
