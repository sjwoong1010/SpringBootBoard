package com.sjw.app.controller;

import com.sjw.app.domain.Board;
import com.sjw.app.repository.BoardRepository;
import com.sjw.app.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class indexController {

    private BoardRepository boardRepository;
    private UserRepository userRepository;

    public indexController(BoardRepository boardRepository, UserRepository userRepository) {
        this.boardRepository = boardRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Board> boardList = boardRepository.findAll();
        model.addAttribute("boardList", boardList);
        boardList.forEach(System.out::println);
        return "index";
    }
}
