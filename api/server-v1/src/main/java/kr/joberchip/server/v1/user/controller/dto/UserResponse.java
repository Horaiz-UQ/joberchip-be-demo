package kr.joberchip.server.v1.user.controller.dto;

import kr.joberchip.core.user.User;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@ToString
public class UserResponse {

    @NotEmpty
    private Long userId;
    @NotEmpty
    private String username;

    public UserResponse(User user) {
        this.userId = user.getUserId();
        this.username = user.getUsername();
    }

}
