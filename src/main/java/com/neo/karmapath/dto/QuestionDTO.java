package com.neo.karmapath.dto;

import com.neo.karmapath.model.enums.Priority;
import com.neo.karmapath.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDTO {
    private Long id;
    private String title;
    private String link;
    private Status status;
    private Priority priority;
    private List<NoteDTO> notes;
}
