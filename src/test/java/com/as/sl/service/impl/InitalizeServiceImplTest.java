package com.as.sl.service.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

import com.as.sl.SnakeLadderApp;

public class InitalizeServiceImplTest {

	@Test
	public void testInitializeGame() {
	    System.out.println("main");
	    String[] args = null;
	    final InputStream original = System.in;
	    String data = "2\n2\n10\n2\nakash\nabhi\n";
	    InputStream stream = new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
	    //final FileInputStream fips = new FileInputStream(new File("[path_to_file]"));
	    System.setIn(stream);
	    InitializeSerivceImpl service = new InitializeSerivceImpl();
	    service.initializeGame();
	    System.setIn(original);
	}
}
