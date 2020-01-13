package co.micol.board.service;

import java.sql.SQLException;
import java.util.List;

import co.micol.board.dto.BoardDto;

public interface Service {
	
	default void defaultTest() {
		System.out.println("이것은 디폴트 지시자 메소드 테스트임.");  //인터페이스에서만 디폴트 사영가능
	}
	
	public List<BoardDto> allSelect() throws SQLException;
	public BoardDto select(BoardDto dto) throws SQLException;
	public int insert(BoardDto dto) throws SQLException;
	public int update(BoardDto dto) throws SQLException;
	public int delete(BoardDto dto) throws SQLException;
	
}
