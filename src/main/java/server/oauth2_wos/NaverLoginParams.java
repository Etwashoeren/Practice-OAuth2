package server.oauth2_wos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@Getter
@NoArgsConstructor
public class NaverLoginParams implements OAuthLoginParams{
    private String authorizationCode;
    private String state; // 네이버는 state값도 필요

    @Override
    public OAuthProvider oAuthProvider() {
        return OAuthProvider.NAVER;
    }

    @Override
    public MultiValueMap<String, String> makeBody() {
        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();

        body.add("code", authorizationCode);
        body.add("state", state);

        return body;
    }
}
