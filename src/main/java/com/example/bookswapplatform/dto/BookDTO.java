package com.example.bookswapplatform.dto;

import com.example.bookswapplatform.entity.Book.Author;
import com.example.bookswapplatform.entity.Book.BookImage;
import com.example.bookswapplatform.utils.DateTimeUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private UUID id;
    private String title;
    private String description;
    private String publisher;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATE_FORMAT)
    private LocalDate publishedDate;
    private String isbn;
    private String language;
    private int pageCount;
    private boolean isDone;
    private Set<String> authors;
    private Set<String> image;
    private String mainCategory;
    private String subCategory;
    private String subSubCategory;
    private BigDecimal price;
    private int newPercent;
    private UUID postId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATETIME_FORMAT)
    private LocalDateTime createDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATETIME_FORMAT)
    private LocalDateTime updateDate;
    private String createBy;
    private String updateBy;

}
