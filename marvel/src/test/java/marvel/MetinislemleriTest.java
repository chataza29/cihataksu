package marvel;

import  org.junit.*;


public class MetinislemleriTest {

	@Test
	public void testBuyukHarf() {
		String sonuc = Metinislemleri
				.buyukHarf("cihat");
		Assert.assertEquals("CÝHAT",sonuc);
	}

}
