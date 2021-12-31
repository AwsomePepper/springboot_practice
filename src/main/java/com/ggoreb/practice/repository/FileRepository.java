package com.ggoreb.practice.repository;

import com.ggoreb.practice.model.FileAtch;
import com.ggoreb.practice.model.Question;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileAtch, Long>{
    FileAtch findByQuestion(Question question);
    
}
