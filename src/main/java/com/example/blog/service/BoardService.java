package com.example.blog.service;

import com.example.blog.dto.BoardDTO;
import com.example.blog.dto.PageRequestDTO;
import com.example.blog.dto.PageResponseDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);

    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);

}
