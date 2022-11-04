package com.amul.testng;

import org.testng.annotations.Test;

public class GroupsConcept {
	@Test(groups = "smoke")
	public void t1() {
		System.out.println("smoke");
	}

	@Test(groups = "smoke")
	public void t2() {
		System.out.println("smoke");
	}

	@Test(groups = { "smoke", "sanity" })
	public void t3() {
		System.out.println("smoke\",\"sanity");
	}

	@Test(groups = { "windows" })
	public void t4() {
		System.out.println("windows");
	}
}
