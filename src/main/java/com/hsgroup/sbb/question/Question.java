package com.hsgroup.sbb.question;

import java.time.LocalDateTime;
import java.util.List;

import com.hsgroup.sbb.answer.Answer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity //
public class Question {
    @Id // 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 데이터를 저장할 때 해당 속성에 값을 따로 세팅하지 않아도 자동씩 1증가 저장
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}