package com.jgji.blog.code;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Slf4j
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BookRequest {

    private Long isbn;
    private String title;
    private String author;
    private String translator;
    private String publisher;
    private int price;

    @JsonCreator
    @Builder
    public BookRequest(long isbn, String title, String author, String translator, String publisher, int price) {
        log.info("여기타고 생성이 될까요?");

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.translator = translator;
        this.publisher = publisher;
        this.price = price;
    }
}
