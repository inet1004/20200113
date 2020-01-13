package co.micol.board.app;

import java.sql.SQLException;

import co.micol.board.dto.BoardDto;
import co.micol.board.serviceImpl.BoardServiceImpl;

public class MainApp {

	public static void main(String[] args) throws SQLException {

		BoardServiceImpl board = new BoardServiceImpl();
		board.defaultTest(); // default메소드 서비스에서
		BoardDto dto = new BoardDto();
		dto.setBoard_id(1);  // 아이디에만 값을 담아 셀렉트 하러 가게됨
		dto=board.select(dto);  // dto 타입 리턴해줌
		dto.toString();
	}

}
