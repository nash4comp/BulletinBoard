package com.nash.bulletinboard.domain;

import java.time.LocalDateTime;

public class Article {
  private Long id;
  private String title;     // title
  private String content;   // contents
  private String hashtag;   // hashtag

  private LocalDateTime createAt;   // created date
  private String createBy;          // created by whom
  private LocalDateTime modifiedAt; // modified date
  private String modifiedBy;        // modified by whom
}
