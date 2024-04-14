package com.example.hoge.user;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

// クラスを右クリックで新規テストでなぜかうまく出来てしまったjpiterだからか?

@SpringBootTest
class OmoroTest {

	// こういう風にテストにも引数をとれる
	@ParameterizedTest
	@CsvSource({
		"1, 1, 2",
		"2, 3, 5",
		"1, 5, 6",
		"1, 2, 3"
	})
	void テストクラスの中でAutowiredしたい(int a, int b, int expected) {
		int x = a + b;
		assertEquals(expected, x);
	}
}