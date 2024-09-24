package com.taskmanager.service;

import com.taskmanager.model.Comment;
import com.taskmanager.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public Comment addComment(Comment comment){
        return commentRepository.save(comment);
    }

    public Optional<Comment> getCommentById(Long id){
        return commentRepository.findById(id);
    }
}
