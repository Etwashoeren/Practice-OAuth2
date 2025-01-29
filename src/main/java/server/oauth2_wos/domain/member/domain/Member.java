package server.oauth2_wos.domain.member.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import server.oauth2_wos.global.oauth.common.OAuthProvider;

@Entity
@Data
@NoArgsConstructor
public class Member {// 회원 정보를 담는 엔티티

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String nickname;

    @Enumerated(EnumType.STRING)
    private OAuthProvider oAuthProvider;

    @Builder
    public Member(String email, String nickname, OAuthProvider oAuthProvider) {
        this.email = email;
        this.nickname = nickname;
        this.oAuthProvider = oAuthProvider;
    }

}
