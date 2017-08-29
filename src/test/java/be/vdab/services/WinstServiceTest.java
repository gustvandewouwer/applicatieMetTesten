package be.vdab.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import be.vdab.repositories.KostRepository;
import be.vdab.repositories.OpbrengstRepository;

public class WinstServiceTest {

	private KostRepository kostRepository;
	private OpbrengstRepository opbrengstRepository;
	private WinstService winstService;

	@Before
	public void before() {
//		kostRepository = new KostRepositoryStub();
//		opbrengstRepository = new OpbrengstRepositoryStub();

		kostRepository = mock(KostRepository.class);
		when(kostRepository.findTotaleKost()).thenReturn(BigDecimal.valueOf(234.56));
		
		opbrengstRepository = mock(OpbrengstRepository.class);
		when(opbrengstRepository.findTotaleOpbrengst()).thenReturn(BigDecimal.valueOf(345.67));
		
		winstService = new WinstService(opbrengstRepository, kostRepository);
	}

	@Test
	public void winstIsOpbrengstMinKost() {
		assertEquals(0, BigDecimal.valueOf(111.11).compareTo(winstService.getWinst()));
		verify(kostRepository).findTotaleKost();
		verify(opbrengstRepository).findTotaleOpbrengst();
	}}
