package server.oauth2_wos.global.oauth.kako;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import server.oauth2_wos.global.oauth.common.OAuthLoginParams;
import server.oauth2_wos.global.oauth.common.OAuthProvider;

@Getter
@NoArgsConstructor
public class KakaoLoginParams implements OAuthLoginParams { // 카카오 API 요청에 필요한 authorizationCode를 가지고 있는 클래스

    private String authorizationCode;

    @Override
    public OAuthProvider oAuthProvider() {
        return OAuthProvider.KAKAO;
    }

    @Override
    public MultiValueMap<String, String> makeBody() {
        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
        body.add("code", authorizationCode);
        return body;
    }
}
