package com.neo.karmapath.model;

import com.neo.karmapath.model.enums.Priority;
import com.neo.karmapath.model.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "questions")
public class Question extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;   // e.g., "Two Sum"
    private String link;

    @Enumerated(EnumType.STRING)// URL to LeetCode/GFG
    private Status status;  // e.g., "Pending", "Solved"

    @Enumerated(EnumType.STRING)
    private Priority priority;  // LOW, MEDIUM, HIGH

    @ManyToOne
    @JoinColumn(name = "chapter_id", nullable = false)
    private Chapter chapter;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Note> notes;
}