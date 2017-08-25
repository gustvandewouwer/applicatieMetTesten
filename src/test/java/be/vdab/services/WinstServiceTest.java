package be.vdab.services;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import be.vdab.repositories.KostRepository;
import be.vdab.repositories.KostRepositoryStub;
import be.vdab.repositories.OpbrengstRepository;
import be.vdab.repositories.OpbrengstRepositoryStub;

public class WinstServiceTest {

	private KostRepository kostRepository;
	private OpbrengstRepository opbrengstRepository;
	private WinstService winstService;

	@Before
	public void before() {
		kostRepository = new KostRepositoryStub();
		opbrengstRepository = new OpbrengstRepositoryStub();
		winstService = new WinstService(opbrengstRepository, kostRepository);
	}

	@Test
	public void findWinst() {
		assertEquals(0, BigDecimal.valueOf(150).compareTo(winstService.getWinst()));
	}}
