package com.neo.karmapath.mapper;

import com.neo.karmapath.dto.*;
import com.neo.karmapath.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AppMapper {
    // Entity to DTO conversions
    UserDTO toUserDTO(User user);
    TopicDTO toTopicDTO(Topic topic);
    ChapterDTO toChapterDTO(Chapter chapter);
    QuestionDTO toQuestionDTO(Question question);
    NoteDTO toNoteDTO(Note note);

    // DTO to Entity conversions
    @Mapping(target = "id", ignore = true) // Ignore ID when creating new entity
    @Mapping(target = "topics", ignore = true) // Ignore topics when creating new entity
    @Mapping(target = "createdAt", ignore = true) // Ignore createdAt when creating new entity
    @Mapping(target = "updatedAt", ignore = true) // Ignore updatedAt when creating new entity
    User toUserEntity(UserRequestDTO dto);

//    @Mapping(target = "id", ignore = true)
//    Topic toTopicEntity(TopicRequestDTO dto);
//
//    @Mapping(target = "id", ignore = true)
//    Chapter toChapterEntity(ChapterRequestDTO dto);
//
//    @Mapping(target = "id", ignore = true)
//    Question toQuestionEntity(QuestionRequestDTO dto);
//
//    @Mapping(target = "id", ignore = true)
//    Note toNoteEntity(NoteRequestDTO dto);
}
