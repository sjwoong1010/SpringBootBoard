package com.sjw.app.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "user")
@Entity
public class Board {
    @Id
    @GeneratedValue
    private Long Idx;

    private String title;
    private String subTitle;
    private String content;

    @Enumerated(EnumType.STRING)
    private BoardType boardType;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;
}
