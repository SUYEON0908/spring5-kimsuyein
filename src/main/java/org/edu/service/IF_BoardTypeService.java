package org.edu.service;

import org.edu.vo.BoardTypeVO;

public interface IF_BoardTypeService {

	BoardTypeVO view_board_type(String board_type) throws Exception;

	void update_board_type(BoardTypeVO boardTypeVO) throws Exception;

	void insert_board_type(BoardTypeVO boardTypeVO) throws Exception;

	void delete_board_type(String board_type) throws Exception;

}
