package com.neo.karmapath.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private String gfgId;
    private String leetcodeId;
    private String codeforcesId;
    private String githubId;
    private List<TopicDTO> topics;
}
