package com.nash.bulletinboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
  private Long id;
  private Article article;    // article (ID)
  private String content;     // content

  private LocalDateTime createAt;   // created date
  private String createBy;          // created by whom
  private LocalDateTime modifiedAt; // modified date
  private String modifiedBy;        // modified by whom
}
