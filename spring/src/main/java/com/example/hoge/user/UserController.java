package com.example.hoge.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hoge.dao.book.BookSearchDao;
import com.example.hoge.dao.book.BookSearchEntity;
import com.example.hoge.dao.book.BookSearchParams;
import com.example.hoge.dao.user.UserSearchDao;
import com.example.hoge.dao.user.UserSearchEntity;
import com.example.hoge.dao.user.UserSearchParams;
import com.example.hoge.service.SearchService;

@Service
class UserSearchService extends SearchService<UserSearchDao, UserSearchEntity, UserSearchParams> {
}

@Service
class BookSearchService extends SearchService<BookSearchDao, BookSearchEntity, BookSearchParams> {
}

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserSearchService xxx;

	@Autowired
	private BookSearchService yyy;

	@GetMapping()
	@ResponseBody
	public String home() {

		List<BookSearchEntity> yy = yyy.search(new BookSearchParams(), 777);
		System.err.println(yy.size());

		List<UserSearchEntity> xx = xxx.search(new UserSearchParams(), 888);
		System.err.println(xx.size());

		UserSearchParams params = new UserSearchParams();
		params.setName("吉田");
		int userNumber = userService.findAll().size();

		return "こんなどうでもいい仕事に時間を使っている場合ではない:" + String.valueOf(userNumber);
	}

	@GetMapping("/create")
	@ResponseBody
	public String create() {
		return "登録";
	}

	@GetMapping("/read")
	@ResponseBody
	public String read() {
		return "表示";
	}

	@GetMapping("/update")
	@ResponseBody
	public String update() {
		return "更新";
	}

	@GetMapping("/delete")
	@ResponseBody
	public String delete() {
		return "消去";
	}

	@GetMapping("jojo")
	public String jojo() {
		return "home";
	}
}
