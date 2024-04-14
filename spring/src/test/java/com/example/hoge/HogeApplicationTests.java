package com.example.hoge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HogeApplicationTests {

	@Test
	void 日本語表記のメソッド名() {

		assertEquals("0", "0");
	}

}
